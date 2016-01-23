
package views.html.tools

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Tool,List[Review],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tool:Tool, reviews:List[Review]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main("Tools")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
 """),format.raw/*3.2*/("""<h1>"""),_display_(/*3.7*/tool/*3.11*/.name),format.raw/*3.16*/("""</h1>
""")))}))
      }
    }
  }

  def render(tool:Tool,reviews:List[Review]): play.twirl.api.HtmlFormat.Appendable = apply(tool,reviews)

  def f:((Tool,List[Review]) => play.twirl.api.HtmlFormat.Appendable) = (tool,reviews) => apply(tool,reviews)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 01:18:19 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/tools/index.scala.html
                  HASH: b51c233be3695342f0eee637c34c15f223694cb6
                  MATRIX: 762->1|890->34|917->36|938->49|977->51|1005->53|1035->58|1047->62|1072->67
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          