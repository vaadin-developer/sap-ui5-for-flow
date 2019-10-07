package org.rapidpm.junit5;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.openqa.selenium.WebDriver;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.frp.Transformations;
import org.rapidpm.frp.functions.CheckedPredicate;
import org.rapidpm.frp.functions.CheckedSupplier;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;
import static org.rapidpm.frp.StringFunctions.notEmpty;
import static org.rapidpm.frp.StringFunctions.notStartsWith;
import static org.rapidpm.frp.Transformations.not;

public class WebDriverParameterResolver
    implements ParameterResolver, HasLogger {

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    final Class<?> type = parameterContext.getParameter()
                                          .getType();
    return GenericPageObject.class.isAssignableFrom(type);
  }

  @Override
  public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {

    final BrowserWebDriverContainer container = extensionContext.getStore(GLOBAL)
                                                                .get(BrowserWebDriverContainer.class.getSimpleName(),
                                                                     BrowserWebDriverContainer.class);


    final String  property = System.getProperty("os.name");
    final boolean osx      = property.contains("Mac OS X");

//    return new WebDriverInfo(container.getWebDriver(), (osx)
//                                                       ? "host.docker.internal"
//                                                       : localeIP().get(), container.getVncAddress());
    final Class<?> type = parameterContext.getParameter()
                                          .getType();

    try {
      final Constructor<?> declaredConstructor = type.getDeclaredConstructor(WebDriver.class, String.class,
                                                                             String.class);
      return declaredConstructor.newInstance((WebDriver) container.getWebDriver(), localeIP().get(),
                                             container.getVncAddress());
    } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
      logger().warning(e.getMessage());
    }
    throw new RuntimeException("no Page Object created");
//    return ReflectionUtils.newInstance(type, (WebDriver)container.getWebDriver(), localeIP().get(), container.getVncAddress());
//    return new GenericPageObject(container.getWebDriver(), localeIP().get(), container.getVncAddress());
  }

  public static class GenericPageObject {
    private WebDriver webdriver;
    private String    hostIpAddress;
    private String    vncAdress;

    public GenericPageObject(WebDriver webdriver, String hostIpAddress, String vncAdress) {
      this.webdriver     = webdriver;
      this.hostIpAddress = hostIpAddress;
      this.vncAdress     = vncAdress;
    }

    public WebDriver getWebdriver() {
      return webdriver;
    }

    public String getHostIpAddress() {
      return hostIpAddress;
    }

    public String getVncAdress() {
      return vncAdress;
    }
  }

  public static Supplier<String> localeIP() {
    return () -> {
      final CheckedSupplier<Enumeration<NetworkInterface>> checkedSupplier = NetworkInterface::getNetworkInterfaces;

      return Transformations.<NetworkInterface>enumToStream().apply(
          checkedSupplier.getOrElse(Collections::emptyEnumeration))
                                                             .filter(
                                                                 (CheckedPredicate<NetworkInterface>) NetworkInterface::isUp)
                                                             .map(NetworkInterface::getInetAddresses)
                                                             .flatMap(
                                                                 iaEnum -> Transformations.<InetAddress>enumToStream().apply(
                                                                     iaEnum))
                                                             .filter(inetAddress -> inetAddress instanceof Inet4Address)
                                                             .filter(not(InetAddress::isMulticastAddress))
                                                             .filter(not(InetAddress::isLoopbackAddress))
                                                             .map(InetAddress::getHostAddress)
                                                             .filter(notEmpty())
                                                             .filter(adr -> notStartsWith().apply(adr, "127"))
                                                             .filter(adr -> notStartsWith().apply(adr, "169.254"))
                                                             .filter(
                                                                 adr -> notStartsWith().apply(adr, "255.255.255.255"))
                                                             .filter(
                                                                 adr -> notStartsWith().apply(adr, "255.255.255.255"))
                                                             .filter(adr -> notStartsWith().apply(adr, "0.0.0.0"))
                                                             // .filter(adr -> range(224, 240).noneMatch(nr -> adr.startsWith(valueOf(nr))))
                                                             .findFirst()
                                                             .orElse("localhost");
    };
  }
}
