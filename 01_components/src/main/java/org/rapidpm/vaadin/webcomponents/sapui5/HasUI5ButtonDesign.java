package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5ButtonDesign extends HasElement {
  static PropertyDescriptor<String, String> designProperty =
      PropertyDescriptors.propertyWithDefault("design", UI5ButtonDesign.DEFAULT.getAttributeName());

  default public void setDesign(UI5ButtonDesign buttonDesign) {
    designProperty.set(this, buttonDesign.getAttributeName());
  }

  default public UI5ButtonDesign getDesign() {
    return UI5ButtonDesign.fromAttributeName(designProperty.get(this));
  }
}
