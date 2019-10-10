package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasUI5Wrap
  extends HasElement {
    PropertyDescriptor<Boolean, Boolean> WRAP_PROPERTY =
        PropertyDescriptors.propertyWithDefault("wrap", false);

    default void setWrap(boolean wrap) {
      WRAP_PROPERTY.set(this, wrap);
    }

    default boolean isWrap() {
      return WRAP_PROPERTY.get(this);
    }
}
