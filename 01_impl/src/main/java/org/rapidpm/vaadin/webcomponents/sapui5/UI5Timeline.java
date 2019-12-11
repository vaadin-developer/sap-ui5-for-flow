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


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.rapidpm.dependencies.core.logger.HasLogger;


/**
 * &lt;ui5-timeline&gt;
 * &lt;ui5-timeline-item id=&quot;test-item&quot;
 * title-text=&quot;called&quot;
 * subtitle-text=&quot;20.02.2017 11:30&quot;
 * icon=&quot;sap-icon://phone&quot;
 * item-name=&quot;John Smith&quot;
 * item-name-clickable&gt;
 * &lt;/ui5-timeline-item&gt;
 * &lt;ui5-timeline-item title-text=&quot;Weekly Sync - CP Design&quot; subtitle-text=&quot;27.07.2017 (11:00 - 12:30)&quot; icon=&quot;sap-icon://calendar&quot;&gt;
 *    &lt;div&gt;MR SOF02 2.43&lt;/div&gt;
 *  &lt;/ui5-timeline-item&gt;
 *  &lt;ui5-timeline-item title-text=&quot;Video Converence Call - UI5&quot; subtitle-text=&quot;31.01.2018 (12:00 - 13:00)&quot; icon=&quot;sap-icon://calendar&quot;&gt;
 *     &lt;div&gt;Online meeting&lt;/div&gt;
 * &lt;/ui5-timeline-item&gt;
 * &lt;/ui5-timeline&gt;
 *
 * @author svenruppert
 * @version $Id: $Id
 */

@Tag("ui5-timeline")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Timeline.js")
public class UI5Timeline
    extends Component
    implements HasLogger, HasComponents {

  /**
   * <p>addTimeLineItem.</p>
   *
   * @param item a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItem} object.
   */
  public void addTimeLineItem(UI5TimelineItem item) {
//    getElement().appendChild(item.getElement());
    add(item);
  }

}
