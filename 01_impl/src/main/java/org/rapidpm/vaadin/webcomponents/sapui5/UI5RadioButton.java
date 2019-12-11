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

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * <p>UI5RadioButton class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
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

  /**
   * <p>Constructor for UI5RadioButton.</p>
   */
  public UI5RadioButton() {
    super("selected", false, false);
    setSynchronizedEvent("select");
  }

  /**
   * <p>Constructor for UI5RadioButton.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param name a {@link java.lang.String} object.
   */
  public UI5RadioButton(String text, String name) {
    this();
    setText(text);
    setName(name);
  }

  /**
   * <p>Constructor for UI5RadioButton.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param name a {@link java.lang.String} object.
   * @param listener a ValueChangeListener object.
   */
  public UI5RadioButton(String text, String name,
      ValueChangeListener<ValueChangeEvent<Boolean>> listener) {
    this();
    setText(text);
    setName(name);
    addValueChangeListener(listener);
  }

  /**
   * <p>Constructor for UI5RadioButton.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param name a {@link java.lang.String} object.
   * @param disabled a boolean.
   */
  public UI5RadioButton(String text, String name, boolean disabled) {
    this(text, name);
    setDisabled(disabled);
  }

  /**
   * <p>setName.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public void setName(String name) {
    nameProperty.set(getElement(), name);
  }

  /**
   * <p>setText.</p>
   *
   * @param text a {@link java.lang.String} object.
   */
  public void setText(String text) {
    textProperty.set(getElement(), text);
  }


}
