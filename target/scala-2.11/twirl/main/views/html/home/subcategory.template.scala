
package views.html.home

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object subcategory_Scope0 {
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

class subcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Tool],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( tools: List[Tool], categoryName: String, subcategoryName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),_display_(/*3.2*/main("Toos")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<br>
<br>
<br>
<br>

<div class="container">
    <h4><p><u><a href='"""),_display_(/*12.25*/routes/*12.31*/.Home.index()),format.raw/*12.44*/("""'>Back</a></u></p></h4>
    <br>

    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><b>Tool List</b></div>

        <!-- List group -->
        <ul class="list-group">
            <li class="list-group-item">Category:"""),_display_(/*21.51*/categoryName),format.raw/*21.63*/("""</li>
            <li class="list-group-item">Subcategory:"""),_display_(/*22.54*/subcategoryName),format.raw/*22.69*/("""</li>

        </ul>
    </div>

    <br>
"""),_display_(/*28.2*/if(tools.isEmpty())/*28.21*/ {_display_(Seq[Any](format.raw/*28.23*/("""
"""),format.raw/*29.1*/("""<h2>No Tool available</h2>
""")))}/*30.2*/else/*30.7*/{_display_(Seq[Any](format.raw/*30.8*/("""

    """),format.raw/*32.5*/("""<table class="table table-striped">
        <thead>
        <tr>
            <th>Tool Image</th>
            <th>Tool Name</th>
            <th>Price(Per Day)</th>
            <th>Is Available</th>

        </tr>
        </thead>


        <tbody>
        """),_display_(/*45.10*/for(t <- tools) yield /*45.25*/ {_display_(Seq[Any](format.raw/*45.27*/("""
        """),format.raw/*46.9*/("""<tr >
            <td>
                <img class="img-responsive" src='"""),_display_(/*48.51*/t/*48.52*/.imageLink),format.raw/*48.62*/("""' border='0' style="width:120px;height:120px;" /><br>
            </td>
            <td>
                <a href='"""),_display_(/*51.27*/routes/*51.33*/.Tools.overview(t.id)),format.raw/*51.54*/("""'>"""),_display_(/*51.57*/t/*51.58*/.name),format.raw/*51.63*/("""</a>
            </td>

            <td>
                """),_display_(/*55.18*/t/*55.19*/.price),format.raw/*55.25*/("""
            """),format.raw/*56.13*/("""</td>


            <td>
                """),_display_(/*60.18*/t/*60.19*/.isAvailable),format.raw/*60.31*/("""
            """),format.raw/*61.13*/("""</td>




        </tr>
        """)))}),format.raw/*67.10*/("""
        """),format.raw/*68.9*/("""</tbody>
    </table>
  """)))}),format.raw/*70.4*/("""




"""),format.raw/*75.1*/("""</div>

""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(tools:List[Tool],categoryName:String,subcategoryName:String): play.twirl.api.HtmlFormat.Appendable = apply(tools,categoryName,subcategoryName)

  def f:((List[Tool],String,String) => play.twirl.api.HtmlFormat.Appendable) = (tools,categoryName,subcategoryName) => apply(tools,categoryName,subcategoryName)

  def ref: this.type = this

}


}

/**/
object subcategory extends subcategory_Scope0.subcategory
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 02:03:24 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/home/subcategory.scala.html
                  HASH: 8949ac3860bc72b5d6e479f4fd5f9a179c5ef1e3
                  MATRIX: 780->1|942->68|972->73|992->85|1031->87|1059->89|1264->267|1279->273|1313->286|1630->576|1663->588|1750->648|1786->663|1861->712|1889->731|1929->733|1958->735|2005->764|2017->769|2055->770|2090->778|2387->1048|2418->1063|2458->1065|2495->1075|2597->1150|2607->1151|2638->1161|2783->1279|2798->1285|2840->1306|2870->1309|2880->1310|2906->1315|2995->1377|3005->1378|3032->1384|3074->1398|3147->1444|3157->1445|3190->1457|3232->1471|3302->1510|3339->1520|3396->1547|3433->1557|3474->1568
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|52->21|52->21|53->22|53->22|59->28|59->28|59->28|60->29|61->30|61->30|61->30|63->32|76->45|76->45|76->45|77->46|79->48|79->48|79->48|82->51|82->51|82->51|82->51|82->51|82->51|86->55|86->55|86->55|87->56|91->60|91->60|91->60|92->61|98->67|99->68|101->70|106->75|108->77
                  -- GENERATED --
              */
          