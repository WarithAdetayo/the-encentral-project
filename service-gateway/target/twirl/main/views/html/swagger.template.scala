
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
/*1.2*/import play.api.Play.current

object swagger extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Swagger UI</title>
    <link href="assets/images/favicon-32x32.png" rel="icon" sizes="32x32" type="image/png"/>
    <link href="assets/images/favicon-16x16.png" rel="icon" sizes="16x16" type="image/png"/>
    <link href='/api-server/assets/css/typography.css' media='screen' rel='stylesheet' type='text/css'/>
    <link href='/api-server/assets/css/reset.css' media='screen' rel='stylesheet' type='text/css'/>
    <link href='/api-server/assets/css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
    <link href='/api-server/assets/css/reset.css' media='print' rel='stylesheet' type='text/css'/>
    <link href='/api-server/assets/css/print.css' media='print' rel='stylesheet' type='text/css'/>

    <script src='/api-server/assets/lib/object-assign-pollyfill.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/jquery-1.8.0.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/jquery.slideto.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/jquery.wiggle.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/handlebars-2.0.0.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/js-yaml.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/lodash.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/backbone-min.js' type='text/javascript'></script>
    <script src='/api-server/assets/swagger-ui.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/highlight.9.1.0.pack.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/highlight.9.1.0.pack_extended.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/jsoneditor.min.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/marked.js' type='text/javascript'></script>
    <script src='/api-server/assets/lib/swagger-oauth.js' type='text/javascript'></script>

    <!-- Some basic translations -->
    <!-- <script src='lang/translator.js' impl='text/javascript'></script> -->
    <!-- <script src='lang/ru.js' impl='text/javascript'></script> -->
    <!-- <script src='lang/en.js' impl='text/javascript'></script> -->

    <script type="text/javascript">

            $(function () """),format.raw/*38.27*/("""{"""),format.raw/*38.28*/("""
            """),format.raw/*39.13*/("""var url = window.location.search.match(/url=([^&]+)/);
            if (url && url.length > 1) """),format.raw/*40.40*/("""{"""),format.raw/*40.41*/("""
            """),format.raw/*41.13*/("""url = decodeURIComponent(url[1]);
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""" """),format.raw/*42.15*/("""else """),format.raw/*42.20*/("""{"""),format.raw/*42.21*/("""
            """),format.raw/*43.13*/("""url = """"),_display_(/*43.21*/{s"http://${current.configuration.getString("swagger.api.host")
                    .getOrElse("http://localhost:9000")}/api-docs.json"}),format.raw/*44.73*/(""""
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/("""

            """),format.raw/*47.13*/("""hljs.configure("""),format.raw/*47.28*/("""{"""),format.raw/*47.29*/("""
            """),format.raw/*48.13*/("""highlightSizeThreshold: 5000
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/(""");
            // Pre load translate...
            if (window.SwaggerTranslator) """),format.raw/*51.43*/("""{"""),format.raw/*51.44*/("""
            """),format.raw/*52.13*/("""window.SwaggerTranslator.translate();
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
            """),format.raw/*54.13*/("""window.swaggerUi = new SwaggerUi("""),format.raw/*54.46*/("""{"""),format.raw/*54.47*/("""
            """),format.raw/*55.13*/("""apisSorter : "alpha",
                    sorter : "alpha",
                    url: url,
                    dom_id: "swagger-ui-container",
                    supportedSubmitMethods: ['get', 'post', 'put', 'delete', 'patch'],
                    onComplete: function(swaggerApi, swaggerUi)"""),format.raw/*60.64*/("""{"""),format.raw/*60.65*/("""
                    """),format.raw/*61.21*/("""if (typeof initOAuth == "function") """),format.raw/*61.57*/("""{"""),format.raw/*61.58*/("""
                    """),format.raw/*62.21*/("""initOAuth("""),format.raw/*62.31*/("""{"""),format.raw/*62.32*/("""
                    """),format.raw/*63.21*/("""clientId: "your-client-id",
                            clientSecret: "your-client-secret-if-required",
                            realm: "your-realms",
                            appName: "your-app-name",
                            scopeSeparator: ",",
                            additionalQueryStringParams: """),format.raw/*68.58*/("""{"""),format.raw/*68.59*/("""}"""),format.raw/*68.60*/("""
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/(""");
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/("""

                    """),format.raw/*72.21*/("""if (window.SwaggerTranslator) """),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
                    """),format.raw/*73.21*/("""window.SwaggerTranslator.translate();
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/("""
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/(""",
                    onFailure: function(data) """),format.raw/*76.47*/("""{"""),format.raw/*76.48*/("""
                    """),format.raw/*77.21*/("""log("Unable to Load SwaggerUI");
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/(""",
                    docExpansion: "none",
                    jsonEditor: false,
                    defaultModelRendering: 'schema',
                    showRequestHeaders: false
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/(""");
            window.swaggerUi.load();
            function log() """),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
            """),format.raw/*86.13*/("""if ('console' in window) """),format.raw/*86.38*/("""{"""),format.raw/*86.39*/("""
            """),format.raw/*87.13*/("""console.log.apply(console, arguments);
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/("""
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/(""");

    </script>
</head>

<body class="swagger-section">
<div id='header'>
    <div class="swagger-ui-wrap">
        <a href="http://swagger.io" id="logo"><img alt="swagger" class="logo__img" height="30" src="/api-server/assets/images/logo_small.png"
                                                   width="30"/><span
                class="logo__title">swagger</span></a>
        <form id='api_selector'>
            <div class='input'><input id="input_baseUrl" name="baseUrl" placeholder="http://example.com/api"
                                      type="text"/></div>
            <div id='auth_container'></div>
            <div class='input'><a class="header__btn" data-sw-translate href="#" id="explore">Explore</a></div>
        </form>
    </div>
</div>

<div class="swagger-ui-wrap" data-sw-translate id="message-bar">&nbsp;</div>
<div class="swagger-ui-wrap" id="swagger-ui-container"></div>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 08:57:16 WAT 2023
                  SOURCE: /media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/app/views/swagger.scala.html
                  HASH: a5607b89affbf91d39fdec974088e5fcbb3c2718
                  MATRIX: 589->1|1006->30|3533->2529|3562->2530|3603->2543|3725->2637|3754->2638|3795->2651|3869->2697|3898->2698|3927->2699|3960->2704|3989->2705|4030->2718|4065->2726|4222->2862|4264->2876|4293->2877|4335->2891|4378->2906|4407->2907|4448->2920|4517->2961|4546->2962|4656->3044|4685->3045|4726->3058|4804->3108|4833->3109|4874->3122|4935->3155|4964->3156|5005->3169|5325->3461|5354->3462|5403->3483|5467->3519|5496->3520|5545->3541|5583->3551|5612->3552|5661->3573|6003->3887|6032->3888|6061->3889|6110->3910|6139->3911|6190->3934|6219->3935|6269->3957|6327->3987|6356->3988|6405->4009|6491->4067|6520->4068|6569->4089|6598->4090|6674->4138|6703->4139|6752->4160|6833->4213|6862->4214|7084->4408|7113->4409|7208->4476|7237->4477|7278->4490|7331->4515|7360->4516|7401->4529|7480->4580|7509->4581|7550->4594|7579->4595|7620->4608|7649->4609
                  LINES: 22->1|32->2|68->38|68->38|69->39|70->40|70->40|71->41|72->42|72->42|72->42|72->42|72->42|73->43|73->43|74->44|75->45|75->45|77->47|77->47|77->47|78->48|79->49|79->49|81->51|81->51|82->52|83->53|83->53|84->54|84->54|84->54|85->55|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|98->68|98->68|98->68|99->69|99->69|100->70|100->70|102->72|102->72|102->72|103->73|104->74|104->74|105->75|105->75|106->76|106->76|107->77|108->78|108->78|113->83|113->83|115->85|115->85|116->86|116->86|116->86|117->87|118->88|118->88|119->89|119->89|120->90|120->90
                  -- GENERATED --
              */
          