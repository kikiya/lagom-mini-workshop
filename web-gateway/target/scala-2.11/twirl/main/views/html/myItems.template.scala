
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myItems_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object myItems_Scope1 {
import com.example.auction.item.api.ItemStatus
import com.example.auction.item.api.ItemSummary
import com.example.auction.utils.PaginatedSequence
import controllers.Currency
import java.util.Locale

class myItems extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[ItemStatus.Status,PaginatedSequence[ItemSummary],Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(status: ItemStatus.Status, paginatedItems: PaginatedSequence[ItemSummary])(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.96*/("""

"""),_display_(/*9.2*/for(user <- nav.user) yield /*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
    """),_display_(/*10.6*/main(user.name)/*10.21*/ {_display_(Seq[Any](format.raw/*10.23*/("""
        """),format.raw/*11.9*/("""<h1>"""),_display_(/*11.14*/user/*11.18*/.name),format.raw/*11.23*/("""</h1>

        <div class="row">
            <ul class="menu vertical large-3 columns">
            """),_display_(/*15.14*/for(menuStatus <- ItemStatus.values) yield /*15.50*/ {_display_(Seq[Any](format.raw/*15.52*/("""
                """),format.raw/*16.17*/("""<li class=""""),_display_(/*16.29*/if(menuStatus == status)/*16.53*/ {_display_(Seq[Any](format.raw/*16.55*/("""active""")))}),format.raw/*16.62*/("""">
                    <a href=""""),_display_(/*17.31*/routes/*17.37*/.ProfileController.myItems(menuStatus.toString.toLowerCase(Locale.ENGLISH), None, None)),format.raw/*17.124*/("""">"""),_display_(/*17.127*/Messages("items." + menuStatus)),format.raw/*17.158*/("""</a>
                </li>
            """)))}),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""</ul>

            <div class="large-9 columns">
            """),_display_(/*23.14*/if(paginatedItems.isEmpty)/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
                """),format.raw/*24.17*/("""<em>"""),_display_(/*24.22*/Messages("noItems." + status)),format.raw/*24.51*/("""</em>
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
                """),format.raw/*26.17*/("""<table>
                    <caption>"""),_display_(/*27.31*/Messages("items.caption", Messages("items." + status), paginatedItems.count)),format.raw/*27.107*/("""</caption>

                    <thead>
                        <tr>
                            <th>"""),_display_(/*31.34*/Messages("title")),format.raw/*31.51*/("""</th>
                            <th>"""),_display_(/*32.34*/Messages("status")),format.raw/*32.52*/("""</th>
                            <th>"""),_display_(/*33.34*/Messages("currency")),format.raw/*33.54*/("""</th>
                            <th>"""),_display_(/*34.34*/Messages("reserve")),format.raw/*34.53*/("""</th>
                            <th><!-- Start auction--></th>
                        </tr>
                    </thead>

                    <tbody>
                    """),_display_(/*40.22*/for(item <- paginatedItems.items) yield /*40.55*/ {_display_(Seq[Any](format.raw/*40.57*/("""
                        """),_display_(/*41.26*/defining(Currency.valueOf(item.currencyId))/*41.69*/ { currency =>_display_(Seq[Any](format.raw/*41.83*/("""
                            """),format.raw/*42.29*/("""<tr>
                                <td>
                                    <a href=""""),_display_(/*44.47*/routes/*44.53*/.ItemController.getItem(item.id)),format.raw/*44.85*/("""">"""),_display_(/*44.88*/item/*44.92*/.title),format.raw/*44.98*/("""</a>
                                </td>
                                <td>"""),_display_(/*46.38*/item/*46.42*/.status),format.raw/*46.49*/("""</td>
                                <td>"""),_display_(/*47.38*/currency/*47.46*/.getDisplayName),format.raw/*47.61*/("""</td>
                                <td>"""),_display_(/*48.38*/currency/*48.46*/.format(item.reservePrice)),format.raw/*48.72*/("""</td>
                                <td>
                                """),_display_(/*50.34*/if(item.status == ItemStatus.Created)/*50.71*/ {_display_(Seq[Any](format.raw/*50.73*/("""
                                    """),format.raw/*51.37*/("""<form action=""""),_display_(/*51.52*/routes/*51.58*/.ItemController.startAuction(item.id)),format.raw/*51.95*/("""" method="POST">
                                        <input class="button success" type="submit" value=""""),_display_(/*52.93*/Messages("startAuction")),format.raw/*52.117*/(""""/>
                                    </form>
                                """)))}),format.raw/*54.34*/("""
                                """),format.raw/*55.33*/("""</td>
                            </tr>
                        """)))}),format.raw/*57.26*/("""
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</tbody>
                </table>

                """),_display_(/*62.18*/paginate(paginatedItems)/*62.42*/((pageNumber, pageSize) => routes.ProfileController.myItems(status.toString.toLowerCase(Locale.ENGLISH), Some(pageNumber), Some(pageSize)))),format.raw/*62.181*/("""
            """)))}),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""</div>
        </div>
    """)))}),format.raw/*66.6*/("""
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(status:ItemStatus.Status,paginatedItems:PaginatedSequence[ItemSummary],nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply(status,paginatedItems)(nav)

  def f:((ItemStatus.Status,PaginatedSequence[ItemSummary]) => (Nav) => play.twirl.api.HtmlFormat.Appendable) = (status,paginatedItems) => (nav) => apply(status,paginatedItems)(nav)

  def ref: this.type = this

}


}
}

/**/
object myItems extends myItems_Scope0.myItems_Scope1.myItems
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/myItems.scala.html
                  HASH: 1c4c3ce03468843d9bfd61120f2b7c8d8dfbb95f
                  MATRIX: 805->205|994->299|1022->302|1058->323|1097->325|1129->331|1153->346|1193->348|1229->357|1261->362|1274->366|1300->371|1428->472|1480->508|1520->510|1565->527|1604->539|1637->563|1677->565|1715->572|1775->605|1790->611|1899->698|1930->701|1983->732|2054->772|2095->785|2184->847|2219->873|2259->875|2304->892|2336->897|2386->926|2424->946|2437->951|2476->952|2521->969|2586->1007|2684->1083|2813->1185|2851->1202|2917->1241|2956->1259|3022->1298|3063->1318|3129->1357|3169->1376|3370->1550|3419->1583|3459->1585|3512->1611|3564->1654|3616->1668|3673->1697|3788->1785|3803->1791|3856->1823|3886->1826|3899->1830|3926->1836|4033->1916|4046->1920|4074->1927|4144->1970|4161->1978|4197->1993|4267->2036|4284->2044|4331->2070|4434->2146|4480->2183|4520->2185|4585->2222|4627->2237|4642->2243|4700->2280|4836->2389|4882->2413|4994->2494|5055->2527|5151->2592|5204->2614|5253->2635|5332->2687|5365->2711|5526->2850|5571->2864|5612->2877|5669->2904|5701->2906
                  LINES: 27->7|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|42->17|42->17|42->17|42->17|42->17|44->19|45->20|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|52->27|52->27|56->31|56->31|57->32|57->32|58->33|58->33|59->34|59->34|65->40|65->40|65->40|66->41|66->41|66->41|67->42|69->44|69->44|69->44|69->44|69->44|69->44|71->46|71->46|71->46|72->47|72->47|72->47|73->48|73->48|73->48|75->50|75->50|75->50|76->51|76->51|76->51|76->51|77->52|77->52|79->54|80->55|82->57|83->58|84->59|87->62|87->62|87->62|88->63|89->64|91->66|92->67
                  -- GENERATED --
              */
          