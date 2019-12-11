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

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.TAG_NAME;


/**
 * <p>UI5Badge class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Badge.js")
public class UI5Badge
    extends Component
    implements HasSize, HasStyle, HasText, HasComponents {

  /** Constant <code>TAG_NAME="ui5-badge"</code> */
  public static final String TAG_NAME               = "ui5-badge";
  /** Constant <code>ATTRIBUTE_COLOR_SCHEME="colorScheme"</code> */
  public static final String ATTRIBUTE_COLOR_SCHEME = "colorScheme";

  /**
   * <p>getColorScheme.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getColorScheme() {
    return getElement().getProperty(ATTRIBUTE_COLOR_SCHEME);
  }

  /**
   * <p>setColorScheme.</p>
   *
   * @param colorScheme a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.ColorScheme} object.
   */
  public void setColorScheme(ColorScheme colorScheme) {
    getElement().setProperty(ATTRIBUTE_COLOR_SCHEME, colorScheme.asString());
  }

  /**
   * <p>setUI5Icon.</p>
   *
   * @param icon a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon} object.
   */
  public void setUI5Icon(UI5Icon icon) {
    getElement().appendChild(icon.getElement());
  }


  /** {@inheritDoc} */
  @Override
  public void setText(String text) {
    add(text);
  }

  /** {@inheritDoc} */
  @Override
  public String getText() {
    return getElement().getTextRecursively();
  }

  public enum ColorScheme {
    One(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    private int colorScheme;

    ColorScheme(int i) {
      this.colorScheme = i;
    }

    public int value() {
      return this.colorScheme;
    }

    public String asString() {
      return String.valueOf(value());
    }

  }

}
