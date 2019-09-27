package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;
import org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.ATTRIBUTE_COLOR_SCHEME;
import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.TAG_NAME;

@Element(TAG_NAME)
public class UI5BadgeElement
    extends TestBenchElement {

  public String getColorScheme() {
    return getAttribute(ATTRIBUTE_COLOR_SCHEME);
  }

  public void setColorScheme(UI5Badge.ColorScheme colorScheme) {
    setProperty(ATTRIBUTE_COLOR_SCHEME, colorScheme.asString());
  }

  public void setText(String text) {
    //setProperty();
  }

  @Override
  public String getText() {
    return null;
  }


}
