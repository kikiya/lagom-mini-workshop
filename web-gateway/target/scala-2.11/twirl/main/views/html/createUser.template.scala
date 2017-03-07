
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object createUser_Scope1 {
import helper._

class createUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[CreateUserForm],Nav,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(createUser: Form[CreateUserForm])(implicit nav: Nav):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.55*/("""

"""),_display_(/*5.2*/main(Messages("createUser"))/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

    """),format.raw/*7.5*/("""<h2>"""),_display_(/*7.10*/Messages("createUser")),format.raw/*7.32*/("""</h2>

    """),_display_(/*9.6*/foundationForm(createUser, routes.Main.createUser())/*9.58*/ {_display_(Seq[Any](format.raw/*9.60*/("""
        """),format.raw/*10.9*/("""<div class="row">
            <div class="medium-6 columns">
                """),_display_(/*12.18*/inputText(createUser("name"))),format.raw/*12.47*/("""
            """),format.raw/*13.13*/("""</div>
        </div>
        <input class="button" type="submit" value=""""),_display_(/*15.53*/Messages("createUser")),format.raw/*15.75*/(""""/>
    """)))}),format.raw/*16.6*/("""
""")))}))
      }
    }
  }

  def render(createUser:Form[CreateUserForm],nav:Nav): play.twirl.api.HtmlFormat.Appendable = apply(createUser)(nav)

  def f:((Form[CreateUserForm]) => (Nav) => play.twirl.api.HtmlFormat.Appendable) = (createUser) => (nav) => apply(createUser)(nav)

  def ref: this.type = this

}


}
}

/**/
object createUser extends createUser_Scope0.createUser_Scope1.createUser
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 09:02:23 EST 2017
                  SOURCE: /Users/kiki/workspace/online-auction-scala/web-gateway/app/views/createUser.scala.html
                  HASH: e1b43eeab918012670f44f78c8812f43b2c4db76
                  MATRIX: 604->19|752->72|780->75|816->103|855->105|887->111|918->116|960->138|997->150|1057->202|1096->204|1132->213|1237->291|1287->320|1328->333|1429->407|1472->429|1511->438
                  LINES: 23->3|28->3|30->5|30->5|30->5|32->7|32->7|32->7|34->9|34->9|34->9|35->10|37->12|37->12|38->13|40->15|40->15|41->16
                  -- GENERATED --
              */
          