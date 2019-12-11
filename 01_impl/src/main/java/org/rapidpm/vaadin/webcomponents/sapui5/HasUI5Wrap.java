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
 * <p>HasUI5Wrap interface.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public interface HasUI5Wrap
  extends HasElement {
    PropertyDescriptor<Boolean, Boolean> WRAP_PROPERTY =
        /** Constant <code>WRAP_PROPERTY</code> */
        /** Constant <code>WRAP_PROPERTY</code> */
        /** Constant <code>WRAP_PROPERTY</code> */
        /** Constant <code>WRAP_PROPERTY</code> */
        /** Constant <code>WRAP_PROPERTY</code> */
        PropertyDescriptors.propertyWithDefault("wrap", false);

    /**
     * <p>setWrap.</p>
     *
     * @param wrap a boolean.
     */
    default void setWrap(boolean wrap) {
      WRAP_PROPERTY.set(this, wrap);
    }

    /**
     * <p>isWrap.</p>
     *
     * @return a boolean.
     */
    default boolean isWrap() {
      return WRAP_PROPERTY.get(this);
    }
}
