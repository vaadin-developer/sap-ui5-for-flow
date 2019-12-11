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

import com.vaadin.flow.component.HasElement;
import org.rapidpm.frp.model.Result;

/**
 * <p>HasUI5Icon interface.</p>
 *
 * @author svenruppert
 * @version $Id: $Id
 */
public interface HasUI5Icon
    extends HasElement {

  /**
   * <p>setIcon.</p>
   *
   * @param value a {@link org.rapidpm.vaadin.webcomponents.sapui5.UI5Icons} object.
   */
  public default void setIcon(UI5Icons value) {
    getElement().setAttribute("icon", value.code());
  }

  /**
   * <p>getIcon.</p>
   *
   * @return a {@link org.rapidpm.frp.model.Result} object.
   */
  public default Result<UI5Icons> getIcon() {
    return Result.ofNullable(getElement().getAttribute("icon"))
                 .map(UI5Icons::fromCode);
  }

}
