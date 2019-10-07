package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5IconView.NAV;

@Route(NAV)
public class UI5IconView extends Composite<Div>
    implements HasLogger {
  public static final String NAV = "UI5IconView";


  public UI5IconView() {
    final UI5Icon ui5Icon = new UI5Icon();
    ui5Icon.setSource(UI5Icons.PHONE);
    getContent().add(ui5Icon);
  }
}
