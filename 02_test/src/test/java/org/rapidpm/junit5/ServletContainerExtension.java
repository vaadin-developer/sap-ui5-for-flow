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
package org.rapidpm.junit5;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;
import org.rapidpm.vaadin.nano.CoreUIServiceJava;

import java.util.Optional;


public class ServletContainerExtension
    implements BeforeEachCallback, AfterEachCallback {

  @Override
  public void beforeEach(ExtensionContext ctx) throws Exception {

    final Optional<VaadinTutorial> vaadinTutorial = AnnotationUtils.findAnnotation(ctx.getTestClass(),
                                                                                   VaadinTutorial.class);
    final String   packageToDeploy = vaadinTutorial.get()
                                                   .packageToDeploy();
    final String[] args            = new String[2];
    args[0] = "-pkg";
    args[1] = packageToDeploy;
    final CoreUIServiceJava coreUIServiceJava = new CoreUIServiceJava().executeCLI(args);
    coreUIServiceJava.startup();
    ctx.getStore(ExtensionContext.Namespace.GLOBAL)
       .put(CoreUIServiceJava.class.getSimpleName(), coreUIServiceJava);
  }


  @Override
  public void afterEach(ExtensionContext ctx) throws Exception {
    ctx.getStore(ExtensionContext.Namespace.GLOBAL)
       .get(CoreUIServiceJava.class.getSimpleName(), CoreUIServiceJava.class)
       .shutdown();
  }
}
