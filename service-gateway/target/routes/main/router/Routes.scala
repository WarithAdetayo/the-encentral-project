// @GENERATOR:play-routes-compiler
// @SOURCE:/media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/conf/routes
// @DATE:Thu Aug 03 08:56:50 WAT 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  ApiHelpController_3: controllers.ApiHelpController,
  // @LINE:7
  Assets_2: controllers.Assets,
  // @LINE:9
  HomeController_1: controllers.HomeController,
  // @LINE:22
  PermissionController_0: controllers.PermissionController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    ApiHelpController_3: controllers.ApiHelpController,
    // @LINE:7
    Assets_2: controllers.Assets,
    // @LINE:9
    HomeController_1: controllers.HomeController,
    // @LINE:22
    PermissionController_0: controllers.PermissionController
  ) = this(errorHandler, ApiHelpController_3, Assets_2, HomeController_1, PermissionController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApiHelpController_3, Assets_2, HomeController_1, PermissionController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-docs.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-docs.json/auth""", """controllers.ApiHelpController.getResource(path:String = "/auth")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-server/api-docs.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-server/api-docs.json/auth""", """controllers.ApiHelpController.getResource(path:String = "/auth")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-server/assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """all<.+>""", """controllers.HomeController.preflight(all:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docs""", """controllers.HomeController.swagger()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-server/error""", """controllers.HomeController.error()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-server/error/""", """controllers.HomeController.error()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error""", """controllers.HomeController.error()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """error/""", """controllers.HomeController.error()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api-docs""", """controllers.HomeController.api()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """permission/create""", """controllers.PermissionController.createPermission()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_ApiHelpController_getResources0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-docs.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources0_invoker = createInvoker(
    ApiHelpController_3.getResources,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      this.prefix + """api-docs.json""",
      """swagger""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_ApiHelpController_getResource1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-docs.json/auth")))
  )
  private[this] lazy val controllers_ApiHelpController_getResource1_invoker = createInvoker(
    ApiHelpController_3.getResource(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResource",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api-docs.json/auth""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ApiHelpController_getResources2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-server/api-docs.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources2_invoker = createInvoker(
    ApiHelpController_3.getResources,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      this.prefix + """api-server/api-docs.json""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ApiHelpController_getResource3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-server/api-docs.json/auth")))
  )
  private[this] lazy val controllers_ApiHelpController_getResource3_invoker = createInvoker(
    ApiHelpController_3.getResource(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResource",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api-server/api-docs.json/auth""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-server/assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """api-server/assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index6_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_preflight7_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("all", """.+""",false)))
  )
  private[this] lazy val controllers_HomeController_preflight7_invoker = createInvoker(
    HomeController_1.preflight(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "preflight",
      Seq(classOf[String]),
      "OPTIONS",
      this.prefix + """""" + "$" + """all<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_swagger8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docs")))
  )
  private[this] lazy val controllers_HomeController_swagger8_invoker = createInvoker(
    HomeController_1.swagger(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "swagger",
      Nil,
      "GET",
      this.prefix + """docs""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_error9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-server/error")))
  )
  private[this] lazy val controllers_HomeController_error9_invoker = createInvoker(
    HomeController_1.error(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "error",
      Nil,
      "GET",
      this.prefix + """api-server/error""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_error10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-server/error/")))
  )
  private[this] lazy val controllers_HomeController_error10_invoker = createInvoker(
    HomeController_1.error(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "error",
      Nil,
      "GET",
      this.prefix + """api-server/error/""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_error11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error")))
  )
  private[this] lazy val controllers_HomeController_error11_invoker = createInvoker(
    HomeController_1.error(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "error",
      Nil,
      "GET",
      this.prefix + """error""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_error12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("error/")))
  )
  private[this] lazy val controllers_HomeController_error12_invoker = createInvoker(
    HomeController_1.error(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "error",
      Nil,
      "GET",
      this.prefix + """error/""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_api13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api-docs")))
  )
  private[this] lazy val controllers_HomeController_api13_invoker = createInvoker(
    HomeController_1.api(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "api",
      Nil,
      "GET",
      this.prefix + """api-docs""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PermissionController_createPermission14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("permission/create")))
  )
  private[this] lazy val controllers_PermissionController_createPermission14_invoker = createInvoker(
    PermissionController_0.createPermission(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PermissionController",
      "createPermission",
      Nil,
      "POST",
      this.prefix + """permission/create""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_ApiHelpController_getResources0_route(params@_) =>
      call { 
        controllers_ApiHelpController_getResources0_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:3
    case controllers_ApiHelpController_getResource1_route(params@_) =>
      call(Param[String]("path", Right("/auth"))) { (path) =>
        controllers_ApiHelpController_getResource1_invoker.call(ApiHelpController_3.getResource(path))
      }
  
    // @LINE:4
    case controllers_ApiHelpController_getResources2_route(params@_) =>
      call { 
        controllers_ApiHelpController_getResources2_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:5
    case controllers_ApiHelpController_getResource3_route(params@_) =>
      call(Param[String]("path", Right("/auth"))) { (path) =>
        controllers_ApiHelpController_getResource3_invoker.call(ApiHelpController_3.getResource(path))
      }
  
    // @LINE:7
    case controllers_Assets_at4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:8
    case controllers_Assets_at5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:9
    case controllers_HomeController_index6_route(params@_) =>
      call { 
        controllers_HomeController_index6_invoker.call(HomeController_1.index)
      }
  
    // @LINE:11
    case controllers_HomeController_preflight7_route(params@_) =>
      call(params.fromPath[String]("all", None)) { (all) =>
        controllers_HomeController_preflight7_invoker.call(HomeController_1.preflight(all))
      }
  
    // @LINE:14
    case controllers_HomeController_swagger8_route(params@_) =>
      call { 
        controllers_HomeController_swagger8_invoker.call(HomeController_1.swagger())
      }
  
    // @LINE:15
    case controllers_HomeController_error9_route(params@_) =>
      call { 
        controllers_HomeController_error9_invoker.call(HomeController_1.error())
      }
  
    // @LINE:16
    case controllers_HomeController_error10_route(params@_) =>
      call { 
        controllers_HomeController_error10_invoker.call(HomeController_1.error())
      }
  
    // @LINE:17
    case controllers_HomeController_error11_route(params@_) =>
      call { 
        controllers_HomeController_error11_invoker.call(HomeController_1.error())
      }
  
    // @LINE:18
    case controllers_HomeController_error12_route(params@_) =>
      call { 
        controllers_HomeController_error12_invoker.call(HomeController_1.error())
      }
  
    // @LINE:19
    case controllers_HomeController_api13_route(params@_) =>
      call { 
        controllers_HomeController_api13_invoker.call(HomeController_1.api())
      }
  
    // @LINE:22
    case controllers_PermissionController_createPermission14_route(params@_) =>
      call { 
        controllers_PermissionController_createPermission14_invoker.call(PermissionController_0.createPermission())
      }
  }
}
