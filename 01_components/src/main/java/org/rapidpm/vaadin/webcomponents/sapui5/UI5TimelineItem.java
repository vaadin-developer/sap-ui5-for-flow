package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.DomEventListener;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItem.TAG_NAME;

@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/TimelineItem.js")
public class UI5TimelineItem
    extends Component
    implements HasLogger, HasComponents, HasUI5Icon {

  protected static final String TAG_NAME                      = "ui5-timeline-item";
  protected static final String ATTRIBUTE_ITEM_NAME           = "itemName";
  protected static final String ATTRIBUTE_ITEM_NAME_CLICKABLE = "itemNameClickable";
  protected static final String ATTRIBUTE_SUBTITLE_TEXT       = "subtitleText";
  protected static final String ATTRIBUTE_TITLE_TEXT          = "titleText";
  protected static final String EVENT_ITEM_NAME_CLICK         = "itemNameClick";

  public void setItemName(String value) {
    getElement().setProperty(ATTRIBUTE_ITEM_NAME, value);
  }

  public String getItemName() {
    return getElement().getProperty(ATTRIBUTE_ITEM_NAME);
  }

  public void setItemNameClickable(Boolean value) {
    getElement().setProperty(ATTRIBUTE_ITEM_NAME_CLICKABLE, value);
  }

  public Boolean getItemNameClickable() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_ITEM_NAME_CLICKABLE));
  }

  public void setSubtitleText(String value) {
    getElement().setProperty(ATTRIBUTE_SUBTITLE_TEXT, value);
  }

  public Boolean getSubtitleText() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_SUBTITLE_TEXT));
  }

  public void setTitleText(String value) {
    getElement().setProperty(ATTRIBUTE_TITLE_TEXT, value);
  }

  public Boolean getTitleText() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_TITLE_TEXT));
  }

  public void addItemNameClickEventListener(TimeLineItemClicked listener) {
    getElement().addEventListener(EVENT_ITEM_NAME_CLICK, listener);
  }

  public static interface TimeLineItemClicked
      extends DomEventListener {

  }

}
