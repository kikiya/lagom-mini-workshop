
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

     object index_Scope1 {
import com.example.auction.item.api.ItemStatus
import java.util.Locale

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/()(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.23*/("""

"""),_display_(/*6.2*/main("Index")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""
    """),format.raw/*7.5*/("""<h1>Index</h1>

    """),_display_(/*9.6*/for(user <- nav.user) yield /*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""
        """),format.raw/*10.9*/("""<a href=""""),_display_(/*10.19*/routes/*10.25*/.ProfileController.myItems(ItemStatus.Created.toString.toLowerCase(Locale.ENGLISH), None, None)),format.raw/*10.120*/("""">
            """),_display_(/*11.14*/Messages("my.auctions")),format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""</a>
    """)))}),format.raw/*13.6*/("""
""")))}))
      }
    }
  }

  def render(nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply()(nav)

  def f:(() => (Nav) => play.twirl.api.HtmlFormat.Appendable) = () => (nav) => apply()(nav)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/index.scala.html
                  HASH: c1ad78c137cf131a9123c6f9df934aa7fad5df57
                  MATRIX: 623->75|739->96|767->99|788->112|827->114|858->119|904->140|940->161|979->163|1015->172|1052->182|1067->188|1184->283|1227->299|1271->322|1307->331|1347->341
                  LINES: 24->4|29->4|31->6|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|35->10|36->11|36->11|37->12|38->13
                  -- GENERATED --
              */
          