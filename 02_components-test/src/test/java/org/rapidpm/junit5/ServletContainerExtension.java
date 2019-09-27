package org.rapidpm.junit5;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;
import demo.CoreUIJavaService;

import java.util.Optional;


public class ServletContainerExtension
    implements BeforeEachCallback, AfterEachCallback {

  @Override
  public void beforeEach(ExtensionContext ctx) throws Exception {

    final Optional<VaadinTutorial> vaadinTutorial = AnnotationUtils.findAnnotation(ctx.getTestClass(),
                                                                               VaadinTutorial.class);
    final String packageToDeploy = vaadinTutorial.get().packageToDeploy();
    final String[] args       = new String[2];
    args[0]= "-pkg";
    args[1]= packageToDeploy;
//    Stagemonitor.init();
    final CoreUIJavaService uiService = new CoreUIJavaService();
    uiService.startup(args);
    ctx.getStore(ExtensionContext.Namespace.GLOBAL)
       .put(CoreUIJavaService.class.getSimpleName(), uiService);
  }


  @Override
  public void afterEach(ExtensionContext ctx) throws Exception {
    ctx.getStore(ExtensionContext.Namespace.GLOBAL)
       .get(CoreUIJavaService.class.getSimpleName(), CoreUIJavaService.class)
       .shutdown();
  }
}
