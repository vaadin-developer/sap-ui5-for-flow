package org.rapidpm.vaadin.webcomponents.sapui5;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Popover.TAG_NAME;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;

@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Popover.js")
public class UI5Popover extends Component implements HasComponents{
  protected static final String TAG_NAME = "ui5-popover";

  protected static final String SLOT_DEFAULT = "default";
  protected static final String SLOT_HEADER = "header";
  protected static final String SLORT_FOOTER = "footer";

  private Element contentDiv = new Element("div").setAttribute("slot", SLOT_DEFAULT);
  private Element footerDiv = new Element("div").setAttribute("slot", SLORT_FOOTER);
  private Element headerDiv = new Element("div").setAttribute("slot", SLOT_HEADER);
  private Component content;
  private Component footer;
  private Component header;

  public UI5Popover() {
    super();
  }

  public UI5Popover(Element element) {
    super(element);
  }

  public Component getContent() {
    return content;
  }

  public void setContent(Component content) {
    this.content = content;
    add(content);
    updateSlots();
  }

  public Component getFooter() {
    return footer;
  }

  public void setFooter(Component footer) {
    this.footer = footer;
    updateSlots();
  }

  public void show(Component source) {
    getElement().callJsFunction("openBy", source);
  }
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

  public Component getHeader() {
    return header;
  }

  public void setHeader(Component header) {
    this.header = header;
    updateSlots();
  }


}
