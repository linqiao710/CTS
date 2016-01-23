
package views.html.categories

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
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

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[SubToolCategory,List[Tool],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(toolCategory: SubToolCategory, tools: List[Tool]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""

"""),_display_(/*3.2*/main("Tool Category")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<h1>Tool Category: """),_display_(/*5.21*/toolCategory/*5.33*/.name),format.raw/*5.38*/("""</h1>

"""),_display_(/*7.2*/if(tools.isEmpty())/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
"""),format.raw/*8.1*/("""<h2>No tools available in this category</h2>
""")))}/*9.3*/else/*9.8*/{_display_(Seq[Any](format.raw/*9.9*/("""
"""),format.raw/*10.1*/("""<h2>Tool List for Category: """),_display_(/*10.30*/toolCategory/*10.42*/.name),format.raw/*10.47*/("""</h2>
<ul>
    """),_display_(/*12.6*/for(t <- tools) yield /*12.21*/ {_display_(Seq[Any](format.raw/*12.23*/("""

    """)))}),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</ul>

""")))}),format.raw/*17.2*/("""
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(toolCategory:SubToolCategory,tools:List[Tool]): play.twirl.api.HtmlFormat.Appendable = apply(toolCategory,tools)

  def f:((SubToolCategory,List[Tool]) => play.twirl.api.HtmlFormat.Appendable) = (toolCategory,tools) => apply(toolCategory,tools)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 23:23:15 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/categories/show.scala.html
                  HASH: 1ca6d56942037232d6c4436180c268b2a6a883df
                  MATRIX: 774->1|919->51|947->54|976->75|1015->77|1043->79|1089->99|1109->111|1134->116|1167->124|1194->143|1233->145|1260->146|1323->193|1334->198|1371->199|1399->200|1455->229|1476->241|1502->246|1544->262|1575->277|1615->279|1652->286|1680->287|1718->295|1750->297
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|43->12|43->12|43->12|45->14|46->15|48->17|49->18
                  -- GENERATED --
              */
          