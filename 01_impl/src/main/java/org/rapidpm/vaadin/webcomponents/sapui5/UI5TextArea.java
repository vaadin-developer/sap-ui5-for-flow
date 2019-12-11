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
 * <p>UI5TextArea class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
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

  /**
   * <p>Constructor for UI5TextArea.</p>
   */
  public UI5TextArea() {
    super("value", "", false);
    setSynchronizedEvent("change");
  }

  /**
   * <p>Constructor for UI5TextArea.</p>
   *
   * @param maxLength a int.
   * @param showExceededText a boolean.
   */
  public UI5TextArea(int maxLength, boolean showExceededText) {
    this();
    setMaxLength(maxLength);
    setShowExceededText(showExceededText);
  }

  /**
   * <p>setShowExceededText.</p>
   *
   * @param showExceededText a boolean.
   */
  public void setShowExceededText(boolean showExceededText) {
    SHOW_EXCEEDED_TEXT_PROPERTY.set(getElement(), showExceededText);
  }

  /**
   * <p>isShowExceededText.</p>
   *
   * @return a boolean.
   */
  public boolean isShowExceededText() {
    return SHOW_EXCEEDED_TEXT_PROPERTY.get(getElement());
  }

  /**
   * <p>setMaxLength.</p>
   *
   * @param maxLength a int.
   */
  public void setMaxLength(int maxLength) {
    if (maxLength != 0) {
      getElement().setProperty(PROPERTY_MAX_LENGTH, maxLength);
    } else {
      getElement().removeProperty(PROPERTY_MAX_LENGTH);
    }
  }

  /**
   * <p>getMaxLength.</p>
   *
   * @return a int.
   */
  public int getMaxLength() {
    return Integer.valueOf(getElement().getProperty(PROPERTY_MAX_LENGTH, 0));
  }

  /**
   * <p>setPlaceholder.</p>
   *
   * @param placeholder a {@link java.lang.String} object.
   */
  public void setPlaceholder(String placeholder) {
    PLACEHOLDER_PROPERTY.set(getElement(), placeholder);
  }

  /**
   * <p>getPlaceholder.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getPlaceholder() {
    return PLACEHOLDER_PROPERTY.get(getElement());
  }
}
