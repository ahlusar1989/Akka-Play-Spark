
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(host: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main(title = "Twitter Sentiment Analysis", subtitle = "Powered by Spark, MLlib, Scala, Akka and Play!")/*2.105*/ {_display_(Seq[Any](format.raw/*2.107*/("""

    """),format.raw/*4.5*/("""<div class="overlay">
        <ws-element id="socket" url="ws://"""),_display_(/*5.44*/{host}),format.raw/*5.50*/("""/eventSocket"></ws-element>
        <ws-element id="statisticsSocket" url="ws://"""),_display_(/*6.54*/{host}),format.raw/*6.60*/("""/statisticsSocket"></ws-element>
        <div class="stats-container">
            <h2>Statistics</h2>
            <div class="metrics">
                <trainer-metrics></trainer-metrics>
            </div>
        </div>
        <div class="card-container">
            <div class="card-list batch-results">
                <h3>Batch Model Results <span class="precision"></span></h3>
                <twitter-cardlist></twitter-cardlist>
            </div>
            <div class="card-list online-results">
                <h3>Online Model Results <span class="precision"></span></h3>
                <twitter-cardlist></twitter-cardlist>
            </div>
        </div>
    </div>

""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(host:String): play.twirl.api.HtmlFormat.Appendable = apply(host)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (host) => apply(host)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 08 19:50:10 EST 2016
                  SOURCE: /Users/saran/spark-mllib-scala-play/app/views/index.scala.html
                  HASH: ed00d3da2981594f6660a64922d7872f33724b34
                  MATRIX: 527->1|636->15|663->17|775->120|815->122|847->128|938->193|964->199|1071->280|1097->286|1817->976
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|29->5|29->5|30->6|30->6|49->25
                  -- GENERATED --
              */
          