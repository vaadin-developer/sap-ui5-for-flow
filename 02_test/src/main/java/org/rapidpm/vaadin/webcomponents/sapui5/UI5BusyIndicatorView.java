package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndicatorView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5BusyIndicatorView extends Composite<Div> implements HasLogger {
  public static final String NAV = "UI5BusyIndicatorView";

  public UI5BusyIndicatorView() {

    UI5BusyIndicator ui5BusyIndicator = new UI5BusyIndicator();

    getContent().add(ui5BusyIndicator);
  }
}
