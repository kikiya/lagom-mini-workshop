
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object paginate_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object paginate_Scope1 {
import com.example.auction.utils.PaginatedSequence
import play.mvc.Call

class paginate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[PaginatedSequence[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},_root_.scala.Function2[Int, Int, Call],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(pagination: PaginatedSequence[_])(route: (Int, Int) => Call)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/paginationItem/*6.16*/(href: => Call, label: String, isLinked: Boolean, disabledClass: String, otherClasses: String = ""):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.119*/("""
"""),_display_(/*7.2*/defining(otherClasses + (if(!isLinked) " " + disabledClass else ""))/*7.70*/ { liClasses =>_display_(Seq[Any](format.raw/*7.85*/("""
    """),format.raw/*8.5*/("""<li class=""""),_display_(/*8.17*/liClasses),format.raw/*8.26*/("""">
    """),_display_(/*9.6*/if(isLinked)/*9.18*/ {_display_(Seq[Any](format.raw/*9.20*/("""
        """),format.raw/*10.9*/("""<a href=""""),_display_(/*10.19*/href),format.raw/*10.23*/("""" aria-label=""""),_display_(/*10.38*/label),format.raw/*10.43*/("""">"""),_display_(/*10.46*/label),format.raw/*10.51*/("""</a>
    """)))}/*11.7*/else/*11.12*/{_display_(Seq[Any](format.raw/*11.13*/("""
        """),_display_(/*12.10*/label),format.raw/*12.15*/("""
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</li>
""")))}),format.raw/*15.2*/("""
""")))};def /*18.2*/page/*18.6*/(page: Int) = {{
    route(page, pagination.pageSize)
}};def /*21.2*/prevPage/*21.10*/() = {{
    page(pagination.page - 1)
}};def /*24.2*/nextPage/*24.10*/() = {{
    page(pagination.page + 1)
}};
Seq[Any](format.raw/*4.92*/("""

"""),format.raw/*16.2*/("""

"""),format.raw/*20.2*/("""
"""),format.raw/*23.2*/("""
"""),format.raw/*26.2*/("""

"""),_display_(/*28.2*/if(pagination.isPaged)/*28.24*/ {_display_(Seq[Any](format.raw/*28.26*/("""
    """),format.raw/*29.5*/("""<nav>
        <ul class="pagination" aria-label="Pagination">
            """),_display_(/*31.14*/paginationItem(
                prevPage(),
                Messages("pagination.prev"),
                isLinked = !pagination.isFirst,
                disabledClass = "disabled",
                otherClasses = "pagination-previous"
            )),format.raw/*37.14*/("""
            """),_display_(/*38.14*/for(pageNumber <- 0 until pagination.pageCount) yield /*38.61*/ {_display_(Seq[Any](format.raw/*38.63*/("""
                """),_display_(/*39.18*/paginationItem(
                    page(pageNumber),
                    (pageNumber + 1).toString,
                    isLinked = pageNumber != pagination.page,
                    disabledClass = "current"
                )),format.raw/*44.18*/("""
            """)))}),format.raw/*45.14*/("""
            """),_display_(/*46.14*/paginationItem(
                nextPage(),
                Messages("pagination.next"),
                isLinked = !pagination.isLast,
                disabledClass = "disabled",
                otherClasses = "pagination-next"
            )),format.raw/*52.14*/("""
        """),format.raw/*53.9*/("""</ul>
    </nav>
""")))}),format.raw/*55.2*/("""
"""))
      }
    }
  }

  def render(pagination:PaginatedSequence[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},route:_root_.scala.Function2[Int, Int, Call],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(pagination)(route)(messages)

  def f:((PaginatedSequence[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (_root_.scala.Function2[Int, Int, Call]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (pagination) => (route) => (messages) => apply(pagination)(route)(messages)

  def ref: this.type = this

}


}
}

/**/
object paginate extends paginate_Scope0.paginate_Scope1.paginate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/paginate.scala.html
                  HASH: c72d8afd48846b88b4e0748470a358688d07500a
                  MATRIX: 769->76|937->169|959->183|1139->286|1166->288|1242->356|1294->371|1325->376|1363->388|1392->397|1425->405|1445->417|1484->419|1520->428|1557->438|1582->442|1624->457|1650->462|1680->465|1706->470|1734->481|1747->486|1786->487|1823->497|1849->502|1885->508|1917->513|1954->520|1979->525|1991->529|2060->586|2077->594|2130->635|2147->643|2216->166|2245->522|2274->584|2302->633|2330->682|2359->685|2390->707|2430->709|2462->714|2564->789|2832->1036|2873->1050|2936->1097|2976->1099|3021->1117|3268->1343|3313->1357|3354->1371|3617->1613|3653->1622|3701->1640
                  LINES: 26->4|30->6|30->6|32->6|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|36->10|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|39->13|40->14|41->15|42->18|42->18|44->21|44->21|46->24|46->24|49->4|51->16|53->20|54->23|55->26|57->28|57->28|57->28|58->29|60->31|66->37|67->38|67->38|67->38|68->39|73->44|74->45|75->46|81->52|82->53|84->55
                  -- GENERATED --
              */
          