package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TextAreaView.NAV;
import org.rapidpm.dependencies.core.logger.HasLogger;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(NAV)
public class UI5TextAreaView extends Composite<Div> implements HasLogger {
  public static final String NAV = "UI5TextAreaView";

  public UI5TextAreaView() {
    UI5TextArea textArea = new UI5TextArea();
    textArea.setPlaceholder("Type here...");
    textArea.addValueChangeListener(event -> System.out.println(event.getValue()));

    UI5TextArea textAreaMaxLength = new UI5TextArea(30, true);
    textAreaMaxLength.setPlaceholder("Type here, but max 30 chars...");

    UI5TextArea textAreaWithValue = new UI5TextArea();
    textAreaWithValue.setValue("Pre set value");

    getContent().add(textArea, textAreaMaxLength, textAreaWithValue);
  }
}
