// @GENERATOR:play-routes-compiler
// @SOURCE:/media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/conf/routes
// @DATE:Thu Aug 03 08:56:50 WAT 2023

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseApiHelpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def getResources: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHelpController.getResources",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-docs.json"})
          }
        
        }
      """
    )
  
    // @LINE:3
    def getResource: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHelpController.getResource",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-docs.json/auth"})
          }
        
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def preflight: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.preflight",
      """
        function(all0) {
          return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("all", all0)})
        }
      """
    )
  
    // @LINE:19
    def api: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.api",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-docs"})
        }
      """
    )
  
    // @LINE:14
    def swagger: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.swagger",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docs"})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:15
    def error: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.error",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-server/error"})
          }
        
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api-server/assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:22
  class ReversePermissionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def createPermission: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PermissionController.createPermission",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "permission/create"})
        }
      """
    )
  
  }


}
