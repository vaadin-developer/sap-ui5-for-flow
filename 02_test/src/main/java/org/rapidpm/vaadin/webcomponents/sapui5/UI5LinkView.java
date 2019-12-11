package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5LinkView.NAV;
import org.rapidpm.vaadin.webcomponents.sapui5.UI5Link.UI5LinkDesign;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5LinkView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5LinkView extends Composite<VerticalLayout> {
  /** Constant <code>NAV="UI5LinkView"</code> */
  public static final String NAV = "UI5LinkView";

  /**
   * <p>Constructor for UI5LinkView.</p>
   */
  public UI5LinkView() {
    getContent().add(
        new UI5Link("SAP UI5 Web Components", "https://sap.github.io/ui5-webcomponents", "_self"),
        new UI5Link("Subtle link", "https://sap.github.io/ui5-webcomponents", UI5LinkDesign.SUBTLE),
        new UI5Link("Emphasized link", "https://sap.github.io/ui5-webcomponents",
            UI5LinkDesign.EMPHASIZED));
  }
}
