// @GENERATOR:play-routes-compiler
// @SOURCE:/media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/conf/routes
// @DATE:Thu Aug 03 08:56:50 WAT 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseApiHelpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def getResources(): Call = {
    
      () match {
      
        // @LINE:2
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api-docs.json")
      
      }
    
    }
  
    // @LINE:3
    def getResource(): Call = {
    
      () match {
      
        // @LINE:3
        case ()  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/auth"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "api-docs.json/auth")
      
      }
    
    }
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def preflight(all:String): Call = {
      
      Call("OPTIONS", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("all", all))
    }
  
    // @LINE:19
    def api(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api-docs")
    }
  
    // @LINE:14
    def swagger(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "docs")
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:15
    def error(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api-server/error")
      
      }
    
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:7
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "api-server/assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:22
  class ReversePermissionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def createPermission(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "permission/create")
    }
  
  }


}
