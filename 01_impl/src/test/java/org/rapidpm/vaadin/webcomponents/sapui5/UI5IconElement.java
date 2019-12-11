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
import org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon.ATTRIBUTE_SRC;
import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon.TAG_NAME;

@Element(TAG_NAME)
public class UI5IconElement
    extends TestBenchElement {

  public String getUI5IconAsString() {
    return getPropertyString(ATTRIBUTE_SRC);
  }

//  public UI5Icon getUI5Icon() {
//    final String value = getPropertyString(ATTRIBUTE_SRC);
//    return (value != null)
//        ? UI5Icons.fromCode(value)
//           : UI5Icons.NONE;
//  }

  public void setUI5Icon(UI5Icon ui5Icon) {
    setProperty(ATTRIBUTE_SRC, ui5Icon.getSource());
  }

}
