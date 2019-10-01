package org.rapidpm.vaadin.webcomponents.sapui5;

public enum UI5BusyIndiciatorType {
  SMALL("Small"), MEDIUM("Medium"), LARGE("Large");

  private final String attributeName;

  private UI5BusyIndiciatorType(String attributeName) {
    this.attributeName = attributeName;
  }

  public String getAttributeName() {
    return attributeName;
  }

}