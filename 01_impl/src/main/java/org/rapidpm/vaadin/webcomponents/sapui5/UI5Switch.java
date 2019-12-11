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
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.dom.Element;

import static java.lang.Boolean.parseBoolean;

/**
 * <p>UI5Switch class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(UI5Switch.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
//@JsModule("@ui5/webcomponents/dist/MessageBundleAssets.js")
@JsModule("@ui5/webcomponents/dist/Switch.js")
public class UI5Switch
    extends Component
    implements HasSize, HasStyle, HasUI5Icon {

  /** Constant <code>TAG_NAME="ui5-switch"</code> */
  protected static final String TAG_NAME            = "ui5-switch";
  /** Constant <code>ATTRIBUTE_TEXT_ON="textOn"</code> */
  protected static final String ATTRIBUTE_TEXT_ON   = "textOn";
  /** Constant <code>ATTRIBUTE_TEXT_OFF="textOff"</code> */
  protected static final String ATTRIBUTE_TEXT_OFF  = "textOff";
  /** Constant <code>ATTRIBUTE_CHECKED="checked"</code> */
  protected static final String ATTRIBUTE_CHECKED   = "checked";
  /** Constant <code>ATTRIBUTE_GRAPHICAL="graphical"</code> */
  protected static final String ATTRIBUTE_GRAPHICAL = "graphical";
  /** Constant <code>EVENT_CHANGE="change"</code> */
  protected static final String EVENT_CHANGE        = "change";

  /**
   * <p>Constructor for UI5Switch.</p>
   */
  public UI5Switch() {
    setDefaults();
  }

  /**
   * <p>Constructor for UI5Switch.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5Switch(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    checkedOff();
  }

  /**
   * <p>setTextOn.</p>
   *
   * @param value a {@link java.lang.String} object.
   */
  public void setTextOn(String value) {
    getElement().setProperty(ATTRIBUTE_TEXT_ON, value);
  }

  /**
   * <p>getTextOn.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getTextOn() {
    return getElement().getProperty(ATTRIBUTE_TEXT_ON);
  }

  /**
   * <p>setTextOff.</p>
   *
   * @param value a {@link java.lang.String} object.
   */
  public void setTextOff(String value) {
    getElement().setProperty(ATTRIBUTE_TEXT_OFF, value);
  }

  /**
   * <p>getTextOff.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getTextOff() {
    return getElement().getProperty(ATTRIBUTE_TEXT_OFF);
  }

  /**
   * <p>checkedOn.</p>
   */
  public void checkedOn() {
    getElement().setProperty(ATTRIBUTE_CHECKED, "true");
  }

  /**
   * <p>checkedOff.</p>
   */
  public void checkedOff() {
    getElement().setProperty(ATTRIBUTE_CHECKED, "false");
  }

  /**
   * <p>isCheckedOn.</p>
   *
   * @return a boolean.
   */
  public boolean isCheckedOn() {
    return parseBoolean(getElement().getProperty(ATTRIBUTE_CHECKED));
  }


  /**
   * <p>setGraphical.</p>
   *
   * @param active a boolean.
   */
  public void setGraphical(boolean active) {
    getElement().setProperty(ATTRIBUTE_GRAPHICAL, active);
  }

  /**
   * <p>isGraphical.</p>
   *
   * @return a boolean.
   */
  public boolean isGraphical() {
    return parseBoolean(getElement().getProperty(ATTRIBUTE_GRAPHICAL));
  }

  /**
   * <p>addChangeListener.</p>
   *
   * @param listener a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Switch.SwitchChangeListener} object.
   */
  public void addChangeListener(SwitchChangeListener listener) {
    getElement().addEventListener(EVENT_CHANGE, listener);
  }


  public interface SwitchChangeListener
      extends DomEventListener {

  }
}
