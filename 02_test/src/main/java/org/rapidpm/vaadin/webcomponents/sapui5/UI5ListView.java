package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5ListView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5ListView extends Composite<VerticalLayout> {
  public static final String NAV = "UI5ListView";

  public UI5ListView() {
    UI5List simpleList = new UI5List("Simple list",
        new UI5Li("Pineapple", UI5Icons.NUTRITION_ACTIVITY, "In-stock",
            "Tropical plant with an edible fruit"),
        new UI5Li("Orange", UI5Icons.NUTRITION_ACTIVITY, "Expires",
            "Occurs between red and yellow"),
        new UI5Li("Banana", UI5Icons.NUTRITION_ACTIVITY, "Re-stock", "The yellow lengthy fruit"),
        new UI5Li("Mango", UI5Icons.NUTRITION_ACTIVITY, "Re-stock", "The tropical stone fruit"));

    getContent().add(simpleList);
  }
}
