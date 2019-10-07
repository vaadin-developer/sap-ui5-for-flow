package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5IconEnd extends HasElement {
  static PropertyDescriptor<Boolean, Boolean> iconEndProperty =
      PropertyDescriptors.propertyWithDefault("iconEnd", false);

  default public void setIconEnd(boolean iconEnd) {
    iconEndProperty.set(this, iconEnd);
  }

  default public boolean isIconEnd() {
    return iconEndProperty.get(this);
  }
}
