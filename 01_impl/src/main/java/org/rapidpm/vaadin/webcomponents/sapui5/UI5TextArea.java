package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-textarea")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/TextArea.js")
public class UI5TextArea extends AbstractSinglePropertyField<UI5TextArea, String>
    implements HasUI5Disabled {
  static final String PROPERTY_MAX_LENGTH = "maxLength";
  static final PropertyDescriptor<Boolean, Boolean> SHOW_EXCEEDED_TEXT_PROPERTY =
      PropertyDescriptors.propertyWithDefault("showExceededText", false);
  static final PropertyDescriptor<String, String> PLACEHOLDER_PROPERTY =
      PropertyDescriptors.propertyWithDefault("placeholder", "");

  public UI5TextArea() {
    super("value", "", false);
    setSynchronizedEvent("change");
  }

  public UI5TextArea(int maxLength, boolean showExceededText) {
    this();
    setMaxLength(maxLength);
    setShowExceededText(showExceededText);
  }

  public void setShowExceededText(boolean showExceededText) {
    SHOW_EXCEEDED_TEXT_PROPERTY.set(getElement(), showExceededText);
  }

  public boolean isShowExceededText() {
    return SHOW_EXCEEDED_TEXT_PROPERTY.get(getElement());
  }

  public void setMaxLength(int maxLength) {
    if (maxLength != 0) {
      getElement().setProperty(PROPERTY_MAX_LENGTH, maxLength);
    } else {
      getElement().removeProperty(PROPERTY_MAX_LENGTH);
    }
  }

  public int getMaxLength() {
    return Integer.valueOf(getElement().getProperty(PROPERTY_MAX_LENGTH, 0));
  }

  public void setPlaceholder(String placeholder) {
    PLACEHOLDER_PROPERTY.set(getElement(), placeholder);
  }

  public String getPlaceholder() {
    return PLACEHOLDER_PROPERTY.get(getElement());
  }
}
