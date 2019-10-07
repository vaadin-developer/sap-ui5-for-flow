package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag(UI5Button.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Button.js")
public class UI5Button extends Component implements HasSize, HasStyle, HasText, HasUI5Icon,
    HasUI5IconEnd, HasUI5Disabled, HasUI5ButtonDesign, ClickNotifier<UI5Button> {

  protected static final String TAG_NAME = "ui5-button";

  public UI5Button() {
    setDefaults();
  }

  public UI5Button(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    // NOOP
  }

}
