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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndicatorView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5BusyIndicatorView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5BusyIndicatorView extends Composite<Div> implements HasLogger {
  /** Constant <code>NAV="UI5BusyIndicatorView"</code> */
  public static final String NAV = "UI5BusyIndicatorView";

  /**
   * <p>Constructor for UI5BusyIndicatorView.</p>
   */
  public UI5BusyIndicatorView() {

    UI5BusyIndicator ui5BusyIndicator = new UI5BusyIndicator();

    getContent().add(ui5BusyIndicator);
  }
}
