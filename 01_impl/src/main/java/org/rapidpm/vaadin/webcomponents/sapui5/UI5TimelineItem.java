/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.DomEventListener;
import org.rapidpm.dependencies.core.logger.HasLogger;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItem.TAG_NAME;

/**
 * <p>UI5TimelineItem class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/TimelineItem.js")
public class UI5TimelineItem
    extends Component
    implements HasLogger, HasComponents, HasUI5Icon {

  /** Constant <code>TAG_NAME="ui5-timeline-item"</code> */
  protected static final String TAG_NAME                      = "ui5-timeline-item";
  /** Constant <code>ATTRIBUTE_ITEM_NAME="itemName"</code> */
  protected static final String ATTRIBUTE_ITEM_NAME           = "itemName";
  /** Constant <code>ATTRIBUTE_ITEM_NAME_CLICKABLE="itemNameClickable"</code> */
  protected static final String ATTRIBUTE_ITEM_NAME_CLICKABLE = "itemNameClickable";
  /** Constant <code>ATTRIBUTE_SUBTITLE_TEXT="subtitleText"</code> */
  protected static final String ATTRIBUTE_SUBTITLE_TEXT       = "subtitleText";
  /** Constant <code>ATTRIBUTE_TITLE_TEXT="titleText"</code> */
  protected static final String ATTRIBUTE_TITLE_TEXT          = "titleText";
  /** Constant <code>EVENT_ITEM_NAME_CLICK="itemNameClick"</code> */
  protected static final String EVENT_ITEM_NAME_CLICK         = "itemNameClick";

  /**
   * <p>setItemName.</p>
   *
   * @param value a {@link java.lang.String} object.
   */
  public void setItemName(String value) {
    getElement().setProperty(ATTRIBUTE_ITEM_NAME, value);
  }

  /**
   * <p>getItemName.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getItemName() {
    return getElement().getProperty(ATTRIBUTE_ITEM_NAME);
  }

  /**
   * <p>setItemNameClickable.</p>
   *
   * @param value a {@link java.lang.Boolean} object.
   */
  public void setItemNameClickable(Boolean value) {
    getElement().setProperty(ATTRIBUTE_ITEM_NAME_CLICKABLE, value);
  }

  /**
   * <p>getItemNameClickable.</p>
   *
   * @return a {@link java.lang.Boolean} object.
   */
  public Boolean getItemNameClickable() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_ITEM_NAME_CLICKABLE));
  }

  /**
   * <p>setSubtitleText.</p>
   *
   * @param value a {@link java.lang.String} object.
   */
  public void setSubtitleText(String value) {
    getElement().setProperty(ATTRIBUTE_SUBTITLE_TEXT, value);
  }

  /**
   * <p>getSubtitleText.</p>
   *
   * @return a {@link java.lang.Boolean} object.
   */
  public Boolean getSubtitleText() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_SUBTITLE_TEXT));
  }

  /**
   * <p>setTitleText.</p>
   *
   * @param value a {@link java.lang.String} object.
   */
  public void setTitleText(String value) {
    getElement().setProperty(ATTRIBUTE_TITLE_TEXT, value);
  }

  /**
   * <p>getTitleText.</p>
   *
   * @return a {@link java.lang.Boolean} object.
   */
  public Boolean getTitleText() {
    return Boolean.parseBoolean(getElement().getProperty(ATTRIBUTE_TITLE_TEXT));
  }

  /**
   * <p>addItemNameClickEventListener.</p>
   *
   * @param listener a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5TimelineItem.TimeLineItemClicked} object.
   */
  public void addItemNameClickEventListener(TimeLineItemClicked listener) {
    getElement().addEventListener(EVENT_ITEM_NAME_CLICK, listener);
  }

  public static interface TimeLineItemClicked
      extends DomEventListener {

  }

}
