
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        """),format.raw/*14.110*/("""

        """),format.raw/*16.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*16.106*/("""">
       """),format.raw/*17.117*/("""
        """),format.raw/*18.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*18.110*/("""">


    </head>
    <body>
    """),_display_(/*23.6*/header()),format.raw/*23.14*/("""
    """),format.raw/*24.5*/("""<div class="container">
        <div class="row">
            """),_display_(/*26.14*/content),format.raw/*26.21*/("""
        """),format.raw/*27.9*/("""</div>
    </div>
    """),_display_(/*29.6*/footer()),format.raw/*29.14*/("""
    """),format.raw/*30.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 11 02:52:56 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/main.scala.html
                  HASH: 7b0a6bf38d859d369bcd316c2c77530ef50e0a58
                  MATRIX: 748->1|872->30|900->32|987->93|1012->98|1100->160|1114->166|1176->207|1265->269|1280->275|1341->314|1393->339|1408->345|1470->386|1738->726|1775->736|1847->781|1862->787|1930->833|1969->952|2005->961|2077->1006|2092->1012|2164->1062|2223->1095|2252->1103|2284->1108|2374->1171|2402->1178|2438->1187|2487->1210|2516->1218|2548->1223
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|45->14|47->16|47->16|47->16|47->16|48->17|49->18|49->18|49->18|49->18|54->23|54->23|55->24|57->26|57->26|58->27|60->29|60->29|61->30
                  -- GENERATED --
              */
          