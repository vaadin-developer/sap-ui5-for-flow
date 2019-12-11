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
