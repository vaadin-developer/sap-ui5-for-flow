package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("UI5RadioButtonView")
public class UI5RadioButtonView extends Composite<Div> {

  public UI5RadioButtonView() {
    getContent().add(new UI5RadioButton("Button A", "groupA", event -> System.out.println(event)),
        new UI5RadioButton("Button B", "groupA", event -> System.out.println(event)),
        new UI5RadioButton("Disabled", "groupA", true));
  }
}
