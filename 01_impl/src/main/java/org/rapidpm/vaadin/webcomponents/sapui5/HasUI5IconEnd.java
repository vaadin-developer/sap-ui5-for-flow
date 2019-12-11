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
 * <p>HasUI5IconEnd interface.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public interface HasUI5IconEnd extends HasElement {
  PropertyDescriptor<Boolean, Boolean> ICON_END_PROPERTY =
      /** Constant <code>ICON_END_PROPERTY</code> */
      /** Constant <code>ICON_END_PROPERTY</code> */
      /** Constant <code>ICON_END_PROPERTY</code> */
      /** Constant <code>ICON_END_PROPERTY</code> */
      /** Constant <code>ICON_END_PROPERTY</code> */
      PropertyDescriptors.propertyWithDefault("iconEnd", false);

  /**
   * <p>setIconEnd.</p>
   *
   * @param iconEnd a boolean.
   */
  default void setIconEnd(boolean iconEnd) {
    ICON_END_PROPERTY.set(this, iconEnd);
  }

  /**
   * <p>isIconEnd.</p>
   *
   * @return a boolean.
   */
  default boolean isIconEnd() {
    return ICON_END_PROPERTY.get(this);
  }
}
