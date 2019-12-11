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

import java.util.Arrays;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

/**
 * <p>UI5Link class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag(UI5Link.TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Link.js")
public class UI5Link extends Component
    implements HasUI5Disabled, HasUI5Wrap, HasText, ClickNotifier<UI5Link> {
  /** Constant <code>TAG_NAME="ui5-link"</code> */
  protected static final String TAG_NAME = "ui5-link";

  public static enum UI5LinkDesign {
    DEFAULT("Default"), SUBTLE("Subtle"), EMPHASIZED("Emphasized");

    private final String attributeName;

    private UI5LinkDesign(String attributeName) {
      this.attributeName = attributeName;
    }

    public String getAttributeName() {
      return attributeName;
    }

    public static UI5LinkDesign fromAttributeName(String attributeName) {
      return Arrays.stream(UI5LinkDesign.values())
          .filter(i -> i.attributeName.equals(attributeName)).findFirst().orElse(null);
    }
  }

  private static PropertyDescriptor<String, String> hrefProperty =
      PropertyDescriptors.propertyWithDefault("href", "");
  private static PropertyDescriptor<String, String> targetProperty =
      PropertyDescriptors.propertyWithDefault("target", "");
  private PropertyDescriptor<String, String> designProperty =
      PropertyDescriptors.propertyWithDefault("design", UI5LinkDesign.DEFAULT.attributeName);

  /**
   * <p>Constructor for UI5Link.</p>
   */
  public UI5Link() {
    super();
  }

  /**
   * <p>Constructor for UI5Link.</p>
   *
   * @param element a {@link com.vaadin.flow.dom.Element} object.
   */
  public UI5Link(Element element) {
    super(element);
  }

  /**
   * <p>Constructor for UI5Link.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param href a {@link java.lang.String} object.
   * @param target a {@link java.lang.String} object.
   */
  public UI5Link(String text, String href, String target) {
    this();
    setHref(href);
    setTarget(target);
    setText(text);
  }

  /**
   * <p>Constructor for UI5Link.</p>
   *
   * @param text a {@link java.lang.String} object.
   * @param href a {@link java.lang.String} object.
   * @param design a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Link.UI5LinkDesign} object.
   */
  public UI5Link(String text, String href, UI5LinkDesign design) {
    this();
    setHref(href);
    setText(text);
    setDesign(design);
  }

  /**
   * <p>setHref.</p>
   *
   * @param href a {@link java.lang.String} object.
   */
  public void setHref(String href) {
    hrefProperty.set(getElement(), href);
  }

  /**
   * <p>setTarget.</p>
   *
   * @param target a {@link java.lang.String} object.
   */
  public void setTarget(String target) {
    targetProperty.set(getElement(), target);
  }

  /**
   * <p>getHref.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getHref() {
    return hrefProperty.get(getElement());
  }

  /**
   * <p>getTarget.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getTarget() {
    return targetProperty.get(getElement());
  }

  /**
   * <p>setDesign.</p>
   *
   * @param design a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Link.UI5LinkDesign} object.
   */
  public void setDesign(UI5LinkDesign design) {
    designProperty.set(getElement(), design.getAttributeName());
  }

  /**
   * <p>getDesign.</p>
   *
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Link.UI5LinkDesign} object.
   */
  public UI5LinkDesign getDesign() {
    return UI5LinkDesign.fromAttributeName(designProperty.get(getElement()));
  }
}
