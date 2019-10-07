package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5ButtonDesign extends HasElement {
  PropertyDescriptor<String, String> DESIGN_PROPERTY =
      PropertyDescriptors.propertyWithDefault("design", UI5ButtonDesign.DEFAULT.getAttributeName());

  default void setDesign(UI5ButtonDesign buttonDesign) {
    DESIGN_PROPERTY.set(this, buttonDesign.getAttributeName());
  }

  default UI5ButtonDesign getDesign() {
    return UI5ButtonDesign.fromAttributeName(DESIGN_PROPERTY.get(this));
  }
}
