package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5PopOverView.NAV;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5PopOverView extends Composite<Div> {
  public static final String NAV = "UI5PopOverView";

  public UI5PopOverView() {
    final UI5Button ui5Button = new UI5Button();
    ui5Button.setText("Hello, UI5");
    ui5Button.setDesign(UI5ButtonDesign.EMPHASIZED);
    ui5Button.setId("BLABLABLAID");
    ui5Button.addClickListener(event -> {
      UI5Popover popover = new UI5Popover();

      UI5Badge badge = new UI5Badge();
      badge.setText("BLABLABLA");
      popover.setContent(badge);
      popover.setFooter(new Text("FOOTER"));
      popover.setHeader(new Text("HEADER"));
      getContent().add(popover);

      popover.show(ui5Button);
    });
    getContent().add(ui5Button);

  }
}
