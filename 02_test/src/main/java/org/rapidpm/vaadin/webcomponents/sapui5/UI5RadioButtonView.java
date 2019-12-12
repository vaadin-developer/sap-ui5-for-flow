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

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5RadioButtonView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route("UI5RadioButtonView")
public class UI5RadioButtonView extends Composite<Div> {

  /**
   * <p>Constructor for UI5RadioButtonView.</p>
   */
  public UI5RadioButtonView() {
    getContent().add(new UI5RadioButton("Button A", "groupA", event -> System.out.println(event)),
        new UI5RadioButton("Button B", "groupA", event -> System.out.println(event)),
        new UI5RadioButton("Disabled", "groupA", true));
  }
}
