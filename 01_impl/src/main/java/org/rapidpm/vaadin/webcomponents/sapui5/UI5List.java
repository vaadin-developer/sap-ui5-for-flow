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
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * <p>UI5List class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag("ui5-list")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/List.js")
public class UI5List extends Component {
  /** Constant <code>PROPERTY_HEADER_TEXT="headerText"</code> */
  protected static final String PROPERTY_HEADER_TEXT = "headerText";

  /**
   * <p>Constructor for UI5List.</p>
   */
  public UI5List() {
    super();
  }

  /**
   * <p>Constructor for UI5List.</p>
   *
   * @param headerText a {@link java.lang.String} object.
   */
  public UI5List(String headerText) {
    this();
    setHeaderText(headerText);
  }

  /**
   * <p>Constructor for UI5List.</p>
   *
   * @param headerText a {@link java.lang.String} object.
   * @param listElements a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5ListElement} object.
   */
  public UI5List(String headerText, UI5ListElement... listElements) {
    this();
    setHeaderText(headerText);
    for (UI5ListElement listElement : listElements) {
      addListElement(listElement);
    }
  }

  /**
   * <p>getHeaderText.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getHeaderText() {
    return getElement().getProperty(PROPERTY_HEADER_TEXT);
  }

  /**
   * <p>setHeaderText.</p>
   *
   * @param headerText a {@link java.lang.String} object.
   */
  public void setHeaderText(String headerText) {
    if (headerText != null) {
      getElement().setProperty(PROPERTY_HEADER_TEXT, headerText);
    } else {
      getElement().removeProperty(PROPERTY_HEADER_TEXT);
    }
  }


  /**
   * <p>addListElement.</p>
   *
   * @param listElement a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5ListElement} object.
   */
  public void addListElement(UI5ListElement listElement) {
    getElement().appendChild(listElement.getElement());
  }
}
