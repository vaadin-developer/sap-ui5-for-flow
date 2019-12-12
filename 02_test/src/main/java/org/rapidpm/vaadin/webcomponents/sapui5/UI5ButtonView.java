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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5ButtonView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5ButtonView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5ButtonView extends Composite<Div> implements HasLogger {
  /** Constant <code>NAV="UI5ButtonView"</code> */
  public static final String NAV = "UI5ButtonView";

  /**
   * <p>Constructor for UI5ButtonView.</p>
   */
  public UI5ButtonView() {
    final UI5Button ui5Button1 = new UI5Button();
    ui5Button1.setText("Hello, UI5");
    ui5Button1.setIcon(UI5Icons.PHONE);
    ui5Button1.setDesign(UI5ButtonDesign.EMPHASIZED);

    final UI5Button ui5Button2 = new UI5Button();
    ui5Button2.setText("Hello, UI5");
    ui5Button2.setIcon(UI5Icons.PHONE);
    ui5Button2.setIconEnd(true);
    ui5Button2.addClickListener(e -> System.out.println("button2" + e));

    final UI5Button ui5ButtonDisabled = new UI5Button();
    ui5ButtonDisabled.setText("Disabled");
    ui5ButtonDisabled.setDisabled(true);
    ui5ButtonDisabled.addClickListener(e -> System.out.println("disabled" + e));

    getContent().add(ui5Button1);
    getContent().add(ui5Button2);
    getContent().add(ui5ButtonDisabled);
  }
}
