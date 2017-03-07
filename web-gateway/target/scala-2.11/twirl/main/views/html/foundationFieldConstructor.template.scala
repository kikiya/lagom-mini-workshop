
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object foundationFieldConstructor_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object foundationFieldConstructor_Scope1 {
import views.html.helper.FieldElements

class foundationFieldConstructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(elements: FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""
"""),_display_(/*4.2*/defining(elements.args.getOrElse('_id, elements.id + "Field"))/*4.64*/ { id =>_display_(Seq[Any](format.raw/*4.72*/("""
    """),format.raw/*5.5*/("""<label class=""""),_display_(/*5.20*/elements/*5.28*/.args.get('_class)),format.raw/*5.46*/(""" """),_display_(/*5.48*/if(elements.hasErrors)/*5.70*/ {_display_(Seq[Any](format.raw/*5.72*/("""error""")))}),format.raw/*5.78*/(""""
    id=""""),_display_(/*6.10*/id),format.raw/*6.12*/("""" """),_display_(/*6.15*/if(elements.infos)/*6.33*/{_display_(Seq[Any](format.raw/*6.34*/(""" """),format.raw/*6.35*/("""aria-describedby=""""),_display_(/*6.54*/{id}),format.raw/*6.58*/("""HelpText" """)))}),format.raw/*6.69*/(""">
        """),_display_(/*7.10*/if(elements.hasName)/*7.30*/ {_display_(_display_(/*7.33*/elements/*7.41*/.name))}/*7.48*/else/*7.53*/{_display_(_display_(/*7.55*/elements/*7.63*/.label))}),format.raw/*7.70*/("""
        """),_display_(/*8.10*/elements/*8.18*/.input),format.raw/*8.24*/("""
        """),_display_(/*9.10*/elements/*9.18*/.errors.map/*9.29*/ { error =>_display_(Seq[Any](format.raw/*9.40*/("""<span class="error">"""),_display_(/*9.61*/error),format.raw/*9.66*/("""</span>
        """)))}),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</label>
    """),_display_(/*12.6*/for(info <- elements.infos) yield /*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""<p class="help-text" id=""""),_display_(/*12.61*/{id}),format.raw/*12.65*/("""HelpText">"""),_display_(/*12.76*/info),format.raw/*12.80*/("""</p>
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(elements:FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}
}

/**/
object foundationFieldConstructor extends foundationFieldConstructor_Scope0.foundationFieldConstructor_Scope1.foundationFieldConstructor
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/foundationFieldConstructor.scala.html
                  HASH: 69f82c32069d87f1abfa301e6168ee3691903c7b
                  MATRIX: 664->42|784->67|811->69|881->131|926->139|957->144|998->159|1014->167|1052->185|1080->187|1110->209|1149->211|1185->217|1222->228|1244->230|1273->233|1299->251|1337->252|1365->253|1410->272|1434->276|1475->287|1512->298|1540->318|1570->321|1586->329|1602->336|1614->341|1643->343|1659->351|1688->358|1724->368|1740->376|1766->382|1802->392|1818->400|1837->411|1885->422|1932->443|1957->448|2005->465|2037->470|2077->484|2120->511|2160->513|2213->539|2238->543|2276->554|2301->558|2341->568|2373->570
                  LINES: 23->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|31->6|31->6|31->6|31->6|31->6|31->6|31->6|31->6|31->6|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|34->9|35->10|36->11|37->12|37->12|37->12|37->12|37->12|37->12|37->12|38->13|39->14
                  -- GENERATED --
              */
          