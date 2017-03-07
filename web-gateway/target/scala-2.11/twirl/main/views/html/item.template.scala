
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object item_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object item_Scope1 {
import com.example.auction.item.api.Item
import com.example.auction.item.api.ItemStatus
import com.example.auction.user.api.User
import com.example.auction.bidding.api.BidResult
import com.example.auction.bidding.api.BidResultStatus._
import java.util.UUID
import controllers.{Currency => Currencies}

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template10[Item,Form[BidForm],Seq[AnonymousBid],UUID,Currencies,User,Option[User],Option[Int],Option[BidResult],Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*9.2*/(item: Item, bidForm: Form[BidForm], biddingHistory: Seq[AnonymousBid], currentUser: UUID, currency: Currencies,
        seller: User, winner: Option[User], currentMaximumBid: Option[Int], bidResult: Option[BidResult])(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/renderBidResult/*12.17*/(icon: String, callout: String, bidMessage: String, result: BidResult):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.91*/("""
    
    """),format.raw/*14.5*/("""<div class=""""),_display_(/*14.18*/callout),format.raw/*14.25*/(""" """),format.raw/*14.26*/("""callout">
        <i class="fi-"""),_display_(/*15.23*/icon),format.raw/*15.27*/(""""></i> """),_display_(/*15.35*/Messages(bidMessage, currency.format(result.currentPrice))),format.raw/*15.93*/("""
    """),format.raw/*16.5*/("""</div>
""")))};
Seq[Any](format.raw/*10.125*/("""

"""),format.raw/*17.2*/("""

"""),_display_(/*19.2*/main(item.title)/*19.18*/ {_display_(Seq[Any](format.raw/*19.20*/("""

    """),format.raw/*21.5*/("""<h1>"""),_display_(/*21.10*/item/*21.14*/.title),format.raw/*21.20*/("""</h1>

    """),_display_(/*23.6*/for(result <- bidResult) yield /*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
        """),_display_(/*24.10*/result/*24.16*/.status/*24.23*/ match/*24.29*/ {/*25.13*/case Accepted =>/*25.29*/ {_display_(Seq[Any](format.raw/*25.31*/("""
                """),_display_(/*26.18*/renderBidResult("like", "success", "bidAcceptedMessage", result)),format.raw/*26.82*/("""
            """)))}/*28.13*/case AcceptedOutbid =>/*28.35*/ {_display_(Seq[Any](format.raw/*28.37*/("""
                """),_display_(/*29.18*/renderBidResult("dislike", "warning", "bidAcceptedOutbidMessage", result)),format.raw/*29.91*/("""
            """)))}/*31.13*/case AcceptedBelowReserve =>/*31.41*/ {_display_(Seq[Any](format.raw/*31.43*/("""
                """),_display_(/*32.18*/renderBidResult("dislike", "warning", "bidAcceptedBelowReserveMessage", result)),format.raw/*32.97*/("""
            """)))}/*34.13*/case TooLow =>/*34.27*/ {_display_(Seq[Any](format.raw/*34.29*/("""
                """),_display_(/*35.18*/renderBidResult("alert", "alert", "bidTooLowMessage", result)),format.raw/*35.79*/("""
            """)))}/*37.13*/case NotStarted =>/*37.31*/ {_display_(Seq[Any](format.raw/*37.33*/("""
                """),_display_(/*38.18*/renderBidResult("alert", "alert", "bidNotStartedMessage", result)),format.raw/*38.83*/("""
            """)))}/*40.13*/case Finished =>/*40.29*/ {_display_(Seq[Any](format.raw/*40.31*/("""
                """),_display_(/*41.18*/renderBidResult("alert", "alert", "bidFinishedMessage", result)),format.raw/*41.81*/("""
            """)))}/*43.13*/case Cancelled =>/*43.30*/ {_display_(Seq[Any](format.raw/*43.32*/("""
                """),_display_(/*44.18*/renderBidResult("alert", "alert", "bidCancelledMessage", result)),format.raw/*44.82*/("""
            """)))}}),format.raw/*46.10*/("""
    """)))}),format.raw/*47.6*/("""

    """),format.raw/*49.5*/("""<p>
        """),_display_(/*50.10*/item/*50.14*/.description),format.raw/*50.26*/("""
    """),format.raw/*51.5*/("""</p>

    <dl>
        <dt>"""),_display_(/*54.14*/Messages("seller")),format.raw/*54.32*/("""</dt>
        <dd>"""),_display_(/*55.14*/seller/*55.20*/.name),format.raw/*55.25*/("""</dd>

        <dt>"""),_display_(/*57.14*/Messages("currency")),format.raw/*57.34*/("""</dt>
        <dd>"""),_display_(/*58.14*/currency/*58.22*/.getDisplayName),format.raw/*58.37*/("""</dd>

        <dt>"""),_display_(/*60.14*/Messages("increment")),format.raw/*60.35*/("""</dt>
        <dd>"""),_display_(/*61.14*/currency/*61.22*/.format(item.increment)),format.raw/*61.45*/("""</dd>

    """),_display_(/*63.6*/if(currentUser == item.creator)/*63.37*/ {_display_(Seq[Any](format.raw/*63.39*/("""
        """),format.raw/*64.9*/("""<dt>"""),_display_(/*64.14*/Messages("reserve")),format.raw/*64.33*/("""</dt>
        <dd>"""),_display_(/*65.14*/currency/*65.22*/.format(item.reservePrice)),format.raw/*65.48*/("""</dd>
    """)))}),format.raw/*66.6*/("""

        """),format.raw/*68.9*/("""<dt>"""),_display_(/*68.14*/Messages("duration")),format.raw/*68.34*/("""</dt>
        <dd>"""),_display_(/*69.14*/nav/*69.17*/.formatDuration(item.auctionDuration)),format.raw/*69.54*/("""</dd>

    """),_display_(/*71.6*/if(item.status == ItemStatus.Auction || item.status == ItemStatus.Completed)/*71.82*/ {_display_(Seq[Any](format.raw/*71.84*/("""
        """),format.raw/*72.9*/("""<dt>"""),_display_(/*72.14*/Messages("auctionStart")),format.raw/*72.38*/("""</dt>
        <dd>"""),_display_(/*73.14*/item/*73.18*/.auctionStart.map(nav.formatInstant)),format.raw/*73.54*/("""</dd>

        <dt>"""),_display_(/*75.14*/Messages("auctionEnd")),format.raw/*75.36*/("""</dt>
        <dd>"""),_display_(/*76.14*/item/*76.18*/.auctionEnd.map(nav.formatInstant)),format.raw/*76.52*/("""</dd>
    """)))}),format.raw/*77.6*/("""

    """),_display_(/*79.6*/if(item.status == ItemStatus.Auction)/*79.43*/ {_display_(Seq[Any](format.raw/*79.45*/("""
        """),format.raw/*80.9*/("""<dt>"""),_display_(/*80.14*/Messages("currentPrice")),format.raw/*80.38*/("""</dt>
        <dd>"""),_display_(/*81.14*/item/*81.18*/.price.map(currency.format)),format.raw/*81.45*/("""</dd>
    """)))}),format.raw/*82.6*/("""

    """),_display_(/*84.6*/if(item.status == ItemStatus.Completed)/*84.45*/ {_display_(Seq[Any](format.raw/*84.47*/("""
        """),format.raw/*85.9*/("""<dt>"""),_display_(/*85.14*/Messages("finalPrice")),format.raw/*85.36*/("""</dt>
        <dd>"""),_display_(/*86.14*/item/*86.18*/.price.map(currency.format)),format.raw/*86.45*/("""</dd>

        """),_display_(/*88.10*/for(w <- winner) yield /*88.26*/ {_display_(Seq[Any](format.raw/*88.28*/("""
            """),_display_(/*89.14*/if(currentUser == item.creator || currentUser == w)/*89.65*/ {_display_(Seq[Any](format.raw/*89.67*/("""
                """),format.raw/*90.17*/("""<dt>"""),_display_(/*90.22*/Messages("auctionWinner")),format.raw/*90.47*/("""</dt>
                <dd>"""),_display_(/*91.22*/w/*91.23*/.name),format.raw/*91.28*/("""</dd>
            """)))}),format.raw/*92.14*/("""
        """)))}),format.raw/*93.10*/("""
    """)))}),format.raw/*94.6*/("""
    """),format.raw/*95.5*/("""</dl>

    """),_display_(/*97.6*/if(currentUser == item.creator && item.status == ItemStatus.Created)/*97.74*/ {_display_(Seq[Any](format.raw/*97.76*/("""
        """),format.raw/*98.9*/("""<form action=""""),_display_(/*98.24*/routes/*98.30*/.ItemController.startAuction(item.safeId)),format.raw/*98.71*/("""" method="POST">
            <input class="button success" type="submit" value=""""),_display_(/*99.65*/Messages("startAuction")),format.raw/*99.89*/(""""/>
        </form>
    """)))}),format.raw/*101.6*/("""
    """),_display_(/*102.6*/if(currentUser != item.creator && item.status == ItemStatus.Auction)/*102.74*/ {_display_(Seq[Any](format.raw/*102.76*/("""
        """),format.raw/*103.9*/("""<h3>"""),_display_(/*103.14*/Messages("placeBid")),format.raw/*103.34*/("""</h3>
        """),_display_(/*104.10*/for(maxBid <- currentMaximumBid) yield /*104.42*/ {_display_(Seq[Any](format.raw/*104.44*/("""
            """),format.raw/*105.13*/("""<div class="success callout">
                """),_display_(/*106.18*/Messages("currentWinningBidderMessage", currency.format(maxBid))),format.raw/*106.82*/("""
            """),format.raw/*107.13*/("""</div>
        """)))}),format.raw/*108.10*/("""
        """),_display_(/*109.10*/foundationForm(bidForm, routes.ItemController.placeBid(item.safeId))/*109.78*/ {_display_(Seq[Any](format.raw/*109.80*/("""
            """),_display_(/*110.14*/helper/*110.20*/.inputText(bidForm("bid"), 'type -> "number", 'step -> currency.formatDecimal(item.increment),
                'min -> currency.formatDecimal(item.price.getOrElse(0) + item.increment))),format.raw/*111.90*/("""
            """),format.raw/*112.13*/("""<input type="hidden" name="currency" value=""""),_display_(/*112.58*/item/*112.62*/.currencyId),format.raw/*112.73*/(""""/>
            <input class="button success" type="submit" value=""""),_display_(/*113.65*/Messages("placeBid")),format.raw/*113.85*/(""""/>
        """)))}),format.raw/*114.10*/("""
    """)))}),format.raw/*115.6*/("""

    """),_display_(/*117.6*/if(item.status == ItemStatus.Auction || item.status == ItemStatus.Completed)/*117.82*/ {_display_(Seq[Any](format.raw/*117.84*/("""
        """),format.raw/*118.9*/("""<h3>"""),_display_(/*118.14*/Messages("biddingHistory")),format.raw/*118.40*/("""</h3>
        """),_display_(/*119.10*/if(biddingHistory.isEmpty)/*119.36*/ {_display_(Seq[Any](format.raw/*119.38*/("""
            """),format.raw/*120.13*/("""<em>"""),_display_(/*120.18*/Messages("noBidsPlaced")),format.raw/*120.42*/("""</em>
        """)))}/*121.11*/else/*121.16*/{_display_(Seq[Any](format.raw/*121.17*/("""
            """),format.raw/*122.13*/("""<table>
                <thead>
                    <tr>
                        <th>"""),_display_(/*125.30*/Messages("bidTime")),format.raw/*125.49*/("""</th>
                        <th>"""),_display_(/*126.30*/Messages("bidder")),format.raw/*126.48*/("""</th>
                        <th>"""),_display_(/*127.30*/Messages("bid")),format.raw/*127.45*/("""</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*131.18*/for(bid <- biddingHistory) yield /*131.44*/ {_display_(Seq[Any](format.raw/*131.46*/("""
                    """),format.raw/*132.21*/("""<tr>
                        <td>"""),_display_(/*133.30*/nav/*133.33*/.formatInstant(bid.bidTime)),format.raw/*133.60*/("""</td>
                        <td>"""),_display_(/*134.30*/if(bid.isYou)/*134.43*/ {_display_(Seq[Any](format.raw/*134.45*/("""
                            """),format.raw/*135.29*/("""<strong>"""),_display_(/*135.38*/Messages("youBidder")),format.raw/*135.59*/("""</strong>
                        """)))}/*136.27*/else/*136.32*/{_display_(Seq[Any](format.raw/*136.33*/("""
                            """),_display_(/*137.30*/Messages("anonymousBidder", bid.bidder)),format.raw/*137.69*/("""
                        """)))}),format.raw/*138.26*/("""</td>
                        <td>"""),_display_(/*139.30*/currency/*139.38*/.format(bid.bidPrice)),format.raw/*139.59*/("""</td>
                    </tr>
                """)))}),format.raw/*141.18*/("""
                """),format.raw/*142.17*/("""</tbody>
            </table>

        """)))}),format.raw/*145.10*/("""
    """)))}),format.raw/*146.6*/("""
""")))}))
      }
    }
  }

  def render(item:Item,bidForm:Form[BidForm],biddingHistory:Seq[AnonymousBid],currentUser:UUID,currency:Currencies,seller:User,winner:Option[User],currentMaximumBid:Option[Int],bidResult:Option[BidResult],nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply(item,bidForm,biddingHistory,currentUser,currency,seller,winner,currentMaximumBid,bidResult)(nav)

  def f:((Item,Form[BidForm],Seq[AnonymousBid],UUID,Currencies,User,Option[User],Option[Int],Option[BidResult]) => (Nav) => play.twirl.api.HtmlFormat.Appendable) = (item,bidForm,biddingHistory,currentUser,currency,seller,winner,currentMaximumBid,bidResult) => (nav) => apply(item,bidForm,biddingHistory,currentUser,currency,seller,winner,currentMaximumBid,bidResult)(nav)

  def ref: this.type = this

}


}
}

/**/
object item extends item_Scope0.item_Scope1.item
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/item.scala.html
                  HASH: 10bf66c684f974ecac4b4c98a090d03cd95cce3e
                  MATRIX: 952->310|1268->550|1292->565|1443->639|1480->649|1520->662|1548->669|1577->670|1636->702|1661->706|1696->714|1775->772|1807->777|1856->547|1885->785|1914->788|1939->804|1979->806|2012->812|2044->817|2057->821|2084->827|2122->839|2162->863|2202->865|2239->875|2254->881|2270->888|2285->894|2296->909|2321->925|2361->927|2406->945|2491->1009|2524->1036|2555->1058|2595->1060|2640->1078|2734->1151|2767->1178|2804->1206|2844->1208|2889->1226|2989->1305|3022->1332|3045->1346|3085->1348|3130->1366|3212->1427|3245->1454|3272->1472|3312->1474|3357->1492|3443->1557|3476->1584|3501->1600|3541->1602|3586->1620|3670->1683|3703->1710|3729->1727|3769->1729|3814->1747|3899->1811|3945->1835|3981->1841|4014->1847|4054->1860|4067->1864|4100->1876|4132->1881|4187->1909|4226->1927|4272->1946|4287->1952|4313->1957|4360->1977|4401->1997|4447->2016|4464->2024|4500->2039|4547->2059|4589->2080|4635->2099|4652->2107|4696->2130|4734->2142|4774->2173|4814->2175|4850->2184|4882->2189|4922->2208|4968->2227|4985->2235|5032->2261|5073->2272|5110->2282|5142->2287|5183->2307|5229->2326|5241->2329|5299->2366|5337->2378|5422->2454|5462->2456|5498->2465|5530->2470|5575->2494|5621->2513|5634->2517|5691->2553|5738->2573|5781->2595|5827->2614|5840->2618|5895->2652|5936->2663|5969->2670|6015->2707|6055->2709|6091->2718|6123->2723|6168->2747|6214->2766|6227->2770|6275->2797|6316->2808|6349->2815|6397->2854|6437->2856|6473->2865|6505->2870|6548->2892|6594->2911|6607->2915|6655->2942|6698->2958|6730->2974|6770->2976|6811->2990|6871->3041|6911->3043|6956->3060|6988->3065|7034->3090|7088->3117|7098->3118|7124->3123|7174->3142|7215->3152|7251->3158|7283->3163|7321->3175|7398->3243|7438->3245|7474->3254|7516->3269|7531->3275|7593->3316|7701->3397|7746->3421|7802->3446|7835->3452|7913->3520|7954->3522|7991->3531|8024->3536|8066->3556|8109->3571|8158->3603|8199->3605|8241->3618|8316->3665|8402->3729|8444->3742|8492->3758|8530->3768|8608->3836|8649->3838|8691->3852|8707->3858|8913->4042|8955->4055|9028->4100|9042->4104|9075->4115|9171->4183|9213->4203|9258->4216|9295->4222|9329->4229|9415->4305|9456->4307|9493->4316|9526->4321|9574->4347|9617->4362|9653->4388|9694->4390|9736->4403|9769->4408|9815->4432|9850->4448|9864->4453|9904->4454|9946->4467|10060->4553|10101->4572|10164->4607|10204->4625|10267->4660|10304->4675|10430->4773|10473->4799|10514->4801|10564->4822|10626->4856|10639->4859|10688->4886|10751->4921|10774->4934|10815->4936|10873->4965|10910->4974|10953->4995|11008->5031|11022->5036|11062->5037|11120->5067|11181->5106|11239->5132|11302->5167|11320->5175|11363->5196|11444->5245|11490->5262|11562->5302|11599->5308
                  LINES: 29->9|34->12|34->12|36->12|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|42->10|44->17|46->19|46->19|46->19|48->21|48->21|48->21|48->21|50->23|50->23|50->23|51->24|51->24|51->24|51->24|51->25|51->25|51->25|52->26|52->26|53->28|53->28|53->28|54->29|54->29|55->31|55->31|55->31|56->32|56->32|57->34|57->34|57->34|58->35|58->35|59->37|59->37|59->37|60->38|60->38|61->40|61->40|61->40|62->41|62->41|63->43|63->43|63->43|64->44|64->44|65->46|66->47|68->49|69->50|69->50|69->50|70->51|73->54|73->54|74->55|74->55|74->55|76->57|76->57|77->58|77->58|77->58|79->60|79->60|80->61|80->61|80->61|82->63|82->63|82->63|83->64|83->64|83->64|84->65|84->65|84->65|85->66|87->68|87->68|87->68|88->69|88->69|88->69|90->71|90->71|90->71|91->72|91->72|91->72|92->73|92->73|92->73|94->75|94->75|95->76|95->76|95->76|96->77|98->79|98->79|98->79|99->80|99->80|99->80|100->81|100->81|100->81|101->82|103->84|103->84|103->84|104->85|104->85|104->85|105->86|105->86|105->86|107->88|107->88|107->88|108->89|108->89|108->89|109->90|109->90|109->90|110->91|110->91|110->91|111->92|112->93|113->94|114->95|116->97|116->97|116->97|117->98|117->98|117->98|117->98|118->99|118->99|120->101|121->102|121->102|121->102|122->103|122->103|122->103|123->104|123->104|123->104|124->105|125->106|125->106|126->107|127->108|128->109|128->109|128->109|129->110|129->110|130->111|131->112|131->112|131->112|131->112|132->113|132->113|133->114|134->115|136->117|136->117|136->117|137->118|137->118|137->118|138->119|138->119|138->119|139->120|139->120|139->120|140->121|140->121|140->121|141->122|144->125|144->125|145->126|145->126|146->127|146->127|150->131|150->131|150->131|151->132|152->133|152->133|152->133|153->134|153->134|153->134|154->135|154->135|154->135|155->136|155->136|155->136|156->137|156->137|157->138|158->139|158->139|158->139|160->141|161->142|164->145|165->146
                  -- GENERATED --
              */
          