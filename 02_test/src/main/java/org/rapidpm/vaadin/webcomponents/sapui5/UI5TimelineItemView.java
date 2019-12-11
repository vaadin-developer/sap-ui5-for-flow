package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItemView.NAV;

/**
 * <p>UI5TimelineItemView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5TimelineItemView
    extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5TimelineItemView"</code> */
  public static final String NAV = "UI5TimelineItemView";

  /**
   * <p>Constructor for UI5TimelineItemView.</p>
   */
  public UI5TimelineItemView() {
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

    getContent().add(ui5TimelineItem);
  }
}
