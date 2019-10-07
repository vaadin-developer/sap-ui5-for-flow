package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-textarea")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/TextArea.js")
public class UI5TextArea extends Component implements HasUI5Disabled {
  static PropertyDescriptor<String, String> placeholderProperty =
      PropertyDescriptors.propertyWithDefault("placeholder ", "");

  public void setPlaceholder(String placeholder) {
    placeholderProperty.set(getElement(), placeholder);
  }

  public String getPlaceholder() {
    return placeholderProperty.get(getElement());
  }
}
