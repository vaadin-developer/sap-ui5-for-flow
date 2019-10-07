package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;

@Tag("ui5-togglebutton")
public class UI5ToggleButton extends AbstractSinglePropertyField<UI5ToggleButton, Boolean>
    implements HasText, HasUI5Icon, HasUI5ButtonDesign, HasUI5IconEnd {
  static PropertyDescriptor<Boolean, Boolean> pressedProperty =
      PropertyDescriptors.propertyWithDefault("pressed", false);


  public UI5ToggleButton() {
    super("pressed", false, false);
    getElement().addPropertyChangeListener("pressed", "click",
        event -> setModelValue(pressedProperty.get(this), true));
  }

  public UI5ToggleButton(String text) {
    this();
    setText(text);
  }

}

