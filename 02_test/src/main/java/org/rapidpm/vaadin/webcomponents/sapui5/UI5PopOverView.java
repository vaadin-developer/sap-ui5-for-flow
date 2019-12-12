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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5PopOverView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5PopOverView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5PopOverView extends Composite<Div> {
  /** Constant <code>NAV="UI5PopOverView"</code> */
  public static final String NAV = "UI5PopOverView";

  /**
   * <p>Constructor for UI5PopOverView.</p>
   */
  public UI5PopOverView() {
    final UI5Button ui5Button = new UI5Button();
    ui5Button.setText("Hello, UI5");
    ui5Button.setDesign(UI5ButtonDesign.EMPHASIZED);
    ui5Button.setId("BLABLABLAID");
    ui5Button.addClickListener(event -> {
      UI5Popover popover = new UI5Popover();

      UI5Badge badge = new UI5Badge();
      badge.setText("BLABLABLA");
      popover.setContent(badge);
      popover.setFooter(new Text("FOOTER"));
      popover.setHeader(new Text("HEADER"));
      getContent().add(popover);

      popover.show(ui5Button);
    });
    getContent().add(ui5Button);

  }
}
