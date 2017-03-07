
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editItem_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object editItem_Scope1 {
import helper._
import java.time.temporal.ChronoUnit
import controllers.{Currency => Currencies}

class editItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[ItemForm],Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(itemForm: Form[ItemForm])(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.47*/("""

"""),_display_(/*7.2*/main(Messages("createItem"))/*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""

    """),format.raw/*9.5*/("""<h2>"""),_display_(/*9.10*/Messages("createItem")),format.raw/*9.32*/("""</h2>

    """),_display_(/*11.6*/foundationForm(itemForm, routes.ItemController.createItem())/*11.66*/ {_display_(Seq[Any](format.raw/*11.68*/("""
        """),format.raw/*12.9*/("""<div class="column row">
            """),_display_(/*13.14*/inputText(itemForm("title"))),format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""</div>
        <div class="column row">
            """),_display_(/*16.14*/textarea(itemForm("description"))),format.raw/*16.47*/("""
        """),format.raw/*17.9*/("""</div>
        <div class="column row">
            """),_display_(/*19.14*/select(
                field = itemForm("currency"),
                options = Currencies.values.map(c => c.name -> c.getDisplayName).sortBy(_._2)
            )),format.raw/*22.14*/("""
        """),format.raw/*23.71*/("""
        """),format.raw/*24.9*/("""</div>
        <div class="row">
            <div class="medium-6 columns">
                """),_display_(/*27.18*/inputText(itemForm("increment"), 'type -> "number", 'min -> 0.5, 'step -> 0.5, '_help -> Messages("incrementHelp"))),format.raw/*27.133*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="medium-6 columns">
                """),_display_(/*30.18*/inputText(itemForm("reserve"), 'type -> "number", 'min -> 0, 'step -> 0.5, '_help -> Messages("reserveHelp"))),format.raw/*30.127*/("""
            """),format.raw/*31.13*/("""</div>
        </div>
        <div class="row">
            <div class="medium-6 columns">
                """),_display_(/*35.18*/inputText(itemForm("duration"), 'type -> "number", 'min -> 1, 'step -> 1, '_columns -> 3)),format.raw/*35.107*/("""
            """),format.raw/*36.13*/("""</div>
            <div class="medium-6 columns">
                """),_display_(/*38.18*/select(
                    field = itemForm("durationUnits"),
                    options = ChronoUnit.values().dropWhile(_ != ChronoUnit.SECONDS).takeWhile(_ != ChronoUnit.MONTHS).map(u => u.name() -> u.toString()),
                    '_columns -> 3
                )),format.raw/*42.18*/("""
            """),format.raw/*43.13*/("""</div>
        </div>
        <input type="submit" class="button" value=""""),_display_(/*45.53*/Messages("createItem")),format.raw/*45.75*/(""""/>
    """)))}),format.raw/*46.6*/("""
""")))}))
      }
    }
  }

  def render(itemForm:Form[ItemForm],nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply(itemForm)(nav)

  def f:((Form[ItemForm]) => (Nav) => play.twirl.api.HtmlFormat.Appendable) = (itemForm) => (nav) => apply(itemForm)(nav)

  def ref: this.type = this

}


}
}

/**/
object editItem extends editItem_Scope0.editItem_Scope1.editItem
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/editItem.scala.html
                  HASH: 56e7ce5638d2af01b90fca7e0aaf0879660c1a0a
                  MATRIX: 673->102|813->147|841->150|877->178|916->180|948->186|979->191|1021->213|1059->225|1128->285|1168->287|1204->296|1269->334|1318->362|1354->371|1434->424|1488->457|1524->466|1604->519|1786->680|1823->751|1859->760|1979->853|2116->968|2157->981|2251->1048|2382->1157|2423->1170|2558->1278|2669->1367|2710->1380|2804->1447|3095->1717|3136->1730|3237->1804|3280->1826|3319->1835
                  LINES: 25->5|30->5|32->7|32->7|32->7|34->9|34->9|34->9|36->11|36->11|36->11|37->12|38->13|38->13|39->14|41->16|41->16|42->17|44->19|47->22|48->23|49->24|52->27|52->27|53->28|55->30|55->30|56->31|60->35|60->35|61->36|63->38|67->42|68->43|70->45|70->45|71->46
                  -- GENERATED --
              */
          