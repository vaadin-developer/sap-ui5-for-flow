package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag(UI5Icon.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Icon.js")
public class UI5Icon
    extends Component {

  public static final String ATTRIBUTE_SRC = "src";
  public static final String TAG_NAME = "ui5-icon";

  public void setSource(String src){
    getElement().setAttribute(ATTRIBUTE_SRC, src);
  }

  public String getSource(){
    return getElement().getAttribute(ATTRIBUTE_SRC);
  }

  public void setSource(UI5Icons icon) {
    setSource(icon.code());
  }
}
