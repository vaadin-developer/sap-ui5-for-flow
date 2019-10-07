package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TextAreaView.NAV;


@Route(NAV)
public class UI5TextAreaView extends Composite<Div>
    implements HasLogger {
  public static final String NAV = "UI5TextAreaView";

}
