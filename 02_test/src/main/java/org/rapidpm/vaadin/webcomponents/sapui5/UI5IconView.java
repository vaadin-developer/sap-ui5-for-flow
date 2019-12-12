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
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5IconView.NAV;

/**
 * <p>UI5IconView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5IconView extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5IconView"</code> */
  public static final String NAV = "UI5IconView";


  /**
   * <p>Constructor for UI5IconView.</p>
   */
  public UI5IconView() {
    final UI5Icon ui5Icon = new UI5Icon();
    ui5Icon.setSource(UI5Icons.PHONE);
    getContent().add(ui5Icon);
  }
}
