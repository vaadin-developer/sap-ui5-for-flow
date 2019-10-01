package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

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

  public void setStatus(String status) {
    statusProperty.set(this, status);
  }

  public String getStatus() {
    return statusProperty.get(this);
  }

  public void setSubtitle(String subtitle) {
    subtitleProperty.set(this, subtitle);
  }

  public String getSubtitle() {
    return subtitleProperty.get(this);
  }

  public void setHeading(String heading) {
    headingProperty.set(this, heading);
  }

  public String getHeading() {
    return headingProperty.get(this);
  }

  public void setHeaderInteractive(boolean headerInteractive) {
    headerInteractiveProperty.set(this, headerInteractive);
  }

  public boolean isHeaderInteractive() {
    return headerInteractiveProperty.get(this);
  }
}
