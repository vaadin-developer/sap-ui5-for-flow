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

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TextAreaView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5TextAreaView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5TextAreaView extends Composite<Div> implements HasLogger {
  /** Constant <code>NAV="UI5TextAreaView"</code> */
  public static final String NAV = "UI5TextAreaView";

  /**
   * <p>Constructor for UI5TextAreaView.</p>
   */
  public UI5TextAreaView() {
    UI5TextArea textArea = new UI5TextArea();
    textArea.setPlaceholder("Type here...");
    textArea.addValueChangeListener(event -> System.out.println(event.getValue()));

    UI5TextArea textAreaMaxLength = new UI5TextArea(30, true);
    textAreaMaxLength.setPlaceholder("Type here, but max 30 chars...");

    UI5TextArea textAreaWithValue = new UI5TextArea();
    textAreaWithValue.setValue("Pre set value");

    getContent().add(textArea, textAreaMaxLength, textAreaWithValue);
  }
}
