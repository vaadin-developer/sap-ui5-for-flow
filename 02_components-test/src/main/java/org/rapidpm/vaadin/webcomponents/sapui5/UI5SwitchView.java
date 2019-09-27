package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5SwitchView.NAV;

@Route(NAV)
public class UI5SwitchView
    extends Composite<Div>
    implements HasLogger {
  public static final String NAV = "UI5SwitchView";

  public static final String TEXT_ON  = "ON";
  public static final String TEXT_OFF = "OFF";
  public static final String ID       = "element-to-test";

  public final Html HTML_BR = new Html("<br/>");

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
    button.addClickListener((event) -> ui5Switch.setGraphical(!ui5Switch.isGraphical()));
    content.add(button);
    content.add(HTML_BR);
  }
}
