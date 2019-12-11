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
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * <p>UI5Li class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag("ui5-li")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/StandardListItem.js")
public class UI5Li extends Component implements UI5ListElement, HasText, HasUI5Icon, HasUI5IconEnd {
  /** Constant <code>PROPERTY_INFO="info"</code> */
  protected static final String PROPERTY_INFO = "info";
  /** Constant <code>PROPERTY_DESCRIPTION="description"</code> */
  protected static final String PROPERTY_DESCRIPTION = "description";

  /**
   * <p>Constructor for UI5Li.</p>
   */
  public UI5Li() {
    super();
  }

  /**
   * <p>Constructor for UI5Li.</p>
   *
   * @param text a {@link java.lang.String} object.
   */
  public UI5Li(String text) {
    this();
    setText(text);
  }

  /**
   * <p>Constructor for UI5Li.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   */
  public UI5Li(String text, UI5Icons icon) {
    this();
    setText(text);
    setIcon(icon);
  }

  /**
   * <p>Constructor for UI5Li.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   * @param info a {@link java.lang.String} object.
   * @param description a {@link java.lang.String} object.
   */
  public UI5Li(String text, UI5Icons icon, String info, String description) {
    this();
    setText(text);
    setIcon(icon);
    setInfo(info);
    setDescription(description);
  }

  /**
   * <p>setInfo.</p>
   *
   * @param info a {@link java.lang.String} object.
   */
  public void setInfo(String info) {
    if (info != null) {
      getElement().setProperty(PROPERTY_INFO, info);
    } else {
      getElement().removeProperty(PROPERTY_INFO);
    }
  }

  /**
   * <p>getInfo.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getInfo() {
    return getElement().getAttribute(PROPERTY_INFO);
  }

  /**
   * <p>setDescription.</p>
   *
   * @param description a {@link java.lang.String} object.
   */
  public void setDescription(String description) {
    if (description != null) {
      getElement().setProperty(PROPERTY_DESCRIPTION, description);
    } else {
      getElement().removeProperty(PROPERTY_DESCRIPTION);
    }
  }

  /**
   * <p>getDescription.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getDescription() {
    return getElement().getAttribute(PROPERTY_DESCRIPTION);
  }
}
