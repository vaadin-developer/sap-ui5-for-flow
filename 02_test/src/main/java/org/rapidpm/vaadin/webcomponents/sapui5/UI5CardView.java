package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5CardView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5CardView extends Composite<Div> {
  public static final String NAV = "UI5CardView";

  public UI5CardView() {
    UI5Card ui5Card = new UI5Card();
    ui5Card.setHeading("A UI 5 Card");
    ui5Card.setStatus("active");
    ui5Card.setSubtitle("a mapped web component");
    ui5Card.add(new H1("Content"));
    getContent().add(ui5Card);
  }
}
