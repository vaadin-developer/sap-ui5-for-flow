package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndicatorView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5BusyIndicatorView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5BusyIndicatorView extends Composite<Div> implements HasLogger {
  /** Constant <code>NAV="UI5BusyIndicatorView"</code> */
  public static final String NAV = "UI5BusyIndicatorView";

  /**
   * <p>Constructor for UI5BusyIndicatorView.</p>
   */
  public UI5BusyIndicatorView() {

    UI5BusyIndicator ui5BusyIndicator = new UI5BusyIndicator();

    getContent().add(ui5BusyIndicator);
  }
}
