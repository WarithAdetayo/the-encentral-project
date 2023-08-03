
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

object error extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">
    <meta content="" name="description">
    <meta content="James Akinniranye" name="author">


    <title>CCSP Error Code</title>

    <!-- Bootstrap core CSS -->
    <link crossorigin="anonymous" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" rel="stylesheet">

    <style>
            td"""),format.raw/*17.15*/("""{"""),format.raw/*17.16*/("""
                """),format.raw/*18.17*/("""text-align: left;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""

    """),format.raw/*21.5*/("""</style>

</head>

<body>

<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
    <h5 class="my-0 mr-md-auto font-weight-normal">Encentral</h5>
    <!--      <nav class="my-2 my-md-0 mr-md-3">
            <a class="p-2 text-dark" href="#">Features</a>
            <a class="p-2 text-dark" href="#">Enterprise</a>
            <a class="p-2 text-dark" href="#">Support</a>
            <a class="p-2 text-dark" href="#">Pricing</a>
          </nav>
          <a class="btn btn-outline-primary" href="#">Sign up</a>-->
</div>

<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
    <h1 class="display-4">Error Code</h1>
    <p class="lead">Error code for ccsp.</p>
</div>

<div class="container">
    <div class="card-deck mb-3 text-center">
        <table class="table table-striped table-hover">
            <thead class="thead-dark">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Code</th>
                <th colspan="2" scope="col">Meaning</th>
                <th scope="col">MoreInfo</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>200400</td>
                <td colspan="2">Json body is bad</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>200412</td>
                <td colspan="2">Email Verification Required</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>200406</td>
                <td colspan="2">User has already migrated</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">4</th>
                <td colspan="2">200409</td>
                <td>User submitted version one database credentials</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">5</th>
                <td colspan="2">200220</td>
                <td>User must start version one database password recovery</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">6</th>
                <td colspan="2">200221</td>
                <td>User Id has been set to user for password recovery</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">7</th>
                <td colspan="2">220424</td>
                <td>User Id not found for password recovery</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">8</th>
                <td colspan="2">240425</td>
                <td>Failed to provide ennough valid details to rest password</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">9</th>
                <td colspan="2">200401</td>
                <td>Captcha Failed</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">10</th>
                <td colspan="2">200402</td>
                <td>Failed to reset password</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">11</th>
                <td colspan="2">200490</td>
                <td>User Already Exists</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">12</th>
                <td colspan="2">240426</td>
                <td>Exceeded login attempts</td>
                <td></td>
            </tr>
            <tr>
                <th scope="row">12</th>
                <td colspan="2">240512</td>
                <td>Complaint record not found actually exist</td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>

    <footer class="pt-4 my-md-5 pt-md-5 border-top">
        <div class="row">
            <div class="col-12 col-md">
                <img alt="" class="mb-2" height="24" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg"
                     width="24">
                <small class="d-block mb-3 text-muted">&copy; 2017-2018</small>
            </div>
            <div class="col-6 col-md">
                <h5>Features</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Cool stuff</a></li>
                    <li><a class="text-muted" href="#">Random feature</a></li>
                    <li><a class="text-muted" href="#">Team feature</a></li>
                    <li><a class="text-muted" href="#">Stuff for developers</a></li>
                    <li><a class="text-muted" href="#">Another one</a></li>
                    <li><a class="text-muted" href="#">Last time</a></li>
                </ul>
            </div>
            <div class="col-6 col-md">
                <h5>Resources</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Resource</a></li>
                    <li><a class="text-muted" href="#">Resource name</a></li>
                    <li><a class="text-muted" href="#">Another resource</a></li>
                    <li><a class="text-muted" href="#">Final resource</a></li>
                </ul>
            </div>
            <div class="col-6 col-md">
                <h5>About</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Team</a></li>
                    <li><a class="text-muted" href="#">Locations</a></li>
                    <li><a class="text-muted" href="#">Privacy</a></li>
                    <li><a class="text-muted" href="#">Terms</a></li>
                </ul>
            </div>
        </div>
    </footer>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script crossorigin="anonymous"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script crossorigin="anonymous"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script crossorigin="anonymous"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script crossorigin="anonymous"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

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
                  SOURCE: /media/kmpk/C204F10C04F10467/Users/AWA/Programming/Internship/Encentral_Solutions_Internship/FinalProject(New)/com.esl.internship.3.0.api/service-gateway/app/views/error.scala.html
                  HASH: f39a3a4517a69e7c23282701ce5267ff76dc28e5
                  MATRIX: 968->0|1568->572|1597->573|1642->590|1700->620|1729->621|1762->627
                  LINES: 31->1|47->17|47->17|48->18|49->19|49->19|51->21
                  -- GENERATED --
              */
          