
package views.html.home

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

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<br>
<br>
<br>
<br>
<span style="color:red">
"""),format.raw/*9.29*/("""
"""),_display_(/*10.2*/if(flash.containsKey("success"))/*10.34*/{_display_(Seq[Any](format.raw/*10.35*/("""
"""),_display_(/*11.2*/flash/*11.7*/.get("success"))))}),format.raw/*11.23*/("""
"""),_display_(/*12.2*/if(flash.containsKey("error"))/*12.32*/{_display_(Seq[Any](format.raw/*12.33*/("""
"""),_display_(/*13.2*/flash/*13.7*/.get("error"))))}),format.raw/*13.21*/("""
"""),_display_(/*14.2*/if(flash.containsKey("disconnected"))/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
"""),_display_(/*15.2*/flash/*15.7*/.get("disconnected"))))}),format.raw/*15.28*/("""
 """),format.raw/*16.2*/("""</span>
<br>


"""),_display_(/*20.2*/if(toolCategory.isEmpty())/*20.28*/ {_display_(Seq[Any](format.raw/*20.30*/("""
"""),format.raw/*21.1*/("""<h2>No ToolCategory available</h2>
""")))}/*22.2*/else/*22.7*/{_display_(Seq[Any](format.raw/*22.8*/("""
"""),format.raw/*23.1*/("""<h2></h2>

    """),_display_(/*25.6*/for(tc <- toolCategory) yield /*25.29*/ {_display_(Seq[Any](format.raw/*25.31*/("""
    """),format.raw/*26.5*/("""<div id="toolCategory">
        <img src='"""),_display_(/*27.20*/tc/*27.22*/.imageLink),format.raw/*27.32*/("""' border='0' style="width:260px;height:230px;" /><br>
        <h3>"""),_display_(/*28.14*/tc/*28.16*/.name),format.raw/*28.21*/("""</h3>
        <ul>
            """),_display_(/*30.14*/for(stc <- tc.subToolCategoryList) yield /*30.48*/{_display_(Seq[Any](format.raw/*30.49*/("""

                    """),format.raw/*32.21*/("""<li> <a href='"""),_display_(/*32.36*/routes/*32.42*/.Home.subcategory(tc.id, stc.id)),format.raw/*32.74*/("""'>"""),_display_(/*32.77*/stc/*32.80*/.name),format.raw/*32.85*/("""</a></li>

            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</ul>
        <br>
    </div>
    """)))}),format.raw/*38.6*/("""



""")))}),format.raw/*42.2*/("""



""")))}),format.raw/*46.2*/("""
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
                  DATE: Sun Dec 13 00:56:23 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/home/index.scala.html
                  HASH: 0b574434126a2085b3704436fc6ec304771b5857
                  MATRIX: 762->1|891->35|921->40|941->52|980->54|1008->56|1085->134|1114->137|1155->169|1194->170|1223->173|1236->178|1276->194|1305->197|1344->227|1383->228|1412->231|1425->236|1463->250|1492->253|1538->290|1577->291|1606->294|1619->299|1664->320|1694->323|1740->343|1775->369|1815->371|1844->373|1899->410|1911->415|1949->416|1978->418|2022->436|2061->459|2101->461|2134->467|2205->511|2216->513|2247->523|2342->591|2353->593|2379->598|2440->632|2490->666|2529->667|2581->691|2623->706|2638->712|2691->744|2721->747|2733->750|2759->755|2816->781|2853->791|2921->829|2960->838|2999->847
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|63->32|65->34|66->35|69->38|73->42|77->46
                  -- GENERATED --
              */
          