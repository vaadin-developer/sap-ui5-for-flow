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

/**
 * <p>UI5Icons class.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public enum UI5Icons {

  NONE("sap-icon://none"),
  ADD_EQUIPMENT("sap-icon://add-equipment"),
  PHONE("sap-icon://phone"),
  NUTRITION_ACTIVITY("sap-icon://nutrition-activity");

  /**
   * <p>code.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  /**
   * <p>code.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  /**
   * <p>code.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  /**
   * <p>code.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  /**
   * <p>code.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  private String code;

  public String code() {
    return this.code;
  }

  /**
   * <p>asUI5Icon.</p>
   *
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icon} object.
   */
  public UI5Icon asUI5Icon() {
    final UI5Icon ui5Icon = new UI5Icon();
    ui5Icon.setSource(this);
    return ui5Icon;
  }

  /**
   * <p>fromCode.</p>
   *
   * @param code a {@link java.lang.String} object.
   * @return a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   */
  public static UI5Icons fromCode(String code) {
    return Arrays.stream(UI5Icons.values())
                 .filter(i -> i.code.equals(code))
                 .findFirst()
                 .orElse(NONE);
  }

  UI5Icons(String code) {
    this.code = code;
  }
}
