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
import com.vaadin.flow.dom.Element;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Popover.TAG_NAME;

/**
 * <p>UI5Popover class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Popover.js")
public class UI5Popover
    extends Component
    implements HasComponents {
  /** Constant <code>TAG_NAME="ui5-popover"</code> */
  protected static final String TAG_NAME = "ui5-popover";

  /** Constant <code>SLOT_DEFAULT="default"</code> */
  protected static final String SLOT_DEFAULT = "default";
  /** Constant <code>SLOT_HEADER="header"</code> */
  protected static final String SLOT_HEADER  = "header";
  /** Constant <code>SLORT_FOOTER="footer"</code> */
  protected static final String SLORT_FOOTER = "footer";

  private Element   contentDiv = new Element("div").setAttribute("slot", SLOT_DEFAULT);
  private Element   footerDiv  = new Element("div").setAttribute("slot", SLORT_FOOTER);
  private Element   headerDiv  = new Element("div").setAttribute("slot", SLOT_HEADER);
  private Component content;
  private Component footer;
  private Component header;

  /**
   * <p>Constructor for UI5Popover.</p>
   */
  public UI5Popover() {
    super();
  }

  /**
   * <p>Constructor for UI5Popover.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5Popover(Element element) {
    super(element);
  }

  /**
   * <p>Getter for the field <code>content</code>.</p>
   *
   * @return a {@link com.vaadin.flow.component.Component} object.
   */
  public Component getContent() {
    return content;
  }

  /**
   * <p>Setter for the field <code>content</code>.</p>
   *
   * @param content a {@link com.vaadin.flow.component.Component} object.
   */
  public void setContent(Component content) {
    this.content = content;
    add(content);
    updateSlots();
  }

  /**
   * <p>Getter for the field <code>footer</code>.</p>
   *
   * @return a {@link com.vaadin.flow.component.Component} object.
   */
  public Component getFooter() {
    return footer;
  }

  /**
   * <p>Setter for the field <code>footer</code>.</p>
   *
   * @param footer a {@link com.vaadin.flow.component.Component} object.
   */
  public void setFooter(Component footer) {
    this.footer = footer;
    updateSlots();
  }

  /**
   * <p>show.</p>
   *
   * @param source a {@link com.vaadin.flow.component.Component} object.
   */
  public void show(Component source) {
    getElement().callJsFunction("openBy", source);
  }

  /**
   * <p>close.</p>
   */
  public void close() {
    getElement().callJsFunction("close");
  }

  private void updateSlots() {
    return;
//    getElement().removeChild(headerDiv);
//    getElement().removeChild(footerDiv);
//    getElement().removeChild(contentDiv);
//    if (header != null) {
//      headerDiv.removeAllChildren();
//      headerDiv.appendChild(header.getElement());
//    }
//    if (footer != null) {
//      footerDiv.removeAllChildren();
//      footerDiv.appendChild(footer.getElement());
//    }
//    if (content != null) {
//      contentDiv.removeAllChildren();
//      contentDiv.appendChild(content.getElement());
//    }
  }

  /**
   * <p>Getter for the field <code>header</code>.</p>
   *
   * @return a {@link com.vaadin.flow.component.Component} object.
   */
  public Component getHeader() {
    return header;
  }

  /**
   * <p>Setter for the field <code>header</code>.</p>
   *
   * @param header a {@link com.vaadin.flow.component.Component} object.
   */
  public void setHeader(Component header) {
    this.header = header;
    updateSlots();
  }


}
