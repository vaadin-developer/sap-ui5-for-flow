package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.shared.Registration;

@Tag("ui5-messagestrip")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/MessageStrip.js")
public class UI5MessageStrip extends Component implements HasUI5Icon, HasText {
  private static PropertyDescriptor<Boolean, Boolean> noCloseButtonProperty =
      PropertyDescriptors.propertyWithDefault("noCloseButton", false);
  private static PropertyDescriptor<Boolean, Boolean> noIconProperty =
      PropertyDescriptors.propertyWithDefault("noIcon", false);
  private PropertyDescriptor<String, String> typeProperty = PropertyDescriptors
      .propertyWithDefault("type", UI5MessageStripType.INFORMATION.getAttributeName());

  @DomEvent("close")
  public static class CloseEvent extends ComponentEvent<UI5MessageStrip> {

    public CloseEvent(UI5MessageStrip source, boolean fromClient) {
      super(source, fromClient);
    }
  }
  public UI5MessageStrip() {
    super();
  }

  public UI5MessageStrip(Element element) {
    super(element);
  }

  public UI5MessageStrip(String text) {
    super();
    setText(text);
  }

  public UI5MessageStrip(String text, UI5Icons icon) {
    super();
    setText(text);
    setIcon(icon);
  }

  public UI5MessageStrip(String text, UI5Icons icon, UI5MessageStripType type) {
    super();
    setText(text);
    setIcon(icon);
    setType(type);
  }

  public UI5MessageStrip(String text, UI5MessageStripType type) {
    super();
    setText(text);
    setType(type);
  }

  public void setType(UI5MessageStripType type) {
    typeProperty.set(this, type.getAttributeName());
  }

  public UI5MessageStripType getType() {
    return UI5MessageStripType.fromAttributeName(typeProperty.get(this));
  }

  public void setNoIcon(boolean noIcon) {
    noIconProperty.set(this, noIcon);
  }

  public boolean isNoIcon() {
    return noIconProperty.get(this);
  }

  public void setNoCloseButton(boolean noCloseButton) {
    noCloseButtonProperty.set(this, noCloseButton);
  }

  public boolean isNoCloseButton() {
    return noCloseButtonProperty.get(this);
  }

  public Registration addCloseListener(ComponentEventListener<CloseEvent> listener) {
    return addListener(CloseEvent.class, listener);
  }
}
