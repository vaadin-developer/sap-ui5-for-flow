/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package junit.org.rapidpm.event.webcomponents.sapui5;

import com.vaadin.testbench.TestBenchTestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.junit5.VaadinTutorial;
import org.rapidpm.junit5.WebDriverParameterResolver;
import org.rapidpm.vaadin.webcomponents.sapui5.UI5SwitchElement;

import static java.lang.System.getProperty;
import static org.rapidpm.vaadin.nano.CoreUIServiceJava.CORE_UI_SERVER_PORT;
import static org.rapidpm.vaadin.webcomponents.sapui5.UI5SwitchView.*;

@VaadinTutorial()
public class UI5SwitchTest
    implements HasLogger {

  public static class UI5SwitchPO
      extends WebDriverParameterResolver.GenericPageObject {

    public UI5SwitchPO(WebDriver webdriver, String hostIpAddress, String vncAdress) {
      super(webdriver, hostIpAddress, vncAdress);
      testCase.setDriver(webdriver);
    }

    public void load(String url) {
      testCase.getDriver()
              .get(url);
    }

    private final TestBenchTestCase testCase = new TestBenchTestCase() { };

    public UI5SwitchElement ui5SwitchElement() {
      return testCase.$(UI5SwitchElement.class)
                     .first();
//                     .id(ID);
    }
  }

  @Test
  @Disabled
  void test001(UI5SwitchPO po) {
    final String url = "http://" + po.getHostIpAddress() + ":" + getProperty(CORE_UI_SERVER_PORT) + "/";
    logger().info("URL : " + url + NAV);
    po.load(url + NAV);

    final UI5SwitchElement element = po.ui5SwitchElement();
    final String           textOff = element.getTextOff();
    Assertions.assertEquals(TEXT_OFF, textOff);
    final String textOn = element.getTextOn();
    Assertions.assertEquals(TEXT_ON, textOn);


    Assertions.assertFalse(element.isCheckedOn());
    element.setCheckedOn();
    Assertions.assertTrue(element.isCheckedOn());

    element.setGraphical(true);
    element.setCheckedOff();

    Assertions.assertFalse(element.isCheckedOn());
    element.setCheckedOn();
    Assertions.assertTrue(element.isCheckedOn());

  }
}
