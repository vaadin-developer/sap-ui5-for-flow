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

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

/**
 * <p>UI5Button class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(UI5Button.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Button.js")
public class UI5Button extends Component implements HasSize, HasStyle, HasText, HasUI5Icon,
    HasUI5IconEnd, HasUI5Disabled, HasUI5ButtonDesign, ClickNotifier<UI5Button> {

  /** Constant <code>TAG_NAME="ui5-button"</code> */
  protected static final String TAG_NAME = "ui5-button";

  /**
   * <p>Constructor for UI5Button.</p>
   */
  public UI5Button() {
    setDefaults();
  }

  /**
   * <p>Constructor for UI5Button.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5Button(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    // NOOP
  }

}
