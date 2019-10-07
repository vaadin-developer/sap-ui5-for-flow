package org.rapidpm.vaadin.sapui5.demo.views.dashboard.components;

import org.rapidpm.vaadin.sapui5.demo.MainView;
import org.rapidpm.vaadin.webcomponents.sapui5.UI5TextArea;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = "textArea", layout = MainView.class)
public class TextAreaView extends Div {
  private final UI5TextArea textArea;

  public TextAreaView() {
    this.textArea = new UI5TextArea();
    add(textArea);
  }
}
