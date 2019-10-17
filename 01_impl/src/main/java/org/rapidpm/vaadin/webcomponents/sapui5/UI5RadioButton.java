package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-radiobutton")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/RadioButton.js")
public class UI5RadioButton extends AbstractSinglePropertyField<UI5RadioButton, Boolean>
    implements HasUI5Disabled {
  private static PropertyDescriptor<String, String> textProperty =
      PropertyDescriptors.propertyWithDefault("text", "");
  private static PropertyDescriptor<String, String> nameProperty =
      PropertyDescriptors.propertyWithDefault("name", "");
  static PropertyDescriptor<Boolean, Boolean> selectedProperty =
      PropertyDescriptors.propertyWithDefault("selected", false);

  public UI5RadioButton() {
    super("selected", false, false);
    setSynchronizedEvent("select");
  }

  public UI5RadioButton(String text, String name) {
    this();
    setText(text);
    setName(name);
  }

  public UI5RadioButton(String text, String name,
      ValueChangeListener<ValueChangeEvent<Boolean>> listener) {
    this();
    setText(text);
    setName(name);
    addValueChangeListener(listener);
  }

  public UI5RadioButton(String text, String name, boolean disabled) {
    this(text, name);
    setDisabled(disabled);
  }

  public void setName(String name) {
    nameProperty.set(getElement(), name);
  }

  public void setText(String text) {
    textProperty.set(getElement(), text);
  }


}
