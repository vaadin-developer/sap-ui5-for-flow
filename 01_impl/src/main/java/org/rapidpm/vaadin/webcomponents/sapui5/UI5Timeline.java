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
 * <ui5-timeline>
 * <ui5-timeline-item id="test-item"
 * title-text="called"
 * subtitle-text="20.02.2017 11:30"
 * icon="sap-icon://phone"
 * item-name="John Smith"
 * item-name-clickable>
 * </ui5-timeline-item>
 * <ui5-timeline-item title-text="Weekly Sync - CP Design" subtitle-text="27.07.2017 (11:00 - 12:30)" icon="sap-icon://calendar">
 *    <div>MR SOF02 2.43</div>
 *  </ui5-timeline-item>
 *  <ui5-timeline-item title-text="Video Converence Call - UI5" subtitle-text="31.01.2018 (12:00 - 13:00)" icon="sap-icon://calendar">
 *     <div>Online meeting</div>
 * </ui5-timeline-item>
 * </ui5-timeline>
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
