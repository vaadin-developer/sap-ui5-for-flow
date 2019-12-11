package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5SwitchView.NAV;

/**
 * <p>UI5SwitchView class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Route(NAV)
public class UI5SwitchView
    extends Composite<Div>
    implements HasLogger {
  /** Constant <code>NAV="UI5SwitchView"</code> */
  public static final String NAV = "UI5SwitchView";

  /** Constant <code>TEXT_ON="ON"</code> */
  public static final String TEXT_ON  = "ON";
  /** Constant <code>TEXT_OFF="OFF"</code> */
  public static final String TEXT_OFF = "OFF";
  /** Constant <code>ID="id_testelement"</code> */
  public static final String ID       = "id_testelement";
  /** Constant <code>ID_BTN="id_btn"</code> */
  public static final String ID_BTN   = "id_btn";

  /** Constant <code>HTML_BR</code> */
  public static final Html HTML_BR = new Html("<br/>");

  /**
   * <p>Constructor for UI5SwitchView.</p>
   */
  public UI5SwitchView() {
    final Div       content   = getContent();
    final UI5Switch ui5Switch = new UI5Switch();
    ui5Switch.setId(ID);
    ui5Switch.setTextOn(TEXT_ON);
    ui5Switch.setTextOff(TEXT_OFF);
    ui5Switch.addChangeListener(e -> content.add(new Span("clicked"), HTML_BR));
    ui5Switch.setWidth("100px");
    content.add(ui5Switch);
    content.add(HTML_BR);
    final Button button = new Button("switch style");
    button.setId(ID_BTN);
    button.addClickListener((event) -> ui5Switch.setGraphical(!ui5Switch.isGraphical()));
    content.add(button);
    content.add(HTML_BR);
  }
}
