package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5IconView.NAV;

/**
 * <p>UI5IconView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5IconView extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5IconView"</code> */
  public static final String NAV = "UI5IconView";


  /**
   * <p>Constructor for UI5IconView.</p>
   */
  public UI5IconView() {
    final UI5Icon ui5Icon = new UI5Icon();
    ui5Icon.setSource(UI5Icons.PHONE);
    getContent().add(ui5Icon);
  }
}
