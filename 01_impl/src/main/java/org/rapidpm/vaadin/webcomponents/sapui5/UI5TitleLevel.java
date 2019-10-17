package org.rapidpm.vaadin.webcomponents.sapui5;

import java.util.Arrays;

public enum UI5TitleLevel {
  H1("H1"), H2("H2"), H3("H3"), H4("H4"), H5("H5"), H6("H6");

  private final String attributeName;

  private UI5TitleLevel(String attributeName) {
    this.attributeName = attributeName;
  }

  public String getAttributeName() {
    return attributeName;
  }

  public static UI5TitleLevel fromAttributeName(String attributeName) {
    return Arrays.stream(UI5TitleLevel.values()).filter(i -> i.attributeName.equals(attributeName))
        .findFirst().orElse(null);
  }
}
