package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5Disabled extends HasElement {
  PropertyDescriptor<Boolean, Boolean> DISABLED_PROPERTY =
      PropertyDescriptors.propertyWithDefault("disabled", false);

  default void setDisabled(boolean disabled) {
    DISABLED_PROPERTY.set(this, disabled);
  }

  default boolean isDisabled() {
    return DISABLED_PROPERTY.get(this);
  }
}
