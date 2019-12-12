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
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.jetbrains.annotations.NotNull;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineView.NAV;


/**
 * <p>UI5TimelineView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5TimelineView
    extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5TimelineView"</code> */
  public static final String NAV = "UI5TimelineView";


  /**
   * <p>Constructor for UI5TimelineView.</p>
   */
  public UI5TimelineView() {
    final UI5Timeline ui5Timeline = new UI5Timeline();
    ui5Timeline.add(nextTimeLineItem());
    ui5Timeline.add(nextTimeLineItem());
    ui5Timeline.add(nextTimeLineItem());
    getContent().add(ui5Timeline);
  }

  @NotNull
  private UI5TimelineItem nextTimeLineItem() {
    final UI5TimelineItem ui5TimelineItem = new UI5TimelineItem();
    ui5TimelineItem.setItemName("timeLineIcon");
    ui5TimelineItem.setTitleText("Title");
    ui5TimelineItem.setSubtitleText("SubTitle");
    ui5TimelineItem.setIcon(UI5Icons.PHONE);
    ui5TimelineItem.setItemNameClickable(true);
    ui5TimelineItem.add(new Text("Huhu"));
    ui5TimelineItem.addItemNameClickEventListener((UI5TimelineItem.TimeLineItemClicked) domEvent -> {
      logger().info("got an event (data)" + domEvent.getEventData());
      logger().info("got an event (source)" + domEvent.getSource());
      logger().info("got an event (type)" + domEvent.getType());
    });
    return ui5TimelineItem;
  }
}
