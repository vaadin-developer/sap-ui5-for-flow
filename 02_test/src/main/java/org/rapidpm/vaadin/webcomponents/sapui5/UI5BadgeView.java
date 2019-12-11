package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BadgeView.NAV;


/**
 * <p>UI5BadgeView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5BadgeView
    extends Composite<Div>
    implements HasLogger {

  /** Constant <code>NAV="UI5BadgeView"</code> */
  public static final String NAV = "UI5BadgeView";

  /**
   * <p>Constructor for UI5BadgeView.</p>
   */
  public UI5BadgeView() {
    final UI5Badge badge = new UI5Badge();
    badge.setText("A nice Badge");
    badge.setColorScheme(UI5Badge.ColorScheme.FIVE);
    badge.setUI5Icon(UI5Icons.ADD_EQUIPMENT.asUI5Icon());
    getContent().add(badge);

  }
}
