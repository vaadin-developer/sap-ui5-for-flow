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
