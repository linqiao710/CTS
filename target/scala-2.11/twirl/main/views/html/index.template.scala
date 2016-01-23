
package views.html

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ToolCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(toolCategory: List[ToolCategory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*45.3*/("""


"""))
      }
    }
  }

  def render(toolCategory:List[ToolCategory]): play.twirl.api.HtmlFormat.Appendable = apply(toolCategory)

  def f:((List[ToolCategory]) => play.twirl.api.HtmlFormat.Appendable) = (toolCategory) => apply(toolCategory)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 01:41:26 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/index.scala.html
                  HASH: d50e5b71371e57b583e2027530d75d29427d16f1
                  MATRIX: 757->1|886->35|914->896
                  LINES: 27->1|32->1|33->45
                  -- GENERATED --
              */
          