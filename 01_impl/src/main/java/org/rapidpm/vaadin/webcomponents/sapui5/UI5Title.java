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
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * <p>UI5Title class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag("ui5-title")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Title.js")
public class UI5Title extends Component implements HasUI5Wrap, HasText, HasElement {
  /** Constant <code>LEVEL_PROPERTY</code> */
  protected static final PropertyDescriptor<String, String> LEVEL_PROPERTY =
      PropertyDescriptors.propertyWithDefault("level", UI5TitleLevel.H2.getAttributeName());

  /**
   * <p>Constructor for UI5Title.</p>
   */
  public UI5Title() {
    super();
  }

  /**
   * <p>Constructor for UI5Title.</p>
   *
   * @param level a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5TitleLevel} object.
   * @param text a {@link java.lang.String} object.
   */
  public UI5Title(UI5TitleLevel level, String text) {
    this();
    setText(text);
    setLevel(level);
  }

  /**
   * <p>setLevel.</p>
   *
   * @param level a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5TitleLevel} object.
   */
  public void setLevel(UI5TitleLevel level) {
    LEVEL_PROPERTY.set(this, level.getAttributeName());
  }

  /**
   * <p>getLevel.</p>
   *
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5TitleLevel} object.
   */
  public UI5TitleLevel getLevel() {
    return UI5TitleLevel.fromAttributeName(LEVEL_PROPERTY.get(this));
  }
}
