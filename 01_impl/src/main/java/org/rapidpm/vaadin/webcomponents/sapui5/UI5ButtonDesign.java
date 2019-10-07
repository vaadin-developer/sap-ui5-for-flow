package org.rapidpm.vaadin.webcomponents.sapui5;

import java.util.Arrays;

public enum UI5ButtonDesign {
  DEFAULT("Default"),
  EMPHASIZED("Emphasized"),
  POSITIVE("Positive"),
  NEGATIVE("Negative"),
  TRANSPARENT("Transparent");

  private final String attributeName;

  private UI5ButtonDesign(String attributeName) {
    this.attributeName = attributeName;
  }

  public String getAttributeName() {
    return attributeName;
  }

  public static UI5ButtonDesign fromAttributeName(String attributeName) {
    return Arrays.stream(UI5ButtonDesign.values())
                 .filter(i -> i.attributeName.equals(attributeName))
                 .findFirst()
                 .orElse(null);
  }
}
