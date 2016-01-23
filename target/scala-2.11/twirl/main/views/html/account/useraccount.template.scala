
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object useraccount_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class useraccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ToolUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(toolUser: ToolUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/main("ToolCategory")/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""
  """),format.raw/*3.3*/("""<h1>"""),_display_(/*3.8*/toolUser/*3.16*/.username),format.raw/*3.25*/("""</h1>


<form action=""""),_display_(/*6.16*/routes/*6.22*/.Categories.create()),format.raw/*6.42*/("""" method="post">
  <input type="text" name="name">
  <button>Submit</button>
</form>
""")))}))
      }
    }
  }

  def render(toolUser:ToolUser): play.twirl.api.HtmlFormat.Appendable = apply(toolUser)

  def f:((ToolUser) => play.twirl.api.HtmlFormat.Appendable) = (toolUser) => apply(toolUser)

  def ref: this.type = this

}


}

/**/
object useraccount extends useraccount_Scope0.useraccount
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 03:42:29 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/account/user.scala.html
                  HASH: 204a209e4ba6860e0dfa30776eefe012ac98a709
                  MATRIX: 767->1|882->21|910->24|938->44|977->46|1007->50|1037->55|1053->63|1082->72|1134->98|1148->104|1188->124
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|37->6|37->6|37->6
                  -- GENERATED --
              */
          