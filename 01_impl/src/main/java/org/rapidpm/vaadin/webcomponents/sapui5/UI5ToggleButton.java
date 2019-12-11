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

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;

/**
 * <p>UI5ToggleButton class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag("ui5-togglebutton")
public class UI5ToggleButton extends AbstractSinglePropertyField<UI5ToggleButton, Boolean>
    implements HasText, HasUI5Icon, HasUI5ButtonDesign, HasUI5IconEnd {
  static PropertyDescriptor<Boolean, Boolean> pressedProperty =
      PropertyDescriptors.propertyWithDefault("pressed", false);


  /**
   * <p>Constructor for UI5ToggleButton.</p>
   */
  public UI5ToggleButton() {
    super("pressed", false, false);
    getElement().addPropertyChangeListener("pressed", "click",
        event -> setModelValue(pressedProperty.get(this), true));
  }

  /**
   * <p>Constructor for UI5ToggleButton.</p>
   *
   * @param text a {@link java.lang.String} object.
   */
  public UI5ToggleButton(String text) {
    this();
    setText(text);
  }

}

