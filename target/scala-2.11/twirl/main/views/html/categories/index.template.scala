
package views.html.categories

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

"""),_display_(/*3.2*/main("ToolCategory")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<form action=""""),_display_(/*4.16*/routes/*4.22*/.Categories.create()),format.raw/*4.42*/("""" method="post">
    <input type="text" name="name">
    <button>Submit</button>
</form>


"""),_display_(/*10.2*/if(toolCategory.isEmpty())/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
"""),format.raw/*11.1*/("""<h2>No ToolCategory available</h2>
""")))}/*12.2*/else/*12.7*/{_display_(Seq[Any](format.raw/*12.8*/("""
"""),format.raw/*13.1*/("""<h2>Tools Category List</h2>
<ul>
    """),_display_(/*15.6*/for(tc <- toolCategory) yield /*15.29*/ {_display_(Seq[Any](format.raw/*15.31*/("""
    """),format.raw/*16.5*/("""<div id="toolCategory">
    <img src='"""),_display_(/*17.16*/tc/*17.18*/.imageLink),format.raw/*17.28*/("""' border='0' /><br>
    <h3>"""),_display_(/*18.10*/tc/*18.12*/.name),format.raw/*18.17*/("""</h3>
        <ul>
          """),_display_(/*20.12*/for(stc <- tc.subToolCategoryList) yield /*20.46*/{_display_(Seq[Any](format.raw/*20.47*/("""
              """),format.raw/*21.15*/("""<li>"""),_display_(/*21.20*/stc/*21.23*/.name),format.raw/*21.28*/("""</li>
          """)))}),format.raw/*22.12*/("""
        """),format.raw/*23.9*/("""</ul>
    </br>
    </div>
    """)))}),format.raw/*26.6*/("""
"""),format.raw/*27.1*/("""</ul>
""")))}),format.raw/*28.2*/("""


""")))}),format.raw/*31.2*/("""
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
                  DATE: Tue Dec 08 14:12:42 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/categories/index.scala.html
                  HASH: 0e2c5c1ac611b892db931c9fafbe19aeaffbac42
                  MATRIX: 768->1|897->35|925->38|953->58|992->60|1019->61|1060->76|1074->82|1114->102|1232->194|1267->220|1307->222|1335->223|1389->259|1401->264|1439->265|1467->266|1531->304|1570->327|1610->329|1642->334|1708->373|1719->375|1750->385|1806->414|1817->416|1843->421|1900->451|1950->485|1989->486|2032->501|2064->506|2076->509|2102->514|2150->531|2186->540|2248->572|2276->573|2313->580|2347->584
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|54->23|57->26|58->27|59->28|62->31
                  -- GENERATED --
              */
          