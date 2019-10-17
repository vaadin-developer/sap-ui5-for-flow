package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-title")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Title.js")
public class UI5Title extends Component implements HasUI5Wrap, HasText, HasElement {
  protected static final PropertyDescriptor<String, String> LEVEL_PROPERTY =
      PropertyDescriptors.propertyWithDefault("level", UI5TitleLevel.H2.getAttributeName());

  public UI5Title() {
    super();
  }

  public UI5Title(UI5TitleLevel level, String text) {
    this();
    setText(text);
    setLevel(level);
  }

  public void setLevel(UI5TitleLevel level) {
    LEVEL_PROPERTY.set(this, level.getAttributeName());
  }

  public UI5TitleLevel getLevel() {
    return UI5TitleLevel.fromAttributeName(LEVEL_PROPERTY.get(this));
  }
}
