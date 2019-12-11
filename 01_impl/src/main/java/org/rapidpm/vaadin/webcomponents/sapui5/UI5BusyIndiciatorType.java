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

/**
 * <p>UI5BusyIndiciatorType class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public enum UI5BusyIndiciatorType {
  SMALL("Small"), MEDIUM("Medium"), LARGE("Large");

  private final String attributeName;

  private UI5BusyIndiciatorType(String attributeName) {
    this.attributeName = attributeName;
  }

  /**
   * <p>Getter for the field <code>attributeName</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getAttributeName() {
    return attributeName;
  }

}
