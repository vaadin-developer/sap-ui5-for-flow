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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TitleView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5TitleView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5TitleView extends Composite<Div> {
  /** Constant <code>NAV="UI5TitleView"</code> */
  public static final String NAV = "UI5TitleView";

  /**
   * <p>Constructor for UI5TitleView.</p>
   */
  public UI5TitleView() {

    getContent().add(new UI5Title(UI5TitleLevel.H1, "Title level 1"),
        new UI5Title(UI5TitleLevel.H2, "Title level 2"),
        new UI5Title(UI5TitleLevel.H3, "Title level 3"),
        new UI5Title(UI5TitleLevel.H4, "Title level 4"),
        new UI5Title(UI5TitleLevel.H5, "Title level 5"),
        new UI5Title(UI5TitleLevel.H6, "Title level 6"));
  }
}
