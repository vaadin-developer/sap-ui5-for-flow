package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;
import org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon.ATTRIBUTE_SRC;
import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon.TAG_NAME;

@Element(TAG_NAME)
public class UI5IconElement
    extends TestBenchElement {

  public String getUI5IconAsString() {
    return getPropertyString(ATTRIBUTE_SRC);
  }

//  public UI5Icon getUI5Icon() {
//    final String value = getPropertyString(ATTRIBUTE_SRC);
//    return (value != null)
//        ? UI5Icons.fromCode(value)
//           : UI5Icons.NONE;
//  }

  public void setUI5Icon(UI5Icon ui5Icon) {
    setProperty(ATTRIBUTE_SRC, ui5Icon.getSource());
  }

}
