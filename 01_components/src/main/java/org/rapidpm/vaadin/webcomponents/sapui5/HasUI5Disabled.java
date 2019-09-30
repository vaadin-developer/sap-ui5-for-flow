package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5Disabled extends HasElement {
  static PropertyDescriptor<Boolean, Boolean> disabledProperty =
      PropertyDescriptors.propertyWithDefault("disabled", false);

  default public void setDisabled(boolean disabled) {
    disabledProperty.set(this, disabled);
  }

  default public boolean isDisabled() {
    return disabledProperty.get(this);
  }
}
