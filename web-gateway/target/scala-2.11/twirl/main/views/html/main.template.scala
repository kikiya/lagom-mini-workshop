
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

     object main_Scope1 {
import com.example.auction.item.api.ItemStatus
import java.util.Locale

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String)(content: Html)(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.51*/("""

"""),format.raw/*6.1*/("""<html>
    <head>
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.at("lib/foundation/dist/foundation.min.css")),format.raw/*9.113*/(""""/>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.at("lib/foundation-icon-fonts/foundation-icons.css")),format.raw/*10.121*/(""""/>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("main.css")),format.raw/*11.83*/(""""/>
    </head>
    <body>
        <nav class="top-bar">
            <div class="top-bar-left">
                <ul class="menu">
                    <li><a href=""""),_display_(/*17.35*/routes/*17.41*/.Main.index()),format.raw/*17.54*/("""">"""),_display_(/*17.57*/Messages("lagomAuction")),format.raw/*17.81*/("""</a></li>
                    <li><a href=""""),_display_(/*18.35*/routes/*18.41*/.Main.createUserForm()),format.raw/*18.63*/("""">"""),_display_(/*18.66*/Messages("createUser")),format.raw/*18.88*/("""</a></li>
                    <li><a href=""""),_display_(/*19.35*/routes/*19.41*/.ItemController.createItemForm()),format.raw/*19.73*/("""">"""),_display_(/*19.76*/Messages("createItem")),format.raw/*19.98*/("""</a></li>
                </ul>
            </div>
            <div class="top-bar-right">
                <ul class="menu dropdown" data-dropdown-menu>
                    <li>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.ProfileController.myItems(ItemStatus.Created.toString.toLowerCase(Locale.ENGLISH), None, None)),format.raw/*25.136*/("""">
                            """),_display_(/*26.30*/nav/*26.33*/.user.map(_.name).getOrElse(Messages("logInAs"))),format.raw/*26.81*/("""</a>
                        <ul class="menu vertical">
                        """),_display_(/*28.26*/for(user <- nav.users) yield /*28.48*/ {_display_(Seq[Any](format.raw/*28.50*/("""
                            """),format.raw/*29.29*/("""<li><a href="#" data-user-id=""""),_display_(/*29.60*/user/*29.64*/.id),format.raw/*29.67*/("""" class="log-in-as">"""),_display_(/*29.88*/user/*29.92*/.name),format.raw/*29.97*/("""</a></li>
                        """)))}),format.raw/*30.26*/("""
                        """),format.raw/*31.25*/("""</ul>
                    </li>
                </ul>
            </div>
        </nav>
        <article class="row">
            <div class="small-12">
            """),_display_(/*38.14*/content),format.raw/*38.21*/("""
            """),format.raw/*39.13*/("""</div>
        </article>
        <script type="text/javascript" src=""""),_display_(/*41.46*/routes/*41.52*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*41.90*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*42.46*/routes/*42.52*/.Assets.at("lib/foundation/dist/foundation.min.js")),format.raw/*42.103*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*43.46*/routes/*43.52*/.Assets.at("main.js")),format.raw/*43.73*/(""""></script>
        <script>
                $(document).foundation();
        </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(nav)

  def f:((String) => (Html) => (Nav) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (nav) => apply(title)(content)(nav)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/main.scala.html
                  HASH: 6c909d6a5f0f7b0ee422467929720ac4e0b8960e
                  MATRIX: 632->75|776->124|804->126|864->160|889->165|978->228|992->234|1065->286|1150->344|1165->350|1247->410|1332->468|1347->474|1390->496|1581->660|1596->666|1630->679|1660->682|1705->706|1776->750|1791->756|1834->778|1864->781|1907->803|1978->847|1993->853|2046->885|2076->888|2119->910|2358->1122|2373->1128|2490->1223|2549->1255|2561->1258|2630->1306|2738->1387|2776->1409|2816->1411|2873->1440|2931->1471|2944->1475|2968->1478|3016->1499|3029->1503|3055->1508|3121->1543|3174->1568|3367->1734|3395->1741|3436->1754|3534->1825|3549->1831|3608->1869|3692->1926|3707->1932|3780->1983|3864->2040|3879->2046|3921->2067
                  LINES: 24->4|29->4|31->6|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|42->17|42->17|42->17|42->17|42->17|43->18|43->18|43->18|43->18|43->18|44->19|44->19|44->19|44->19|44->19|50->25|50->25|50->25|51->26|51->26|51->26|53->28|53->28|53->28|54->29|54->29|54->29|54->29|54->29|54->29|54->29|55->30|56->31|63->38|63->38|64->39|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43
                  -- GENERATED --
              */
          