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
