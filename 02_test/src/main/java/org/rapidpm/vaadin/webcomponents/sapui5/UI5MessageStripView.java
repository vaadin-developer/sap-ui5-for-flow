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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5MessageStripView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5MessageStripView extends Composite<Div> {
  /** Constant <code>NAV="UI5MessageStripView"</code> */
  public static final String NAV = "UI5MessageStripView";

  /**
   * <p>Constructor for UI5MessageStripView.</p>
   */
  public UI5MessageStripView() {
    UI5MessageStrip information =
        new UI5MessageStrip("Information MessageStrip", UI5MessageStripType.INFORMATION);
    information.setNoCloseButton(true);
    UI5MessageStrip positive =
        new UI5MessageStrip("Positive MessageStrip", UI5MessageStripType.POSITIVE);
    positive.setNoIcon(true);
    UI5MessageStrip negative =
        new UI5MessageStrip("Negative MessageStrip", UI5MessageStripType.NEGATIVE);
    UI5MessageStrip warning =
        new UI5MessageStrip("Warning MessageStrip", UI5MessageStripType.WARNING);

    information.addCloseListener(event -> getContent().remove(information));

    positive.addCloseListener(event -> getContent().remove(positive));
    negative.addCloseListener(event -> getContent().remove(negative));
    warning.addCloseListener(event -> getContent().remove(warning));

    getContent().add(information, positive, negative, warning);
  }
}
