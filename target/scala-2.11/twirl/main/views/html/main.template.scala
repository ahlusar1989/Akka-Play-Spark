
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, subtitle: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <script src='"""),_display_(/*7.23*/routes/*7.29*/.Assets.at("javascripts/vendor/webcomponentsjs/webcomponents-lite.min.js")),format.raw/*7.103*/("""'></script>
        <link href='//fonts.googleapis.com/css?family=Lora:400,400italic,700,700italic|Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700italic,700,900,900italic' rel='stylesheet' type='text/css'>
        <link rel="import" href='"""),_display_(/*9.35*/routes/*9.41*/.Assets.at("templates/elements.html")),format.raw/*9.78*/("""'>
        <link rel="stylesheet" href='"""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("javascripts/vendor/bootstrap/dist/css/bootstrap.min.css")),format.raw/*10.121*/("""'/>
        <link rel="stylesheet" href='"""),_display_(/*11.39*/routes/*11.45*/.Assets.versioned("stylesheets/vendor/font-awesome/css/font-awesome.min.css")),format.raw/*11.122*/("""'/>
        <link rel="stylesheet" href='"""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.86*/("""'/>
    </head>
    <body unresolved class="fullbleed layout vertical not-authenticated keys-missing">
        <span id="browser-sync-binding"></span>
        <template is="dom-bind" id="app">
            <div class="header">
                <nav class="navbar navbar-default">
                    <div class="container">
                        <a class="navbar-brand" href="#">
                            <img alt="Brand" src='"""),_display_(/*21.52*/routes/*21.58*/.Assets.at("images/logo.png")),format.raw/*21.87*/("""'>
                        </a>
                        <ul class="navbar-right">
                            <li class="logout">
                                <a href="/logout">Logout</a>
                            </li>
                        </ul>
                        <div class="heading">Twitter Sentiment Analysis</div>
                    </div>
                </nav>
            </div>
            <div class="heading-container headings">
                <h1>Twitter Sentiment Analysis</h1>
                <h2>powered by</h2>
                <ul class="icons">
                    <li class="scala">
                        <img src=""""),_display_(/*37.36*/routes/*37.42*/.Assets.at("images/header-logo-scala.svg")),format.raw/*37.84*/("""">
                    </li>
                    <li class="akka">
                        <img src=""""),_display_(/*40.36*/routes/*40.42*/.Assets.at("images/header-logo-akka.svg")),format.raw/*40.83*/("""">
                    </li>
                    <li class="play">
                        <img src=""""),_display_(/*43.36*/routes/*43.42*/.Assets.at("images/header-logo-play.svg")),format.raw/*43.83*/("""">
                    </li>
                    <li class="spark">
                        <img src=""""),_display_(/*46.36*/routes/*46.42*/.Assets.at("images/header-logo-spark.svg")),format.raw/*46.84*/("""">
                    </li>
                </ul>
            </div>
            <form class="heading-container actions search batch-trainer-not-done">
                <div class="paper-input">
                    <paper-input label="Keyword" autofocus disabled id="search-input">
                        <paper-icon-button suffix icon="search" id="start-predicting" type="submit"></paper-icon-button>
                    </paper-input>
                    <div class="message text-danger">
                        BatchTrainer is still training.
                    </div>
                </div>
            </form>
            <div class="heading-container actions login">
                <h2>Twitter authentication</h2>
                <div>
                    <p>
                        Before you can use the application please login with your Twitter account.<br />
                        <small>(This is needed because of Twitter API regulations.</small>)
                    </p>
                </div>
                <a href=""""),_display_(/*68.27*/routes/*68.33*/.Twitter.authenticate),format.raw/*68.54*/("""">
                    <button class="twitter-login"></button>
                </a>
            </div>
            <div class="heading-container actions keys-missing-error">
                <h2>Your Twitter access token and consumer key/secret configuration is missing or incomplete!</h2>
                <p>
                    Because Twitter prohibits key/token/password sharing (which makes sense) you have to setup an App at Twitter before you can use this application.
                    You can create and manage your applications at <a href="https://dev.twitter.com/oauth/overview/application-owner-access-tokens">https://dev.twitter.com</a>
                </p>
                <p>
                    After you've created your Twitter App you can obtain your consumer key and access token with secrets. Please enter them in your application.conf like this:
                </p>
                <pre>
twitter """),format.raw/*82.9*/("""{"""),format.raw/*82.10*/("""
  """),format.raw/*83.3*/("""consumer """),format.raw/*83.12*/("""{"""),format.raw/*83.13*/("""
    """),format.raw/*84.5*/("""key = "CONSUMER_KEY"
    secret = "CONSUMER_SECRET"
  """),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
  """),format.raw/*87.3*/("""access """),format.raw/*87.10*/("""{"""),format.raw/*87.11*/("""
    """),format.raw/*88.5*/("""token = "ACCESS_TOKEN"
    secret = "ACCESS_TOKEN_SECRET"
  """),format.raw/*90.3*/("""}"""),format.raw/*90.4*/("""
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""
                """),format.raw/*92.17*/("""</pre>
            </div>
            <div class="push-down"></div>
                <!-- Main Content -->
            <div class="content">
                """),_display_(/*97.18*/content),format.raw/*97.25*/("""
            """),format.raw/*98.13*/("""</div>
            <paper-toast id="event-toast"></paper-toast>
        </template>

        <!--
            Fix for a problem between traceur-runtime and the webcomponents polyfill

            The link[rel=import] polyfill apparently doesn't block following scripts.
            The problem with that is, that the traceur-runtime tries to load the $ object (which isn't yet loaded) and because it doesn't find it, it throws an error.
            If we define jQuery here the $ object is accessible for the runtime and the error isn't thrown. Thus the application works as it's supposed to.
        -->
        <script src='"""),_display_(/*109.23*/routes/*109.29*/.Assets.at("javascripts/vendor/jquery.min.js")),format.raw/*109.75*/("""'></script>

        <link rel="import" href='"""),_display_(/*111.35*/routes/*111.41*/.Assets.at("templates/libraries.html")),format.raw/*111.79*/("""'>
        <script type="text/javascript" src=""""),_display_(/*112.46*/routes/*112.52*/.Application.jsRoutes),format.raw/*112.73*/(""""></script>
        <script src='"""),_display_(/*113.23*/routes/*113.29*/.Assets.versioned("main.js")),format.raw/*113.57*/("""'></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,subtitle:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,subtitle)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,subtitle) => (content) => apply(title,subtitle)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 19:50:10 EST 2016
                  SOURCE: /Users/saran/spark-mllib-scala-play/app/views/main.scala.html
                  HASH: 18e8d7a8e203b9caef9011e7909d4aff8e666023
                  MATRIX: 537->1|680->49|707->50|783->100|808->105|944->215|958->221|1053->295|1338->554|1352->560|1409->597|1477->638|1492->644|1590->720|1659->762|1674->768|1773->845|1842->887|1857->893|1919->934|2377->1365|2392->1371|2442->1400|3121->2052|3136->2058|3199->2100|3328->2202|3343->2208|3405->2249|3534->2351|3549->2357|3611->2398|3741->2501|3756->2507|3819->2549|4887->3590|4902->3596|4944->3617|5890->4536|5919->4537|5949->4540|5986->4549|6015->4550|6047->4555|6128->4609|6156->4610|6186->4613|6221->4620|6250->4621|6282->4626|6369->4686|6397->4687|6425->4688|6453->4689|6498->4706|6682->4863|6710->4870|6751->4883|7406->5510|7422->5516|7490->5562|7565->5609|7581->5615|7641->5653|7717->5701|7733->5707|7776->5728|7838->5762|7854->5768|7904->5796
                  LINES: 20->1|25->1|26->2|29->5|29->5|31->7|31->7|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|45->21|45->21|45->21|61->37|61->37|61->37|64->40|64->40|64->40|67->43|67->43|67->43|70->46|70->46|70->46|92->68|92->68|92->68|106->82|106->82|107->83|107->83|107->83|108->84|110->86|110->86|111->87|111->87|111->87|112->88|114->90|114->90|115->91|115->91|116->92|121->97|121->97|122->98|133->109|133->109|133->109|135->111|135->111|135->111|136->112|136->112|136->112|137->113|137->113|137->113
                  -- GENERATED --
              */
          