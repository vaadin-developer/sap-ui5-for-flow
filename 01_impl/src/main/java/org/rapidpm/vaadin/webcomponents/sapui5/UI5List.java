package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-list")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/List.js")
public class UI5List extends Component {
  protected static final String PROPERTY_HEADER_TEXT = "headerText";

  public UI5List() {
    super();
  }

  public UI5List(String headerText) {
    this();
    setHeaderText(headerText);
  }

  public UI5List(String headerText, UI5ListElement... listElements) {
    this();
    setHeaderText(headerText);
    for (UI5ListElement listElement : listElements) {
      addListElement(listElement);
    }
  }

  public String getHeaderText() {
    return getElement().getProperty(PROPERTY_HEADER_TEXT);
  }

  public void setHeaderText(String headerText) {
    if (headerText != null) {
      getElement().setProperty(PROPERTY_HEADER_TEXT, headerText);
    } else {
      getElement().removeProperty(PROPERTY_HEADER_TEXT);
    }
  }


  public void addListElement(UI5ListElement listElement) {
    getElement().appendChild(listElement.getElement());
  }
}
