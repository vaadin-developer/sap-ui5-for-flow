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

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

/**
 * <p>HasUI5ButtonDesign interface.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public interface HasUI5ButtonDesign extends HasElement {
  PropertyDescriptor<String, String> DESIGN_PROPERTY =
      /** Constant <code>DESIGN_PROPERTY</code> */
      /** Constant <code>DESIGN_PROPERTY</code> */
      /** Constant <code>DESIGN_PROPERTY</code> */
      /** Constant <code>DESIGN_PROPERTY</code> */
      /** Constant <code>DESIGN_PROPERTY</code> */
      PropertyDescriptors.propertyWithDefault("design", UI5ButtonDesign.DEFAULT.getAttributeName());

  /**
   * <p>setDesign.</p>
   *
   * @param buttonDesign a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5ButtonDesign} object.
   */
  default void setDesign(UI5ButtonDesign buttonDesign) {
    DESIGN_PROPERTY.set(this, buttonDesign.getAttributeName());
  }

  /**
   * <p>getDesign.</p>
   *
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5ButtonDesign} object.
   */
  default UI5ButtonDesign getDesign() {
    return UI5ButtonDesign.fromAttributeName(DESIGN_PROPERTY.get(this));
  }
}
