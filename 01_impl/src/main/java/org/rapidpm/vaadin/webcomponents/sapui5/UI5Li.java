package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-li")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/StandardListItem.js")
public class UI5Li extends Component implements UI5ListElement, HasText, HasUI5Icon, HasUI5IconEnd {
  protected static final String PROPERTY_INFO = "info";
  protected static final String PROPERTY_DESCRIPTION = "description";

  public UI5Li() {
    super();
  }

  public UI5Li(String text) {
    this();
    setText(text);
  }

  public UI5Li(String text, UI5Icons icon) {
    this();
    setText(text);
    setIcon(icon);
  }

  public UI5Li(String text, UI5Icons icon, String info, String description) {
    this();
    setText(text);
    setIcon(icon);
    setInfo(info);
    setDescription(description);
  }

  public void setInfo(String info) {
    if (info != null) {
      getElement().setProperty(PROPERTY_INFO, info);
    } else {
      getElement().removeProperty(PROPERTY_INFO);
    }
  }

  public String getInfo() {
    return getElement().getAttribute(PROPERTY_INFO);
  }

  public void setDescription(String description) {
    if (description != null) {
      getElement().setProperty(PROPERTY_DESCRIPTION, description);
    } else {
      getElement().removeProperty(PROPERTY_DESCRIPTION);
    }
  }

  public String getDescription() {
    return getElement().getAttribute(PROPERTY_DESCRIPTION);
  }
}
