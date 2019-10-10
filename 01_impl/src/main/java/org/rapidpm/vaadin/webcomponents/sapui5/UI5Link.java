package org.rapidpm.vaadin.webcomponents.sapui5;

import java.util.Arrays;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag(UI5Link.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Link.js")
public class UI5Link extends Component
    implements HasUI5Disabled, HasUI5Wrap, HasText, ClickNotifier<UI5Link> {
  protected static final String TAG_NAME = "ui5-link";

  public static enum UI5LinkDesign {
    DEFAULT("Default"), SUBTLE("Subtle"), EMPHASIZED("Emphasized");

    private final String attributeName;

    private UI5LinkDesign(String attributeName) {
      this.attributeName = attributeName;
    }

    public String getAttributeName() {
      return attributeName;
    }

    public static UI5LinkDesign fromAttributeName(String attributeName) {
      return Arrays.stream(UI5LinkDesign.values())
          .filter(i -> i.attributeName.equals(attributeName)).findFirst().orElse(null);
    }
  }

  private static PropertyDescriptor<String, String> hrefProperty =
      PropertyDescriptors.propertyWithDefault("href", "");
  private static PropertyDescriptor<String, String> targetProperty =
      PropertyDescriptors.propertyWithDefault("target", "");
  private PropertyDescriptor<String, String> designProperty =
      PropertyDescriptors.propertyWithDefault("design", UI5LinkDesign.DEFAULT.attributeName);

  public UI5Link() {
    super();
  }

  public UI5Link(Element element) {
    super(element);
  }

  public UI5Link(String text, String href, String target) {
    this();
    setHref(href);
    setTarget(target);
    setText(text);
  }

  public UI5Link(String text, String href, UI5LinkDesign design) {
    this();
    setHref(href);
    setText(text);
    setDesign(design);
  }

  public void setHref(String href) {
    hrefProperty.set(getElement(), href);
  }

  public void setTarget(String target) {
    targetProperty.set(getElement(), target);
  }

  public String getHref() {
    return hrefProperty.get(getElement());
  }

  public String getTarget() {
    return targetProperty.get(getElement());
  }

  public void setDesign(UI5LinkDesign design) {
    designProperty.set(getElement(), design.getAttributeName());
  }

  public UI5LinkDesign getDesign() {
    return UI5LinkDesign.fromAttributeName(designProperty.get(getElement()));
  }
}
