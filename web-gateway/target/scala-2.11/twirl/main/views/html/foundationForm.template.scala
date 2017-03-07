
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object foundationForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object foundationForm_Scope1 {
import views.html.helper.form

class foundationForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]],Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(theForm: Form[_], action: play.api.mvc.Call, args: (Symbol,String)*)(body: => Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.115*/("""

"""),_display_(/*5.2*/form(action, args: _*)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

    """),format.raw/*7.5*/("""<div class="row">
        <div class="medium-6 columns">
            """),_display_(/*9.14*/if(theForm.hasErrors)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
                """),format.raw/*10.17*/("""<div class="alert callout">
                    <i class="fi-alert"></i>
                    """),_display_(/*12.22*/messages("formErrors")),format.raw/*12.44*/("""
                    """),_display_(/*13.22*/if(theForm.hasGlobalErrors)/*13.49*/ {_display_(Seq[Any](format.raw/*13.51*/("""
                        """),format.raw/*14.25*/("""<ul>"""),_display_(/*14.30*/for(error <- theForm.globalErrors) yield /*14.64*/ {_display_(Seq[Any](format.raw/*14.66*/("""
                            """),format.raw/*15.29*/("""<li>"""),_display_(/*15.34*/Messages(error.message, error.args: _*)),format.raw/*15.73*/("""</li>
                        """)))}),format.raw/*16.26*/("""</ul>
                    """)))}),format.raw/*17.22*/("""
                """),format.raw/*18.17*/("""</div>
            """)))}),format.raw/*19.14*/("""

            """),_display_(/*21.14*/body),format.raw/*21.18*/("""
        """),format.raw/*22.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(theForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},action:play.api.mvc.Call,args:Array[scala.Tuple2[Symbol, String]],body:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(theForm,action,args:_*)(body)(messages)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]]) => ( => Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (theForm,action,args) => (body) => (messages) => apply(theForm,action,args:_*)(body)(messages)

  def ref: this.type = this

}


}
}

/**/
object foundationForm extends foundationForm_Scope0.foundationForm_Scope1.foundationForm
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/foundationForm.scala.html
                  HASH: 9e6a449911a600d8255192836f597627ceef0370
                  MATRIX: 752->33|961->146|989->149|1019->171|1058->173|1090->179|1186->249|1215->270|1254->272|1299->289|1420->383|1463->405|1512->427|1548->454|1588->456|1641->481|1673->486|1723->520|1763->522|1820->551|1852->556|1912->595|1974->626|2032->653|2077->670|2128->690|2170->705|2195->709|2231->718
                  LINES: 25->3|30->3|32->5|32->5|32->5|34->7|36->9|36->9|36->9|37->10|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|41->14|42->15|42->15|42->15|43->16|44->17|45->18|46->19|48->21|48->21|49->22
                  -- GENERATED --
              */
          