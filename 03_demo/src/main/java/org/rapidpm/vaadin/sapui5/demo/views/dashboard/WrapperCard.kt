package org.rapidpm.vaadin.sapui5.demo.views.dashboard

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div

class WrapperCard(className: String, components: Array<Component>,
                  vararg classes: String) : Div() {
  init {
    addClassName(className)
    val card = Div()
    card.addClassNames(*classes)
    card.add(*components)
    add(card)
  }
}
