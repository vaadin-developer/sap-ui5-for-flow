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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5CardView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5CardView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5CardView extends Composite<Div> {
  /** Constant <code>NAV="UI5CardView"</code> */
  public static final String NAV = "UI5CardView";

  /**
   * <p>Constructor for UI5CardView.</p>
   */
  public UI5CardView() {
    UI5Card ui5Card = new UI5Card();
    ui5Card.setHeading("A UI 5 Card");
    ui5Card.setStatus("active");
    ui5Card.setSubtitle("a mapped web component");
    ui5Card.add(new H1("Content"));
    getContent().add(ui5Card);
  }
}
