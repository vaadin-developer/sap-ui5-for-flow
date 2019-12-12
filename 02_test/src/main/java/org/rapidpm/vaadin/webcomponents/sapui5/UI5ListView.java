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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5ListView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5ListView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5ListView extends Composite<VerticalLayout> {
  /** Constant <code>NAV="UI5ListView"</code> */
  public static final String NAV = "UI5ListView";

  /**
   * <p>Constructor for UI5ListView.</p>
   */
  public UI5ListView() {
    UI5List simpleList = new UI5List("Simple list",
        new UI5Li("Pineapple", UI5Icons.NUTRITION_ACTIVITY, "In-stock",
            "Tropical plant with an edible fruit"),
        new UI5Li("Orange", UI5Icons.NUTRITION_ACTIVITY, "Expires",
            "Occurs between red and yellow"),
        new UI5Li("Banana", UI5Icons.NUTRITION_ACTIVITY, "Re-stock", "The yellow lengthy fruit"),
        new UI5Li("Mango", UI5Icons.NUTRITION_ACTIVITY, "Re-stock", "The tropical stone fruit"));

    getContent().add(simpleList);
  }
}
