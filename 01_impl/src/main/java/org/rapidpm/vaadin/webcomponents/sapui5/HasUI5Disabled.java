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
 * <p>HasUI5Disabled interface.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public interface HasUI5Disabled extends HasElement {
  PropertyDescriptor<Boolean, Boolean> DISABLED_PROPERTY =
      /** Constant <code>DISABLED_PROPERTY</code> */
      /** Constant <code>DISABLED_PROPERTY</code> */
      /** Constant <code>DISABLED_PROPERTY</code> */
      /** Constant <code>DISABLED_PROPERTY</code> */
      /** Constant <code>DISABLED_PROPERTY</code> */
      PropertyDescriptors.propertyWithDefault("disabled", false);

  /**
   * <p>setDisabled.</p>
   *
   * @param disabled a boolean.
   */
  default void setDisabled(boolean disabled) {
    DISABLED_PROPERTY.set(this, disabled);
  }

  /**
   * <p>isDisabled.</p>
   *
   * @return a boolean.
   */
  default boolean isDisabled() {
    return DISABLED_PROPERTY.get(this);
  }
}
