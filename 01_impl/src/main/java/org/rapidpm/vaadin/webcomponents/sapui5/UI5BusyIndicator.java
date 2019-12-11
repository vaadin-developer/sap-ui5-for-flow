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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndicator.TAG_NAME;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

/**
 * <p>UI5BusyIndicator class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/BusyIndicator.js")
public class UI5BusyIndicator extends Component {
  /** Constant <code>TAG_NAME="ui5-busyindicator"</code> */
  protected static final String TAG_NAME = "ui5-busyindicator";

  /** Constant <code>ATTRIBUTE_ACTIVE="active"</code> */
  protected static final String ATTRIBUTE_ACTIVE = "active";
  /** Constant <code>ATTRIBUTE_SIZE="size"</code> */
  protected static final String ATTRIBUTE_SIZE = "size";

  /**
   * <p>Constructor for UI5BusyIndicator.</p>
   */
  public UI5BusyIndicator() {
    super();
    setDefaults();
  }

  /**
   * <p>Constructor for UI5BusyIndicator.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5BusyIndicator(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    this.setSize(UI5BusyIndiciatorType.LARGE);
    this.setActive(true);
  }

  /**
   * <p>setSize.</p>
   *
   * @param size a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndiciatorType} object.
   */
  public void setSize(UI5BusyIndiciatorType size) {
    getElement().setAttribute(ATTRIBUTE_SIZE, size.getAttributeName());
  }

  /**
   * <p>setActive.</p>
   *
   * @param active a boolean.
   */
  public void setActive(boolean active) {
    getElement().setAttribute(ATTRIBUTE_ACTIVE, active);
  }

  /**
   * <p>isActive.</p>
   *
   * @return a boolean.
   */
  public boolean isActive() {
    return getElement().hasAttribute(ATTRIBUTE_ACTIVE);
  }
}
