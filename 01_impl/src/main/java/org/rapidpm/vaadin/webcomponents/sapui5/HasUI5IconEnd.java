package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5IconEnd extends HasElement {
  PropertyDescriptor<Boolean, Boolean> ICON_END_PROPERTY =
      PropertyDescriptors.propertyWithDefault("iconEnd", false);

  default void setIconEnd(boolean iconEnd) {
    ICON_END_PROPERTY.set(this, iconEnd);
  }

  default boolean isIconEnd() {
    return ICON_END_PROPERTY.get(this);
  }
}
