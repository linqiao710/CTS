
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">

            <a class="navbar-brand" href="/"> <span class="glyphicon glyphicon-home"></span>&nbsp;Home</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

                """),_display_(/*14.18*/if(!session().containsKey("user_id"))/*14.55*/{_display_(Seq[Any](format.raw/*14.56*/("""
                """),format.raw/*15.17*/("""<li>
                    <a href=""""),_display_(/*16.31*/routes/*16.37*/.Account.signup()),format.raw/*16.54*/("""">Sign Up</a>
                </li>
                <li>
                    <a href=""""),_display_(/*19.31*/routes/*19.37*/.Account.login()),format.raw/*19.53*/("""">Log In</a>
                </li>
                """)))}/*21.18*/else/*21.22*/{_display_(Seq[Any](format.raw/*21.23*/("""

                """),format.raw/*23.17*/("""<li>
                   <a href=""""),_display_(/*24.30*/routes/*24.36*/.Account.user()),format.raw/*24.51*/("""">  Welcome, """),_display_(/*24.65*/session()/*24.74*/.get("user_name")),format.raw/*24.91*/("""&nbsp; &nbsp;<u>[Account]</u></a>
                </li>
                <li>
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.Account.logout()),format.raw/*27.54*/("""" >Log Out</a>
                </li>

                """)))}),format.raw/*30.18*/("""
            """),format.raw/*31.13*/("""</ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sat Dec 12 22:47:34 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/header.scala.html
                  HASH: 137a14b8e9b25847005f147e6da008bd11727108
                  MATRIX: 829->0|1536->680|1582->717|1621->718|1667->736|1730->772|1745->778|1783->795|1900->885|1915->891|1952->907|2025->961|2038->965|2077->966|2125->986|2187->1021|2202->1027|2238->1042|2279->1056|2297->1065|2335->1082|2472->1192|2487->1198|2525->1215|2614->1273|2656->1287
                  LINES: 32->1|45->14|45->14|45->14|46->15|47->16|47->16|47->16|50->19|50->19|50->19|52->21|52->21|52->21|54->23|55->24|55->24|55->24|55->24|55->24|55->24|58->27|58->27|58->27|61->30|62->31
                  -- GENERATED --
              */
          