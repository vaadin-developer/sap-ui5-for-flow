package org.rapidpm.vaadin.webcomponents.sapui5;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.dom.Element;

import static java.lang.Boolean.parseBoolean;

@Tag(UI5Switch.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/MessageBundleAssets.js")
@JsModule("@ui5/webcomponents/dist/Switch.js")
public class UI5Switch
    extends Component
    implements HasSize, HasStyle, HasUI5Icon {

  protected static final String TAG_NAME            = "ui5-switch";
  protected static final String ATTRIBUTE_TEXT_ON   = "textOn";
  protected static final String ATTRIBUTE_TEXT_OFF  = "textOff";
  protected static final String ATTRIBUTE_CHECKED   = "checked";
  protected static final String ATTRIBUTE_GRAPHICAL = "graphical";
  protected static final String EVENT_CHANGE        = "change";

  public UI5Switch() {
    setDefaults();
  }

  public UI5Switch(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    checkedOff();
  }

  public void setTextOn(String value) {
    getElement().setProperty(ATTRIBUTE_TEXT_ON, value);
  }

  public String getTextOn() {
    return getElement().getProperty(ATTRIBUTE_TEXT_ON);
  }

  public void setTextOff(String value) {
    getElement().setProperty(ATTRIBUTE_TEXT_OFF, value);
  }

  public String getTextOff() {
    return getElement().getProperty(ATTRIBUTE_TEXT_OFF);
  }

  public void checkedOn() {
    getElement().setProperty(ATTRIBUTE_CHECKED, "true");
  }

  public void checkedOff() {
    getElement().setProperty(ATTRIBUTE_CHECKED, "false");
  }

  public boolean isCheckedOn() {
    return parseBoolean(getElement().getProperty(ATTRIBUTE_CHECKED));
  }


  public void setGraphical(boolean active) {
    getElement().setProperty(ATTRIBUTE_GRAPHICAL, active);
  }

  public boolean isGraphical() {
    return parseBoolean(getElement().getProperty(ATTRIBUTE_GRAPHICAL));
  }

  public void addChangeListener(SwitchChangeListener listener) {
    getElement().addEventListener(EVENT_CHANGE, listener);
  }


  public interface SwitchChangeListener
      extends DomEventListener {

  }
}
