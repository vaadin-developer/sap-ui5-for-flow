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
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * <p>UI5Card class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
@Tag("ui5-card")
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Card.js")
public class UI5Card extends Component implements HasComponents {
  private static PropertyDescriptor<Boolean, Boolean> headerInteractiveProperty =
      PropertyDescriptors.propertyWithDefault("header-interactive", false);
  private static PropertyDescriptor<String, String> headingProperty =
      PropertyDescriptors.propertyWithDefault("heading", "");
  private static PropertyDescriptor<String, String> subtitleProperty =
      PropertyDescriptors.propertyWithDefault("subtitle", "");
  private static PropertyDescriptor<String, String> statusProperty =
      PropertyDescriptors.propertyWithDefault("status", "");

  /**
   * <p>setStatus.</p>
   *
   * @param status a {@link java.lang.String} object.
   */
  public void setStatus(String status) {
    statusProperty.set(this, status);
  }

  /**
   * <p>getStatus.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getStatus() {
    return statusProperty.get(this);
  }

  /**
   * <p>setSubtitle.</p>
   *
   * @param subtitle a {@link java.lang.String} object.
   */
  public void setSubtitle(String subtitle) {
    subtitleProperty.set(this, subtitle);
  }

  /**
   * <p>getSubtitle.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getSubtitle() {
    return subtitleProperty.get(this);
  }

  /**
   * <p>setHeading.</p>
   *
   * @param heading a {@link java.lang.String} object.
   */
  public void setHeading(String heading) {
    headingProperty.set(this, heading);
  }

  /**
   * <p>getHeading.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getHeading() {
    return headingProperty.get(this);
  }

  /**
   * <p>setHeaderInteractive.</p>
   *
   * @param headerInteractive a boolean.
   */
  public void setHeaderInteractive(boolean headerInteractive) {
    headerInteractiveProperty.set(this, headerInteractive);
  }

  /**
   * <p>isHeaderInteractive.</p>
   *
   * @return a boolean.
   */
  public boolean isHeaderInteractive() {
    return headerInteractiveProperty.get(this);
  }
}
