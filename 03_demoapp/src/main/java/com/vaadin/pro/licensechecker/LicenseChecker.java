package com.vaadin.pro.licensechecker;

import java.util.logging.Logger;

public class LicenseChecker {

  public interface Callback {

    public void ok();

    public void failed(Exception e);
  }

  public static void checkLicenseFromStaticBlock(String productName,
                                                 String productVersion) {

  }

  public static void checkLicense(String productName, String productVersion) {
  }

  public static void checkLicenseAsync(String productName,
                                       String productVersion, Callback callback) {

  }

  private static void checkLicense(Product product) {

  }

  public static Logger getLogger() {
    return Logger.getLogger(LicenseChecker.class.getName());
  }

}
