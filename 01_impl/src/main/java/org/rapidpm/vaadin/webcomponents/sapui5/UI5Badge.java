package org.rapidpm.vaadin.webcomponents.sapui5;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import static org.rapidpm.vaadin.webcomponents.sapui5.UI5Badge.TAG_NAME;


@Tag(TAG_NAME)
@NpmPackage(value = "@ui5/webcomponents", version = UI5VersionDefinitions.UI5_VERSION)
@JsModule("@ui5/webcomponents/dist/Badge.js")
public class UI5Badge
    extends Component
    implements HasSize, HasStyle, HasText, HasComponents {

  public static final String TAG_NAME               = "ui5-badge";
  public static final String ATTRIBUTE_COLOR_SCHEME = "colorScheme";

  public String getColorScheme() {
    return getElement().getProperty(ATTRIBUTE_COLOR_SCHEME);
  }

  public void setColorScheme(ColorScheme colorScheme) {
    getElement().setProperty(ATTRIBUTE_COLOR_SCHEME, colorScheme.asString());
  }

  public void setUI5Icon(UI5Icon icon) {
    getElement().appendChild(icon.getElement());
  }


  @Override
  public void setText(String text) {
    add(text);
  }

  @Override
  public String getText() {
    return getElement().getTextRecursively();
  }

  public enum ColorScheme {
    One(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    private int colorScheme;

    ColorScheme(int i) {
      this.colorScheme = i;
    }

    public int value() {
      return this.colorScheme;
    }

    public String asString() {
      return String.valueOf(value());
    }

  }

}
