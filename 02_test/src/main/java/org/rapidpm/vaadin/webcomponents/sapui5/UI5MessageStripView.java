package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5MessageStripView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5MessageStripView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5MessageStripView extends Composite<Div> {
  /** Constant <code>NAV="UI5MessageStripView"</code> */
  public static final String NAV = "UI5MessageStripView";

  /**
   * <p>Constructor for UI5MessageStripView.</p>
   */
  public UI5MessageStripView() {
    UI5MessageStrip information =
        new UI5MessageStrip("Information MessageStrip", UI5MessageStripType.INFORMATION);
    information.setNoCloseButton(true);
    UI5MessageStrip positive =
        new UI5MessageStrip("Positive MessageStrip", UI5MessageStripType.POSITIVE);
    positive.setNoIcon(true);
    UI5MessageStrip negative =
        new UI5MessageStrip("Negative MessageStrip", UI5MessageStripType.NEGATIVE);
    UI5MessageStrip warning =
        new UI5MessageStrip("Warning MessageStrip", UI5MessageStripType.WARNING);

    information.addCloseListener(event -> getContent().remove(information));

    positive.addCloseListener(event -> getContent().remove(positive));
    negative.addCloseListener(event -> getContent().remove(negative));
    warning.addCloseListener(event -> getContent().remove(warning));

    getContent().add(information, positive, negative, warning);
  }
}
