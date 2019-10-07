package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5BusyIndicator.TAG_NAME;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/BusyIndicator.js")
public class UI5BusyIndicator extends Component {
  protected static final String TAG_NAME = "ui5-busyindicator";

  protected static final String ATTRIBUTE_ACTIVE = "active";
  protected static final String ATTRIBUTE_SIZE = "size";

  public UI5BusyIndicator() {
    super();
    setDefaults();
  }

  public UI5BusyIndicator(Element element) {
    super(element);
    setDefaults();
  }

  private void setDefaults() {
    this.setSize(UI5BusyIndiciatorType.LARGE);
    this.setActive(true);
  }

  public void setSize(UI5BusyIndiciatorType size) {
    getElement().setAttribute(ATTRIBUTE_SIZE, size.getAttributeName());
  }

  public void setActive(boolean active) {
    getElement().setAttribute(ATTRIBUTE_ACTIVE, active);
  }

  public boolean isActive() {
    return getElement().hasAttribute(ATTRIBUTE_ACTIVE);
  }
}
