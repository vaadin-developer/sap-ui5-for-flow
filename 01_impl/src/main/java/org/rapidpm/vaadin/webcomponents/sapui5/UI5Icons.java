package org.rapidpm.vaadin.webcomponents.sapui5;

import java.util.Arrays;

public enum UI5Icons {

  NONE("sap-icon://none"),
  ADD_EQUIPMENT("sap-icon://add-equipment"),
  PHONE("sap-icon://phone");

  private String code;

  public String code() {
    return this.code;
  }

  public UI5Icon asUI5Icon() {
    final UI5Icon ui5Icon = new UI5Icon();
    ui5Icon.setSource(this);
    return ui5Icon;
  }

  public static UI5Icons fromCode(String code) {
    return Arrays.stream(UI5Icons.values())
                 .filter(i -> i.code.equals(code))
                 .findFirst()
                 .orElse(NONE);
  }

  UI5Icons(String code) {
    this.code = code;
  }
}
