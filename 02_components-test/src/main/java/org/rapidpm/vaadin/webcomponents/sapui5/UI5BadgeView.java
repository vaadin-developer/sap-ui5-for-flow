package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BadgeView.NAV;


@Route(NAV)
public class UI5BadgeView
    extends Composite<Div>
    implements HasLogger {

  public static final String NAV = "UI5BadgeView";

  public UI5BadgeView() {
    final UI5Badge badge = new UI5Badge();
    badge.setText("A nice Badge");
    badge.setColorScheme(UI5Badge.ColorScheme.FIVE);
    badge.setUI5Icon(UI5Icons.ADD_EQUIPMENT.asUI5Icon());
    getContent().add(badge);

  }
}
