/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

/**
 * <p>UI5MessageStrip class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
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
  /**
   * <p>Constructor for UI5MessageStrip.</p>
   */
  public UI5MessageStrip() {
    super();
  }

  /**
   * <p>Constructor for UI5MessageStrip.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5MessageStrip(Element element) {
    super(element);
  }

  /**
   * <p>Constructor for UI5MessageStrip.</p>
   *
   * @param text a {@link java.lang.String} object.
   */
  public UI5MessageStrip(String text) {
    super();
    setText(text);
  }

  /**
   * <p>Constructor for UI5MessageStrip.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   */
  public UI5MessageStrip(String text, UI5Icons icon) {
    super();
    setText(text);
    setIcon(icon);
  }

  /**
   * <p>Constructor for UI5MessageStrip.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   * @param type a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripType} object.
   */
  public UI5MessageStrip(String text, UI5Icons icon, UI5MessageStripType type) {
    super();
    setText(text);
    setIcon(icon);
    setType(type);
  }

  /**
   * <p>Constructor for UI5MessageStrip.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param type a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripType} object.
   */
  public UI5MessageStrip(String text, UI5MessageStripType type) {
    super();
    setText(text);
    setType(type);
  }

  /**
   * <p>setType.</p>
   *
   * @param type a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripType} object.
   */
  public void setType(UI5MessageStripType type) {
    typeProperty.set(this, type.getAttributeName());
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripType} object.
   */
  public UI5MessageStripType getType() {
    return UI5MessageStripType.fromAttributeName(typeProperty.get(this));
  }

  /**
   * <p>setNoIcon.</p>
   *
   * @param noIcon a boolean.
   */
  public void setNoIcon(boolean noIcon) {
    noIconProperty.set(this, noIcon);
  }

  /**
   * <p>isNoIcon.</p>
   *
   * @return a boolean.
   */
  public boolean isNoIcon() {
    return noIconProperty.get(this);
  }

  /**
   * <p>setNoCloseButton.</p>
   *
   * @param noCloseButton a boolean.
   */
  public void setNoCloseButton(boolean noCloseButton) {
    noCloseButtonProperty.set(this, noCloseButton);
  }

  /**
   * <p>isNoCloseButton.</p>
   *
   * @return a boolean.
   */
  public boolean isNoCloseButton() {
    return noCloseButtonProperty.get(this);
  }

  /**
   * <p>addCloseListener.</p>
   *
   * @param listener a {@link com.vaadin.flow.component.ComponentEventListener} object.
   * @return a {@link com.vaadin.flow.shared.Registration} object.
   */
  public Registration addCloseListener(ComponentEventListener<CloseEvent> listener) {
    return addListener(CloseEvent.class, listener);
  }
}
