package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItem.*;


@Element(TAG_NAME)
public class UI5TimelineItemElement extends TestBenchElement {

  public void setItemName(String value) {
    setProperty(ATTRIBUTE_ITEM_NAME, value);
  }

  public String getItemName() {
    return getPropertyString(ATTRIBUTE_ITEM_NAME);
  }

  public void setItemNameClickable(Boolean value) {
    setProperty(ATTRIBUTE_ITEM_NAME_CLICKABLE, value);
  }

  public Boolean getItemNameClickable() {
    return Boolean.parseBoolean(getPropertyString(ATTRIBUTE_ITEM_NAME_CLICKABLE));
  }

  public void setSubtitleText(String value) {
    setProperty(ATTRIBUTE_SUBTITLE_TEXT, value);
  }

  public Boolean getSubtitleText() {
    return Boolean.parseBoolean(getPropertyString(ATTRIBUTE_SUBTITLE_TEXT));
  }

  public void setTitleText(String value) {
    setProperty(ATTRIBUTE_TITLE_TEXT, value);
  }

  public Boolean getTitleText() {
    return Boolean.parseBoolean(getPropertyString(ATTRIBUTE_TITLE_TEXT));
  }
}
