// @GENERATOR:play-routes-compiler
// @SOURCE:/media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/conf/routes
// @DATE:Thu Aug 03 08:56:50 WAT 2023

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApiHelpController ApiHelpController = new controllers.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePermissionController PermissionController = new controllers.ReversePermissionController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApiHelpController ApiHelpController = new controllers.javascript.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePermissionController PermissionController = new controllers.javascript.ReversePermissionController(RoutesPrefix.byNamePrefix());
  }

}
