package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5ToggleButtonView.NAV;

/**
 * <p>UI5ToggleButtonView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5ToggleButtonView
    extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5ToggleButtonView"</code> */
  public static final String NAV = "UI5ToggleButtonView";

}
