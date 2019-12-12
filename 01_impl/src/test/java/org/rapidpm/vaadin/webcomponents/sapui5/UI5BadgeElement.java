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

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.ATTRIBUTE_COLOR_SCHEME;
import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.TAG_NAME;

@Element(TAG_NAME)
public class UI5BadgeElement
    extends TestBenchElement {

  public String getColorScheme() {
    return getAttribute(ATTRIBUTE_COLOR_SCHEME);
  }

  public void setColorScheme(UI5Badge.ColorScheme colorScheme) {
    setProperty(ATTRIBUTE_COLOR_SCHEME, colorScheme.asString());
  }

  public void setText(String text) {
    //setProperty();
  }

  @Override
  public String getText() {
    return null;
  }


}
