
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

object api extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>CCSP API</title>
    <!-- needed for adaptive design -->
    <meta charset="utf-8"/>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="/api-server/api-docs.json" rel="prefetch">
    <!--
 ReDoc uses font options from the parent element
 So override default browser styles
    -->
    <style>
            @import url(//fonts.googleapis.com/css?family=Roboto:300,400,700);
            @import url(//fonts.googleapis.com/css?family=Montserrat:400,700);

            body """),format.raw/*17.18*/("""{"""),format.raw/*17.19*/("""
                """),format.raw/*18.17*/("""margin: 0;
                padding: 0;
                font-family: Verdana, Geneva, sans-serif;
                font-size: 14px;
                color: #333;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""

            """),format.raw/*25.13*/("""redoc api-logo img """),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""
                """),format.raw/*26.17*/("""padding: 20px 30px 14px 30px;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""

    """),format.raw/*29.5*/("""</style>
</head>
<body>
<redoc hide-hostname lazy-rendering native-scrollbars spec-url='/api-server/api-docs.json'></redoc>
<script src="https://rebilly.github.io/ReDoc/releases/latest/redoc.min.js"></script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 08:57:15 WAT 2023
                  SOURCE: /media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/app/views/api.scala.html
                  HASH: 006aed4460987c8f5a6d150eb7fd1120e0189f5e
                  MATRIX: 966->0|1542->550|1571->551|1616->568|1815->739|1844->740|1886->754|1933->773|1962->774|2007->791|2077->833|2106->834|2139->840
                  LINES: 31->1|47->17|47->17|48->18|53->23|53->23|55->25|55->25|55->25|56->26|57->27|57->27|59->29
                  -- GENERATED --
              */
          