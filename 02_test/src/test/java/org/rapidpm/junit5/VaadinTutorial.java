package org.rapidpm.junit5;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ExtendWith(ServletContainerExtension.class)
@ExtendWith(WebdriverExtension.class)
@ExtendWith(WebDriverParameterResolver.class)
//@EnabledIfEnvironmentVariable(named = "TESTBENCH", matches = "on")
public @interface VaadinTutorial {
  String packageToDeploy()default "org.rapidpm";
}
