package org.rapidpm.vaadin.webcomponents.sapui5;

import java.util.Arrays;

public enum UI5MessageStripType {
  INFORMATION("Information"), POSITIVE("Positive"), NEGATIVE("Negative"), WARNING("Warning");

  private final String attributeName;

  private UI5MessageStripType(String attributeValue) {
    this.attributeName = attributeValue;
  }

  public String getAttributeName() {
    return attributeName;
  }

  public static UI5MessageStripType fromAttributeName(String attributeName) {
    return Arrays.stream(UI5MessageStripType.values())
        .filter(i -> i.attributeName.equals(attributeName)).findFirst().orElse(null);
  }
}
