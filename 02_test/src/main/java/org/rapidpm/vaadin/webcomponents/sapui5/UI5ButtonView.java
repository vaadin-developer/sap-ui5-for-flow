package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5ButtonView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

/**
 * <p>UI5ButtonView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5ButtonView extends Composite<Div> implements HasLogger {
  /** Constant <code>NAV="UI5ButtonView"</code> */
  public static final String NAV = "UI5ButtonView";

  /**
   * <p>Constructor for UI5ButtonView.</p>
   */
  public UI5ButtonView() {
    final UI5Button ui5Button1 = new UI5Button();
    ui5Button1.setText("Hello, UI5");
    ui5Button1.setIcon(UI5Icons.PHONE);
    ui5Button1.setDesign(UI5ButtonDesign.EMPHASIZED);

    final UI5Button ui5Button2 = new UI5Button();
    ui5Button2.setText("Hello, UI5");
    ui5Button2.setIcon(UI5Icons.PHONE);
    ui5Button2.setIconEnd(true);
    ui5Button2.addClickListener(e -> System.out.println("button2" + e));

    final UI5Button ui5ButtonDisabled = new UI5Button();
    ui5ButtonDisabled.setText("Disabled");
    ui5ButtonDisabled.setDisabled(true);
    ui5ButtonDisabled.addClickListener(e -> System.out.println("disabled" + e));

    getContent().add(ui5Button1);
    getContent().add(ui5Button2);
    getContent().add(ui5ButtonDisabled);
  }
}
