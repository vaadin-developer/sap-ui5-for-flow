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
package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Switch.*;

@Element(TAG_NAME)
public class UI5SwitchElement
    extends TestBenchElement {

  public void setTextOn(String value) {
    setProperty(ATTRIBUTE_TEXT_ON, value);
  }

  public String getTextOn() {
    return getPropertyString(ATTRIBUTE_TEXT_ON);
  }

  public void setTextOff(String value) {
    setProperty(ATTRIBUTE_TEXT_OFF, value);
  }

  public String getTextOff() {
    return getPropertyString(ATTRIBUTE_TEXT_OFF);
  }

  public void setCheckedOn() {
    setProperty(ATTRIBUTE_CHECKED, true);
  }

  public void setCheckedOff() {
    setProperty(ATTRIBUTE_CHECKED, false);
  }

  public boolean isCheckedOn() {
    return Boolean.parseBoolean(getPropertyString(ATTRIBUTE_CHECKED));
  }

  public void setGraphical(boolean active) {
    setProperty(ATTRIBUTE_GRAPHICAL, active);
  }
}
