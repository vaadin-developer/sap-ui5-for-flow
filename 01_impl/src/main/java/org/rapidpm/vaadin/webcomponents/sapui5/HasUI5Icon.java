package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.HasElement;
import org.rapidpm.frp.model.Result;

public interface HasUI5Icon
    extends HasElement {

  public default void setIcon(UI5Icons value) {
    getElement().setAttribute("icon", value.code());
  }

  public default Result<UI5Icons> getIcon() {
    return Result.ofNullable(getElement().getAttribute("icon"))
                 .map(UI5Icons::fromCode);
  }

}
