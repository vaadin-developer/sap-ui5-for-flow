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
 * <p>UI5Icon class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(UI5Icon.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Icon.js")
public class UI5Icon
    extends Component {

  /** Constant <code>ATTRIBUTE_SRC="src"</code> */
  public static final String ATTRIBUTE_SRC = "src";
  /** Constant <code>TAG_NAME="ui5-icon"</code> */
  public static final String TAG_NAME      = "ui5-icon";

  /**
   * <p>setSource.</p>
   *
   * @param src a {@link java.lang.String} object.
   */
  public void setSource(String src) {
    getElement().setAttribute(ATTRIBUTE_SRC, src);
  }

  /**
   * <p>getSource.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getSource() {
    return getElement().getAttribute(ATTRIBUTE_SRC);
  }

  /**
   * <p>setSource.</p>
   *
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   */
  public void setSource(UI5Icons icon) {
    setSource(icon.code());
  }
}
