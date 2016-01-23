
package views.html.tools

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object overview_Scope0 {
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

class overview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Tool,ToolUser,ToolCategory,SubToolCategory,List[Review],ToolUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tool:Tool, toolOwner: ToolUser, toolCategory:ToolCategory, subToolCategory:SubToolCategory, reviews:List[Review], login_user:ToolUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.137*/("""
"""),_display_(/*2.2*/main("Tools")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/review.js")),format.raw/*5.63*/("""" type="text/javascript"></script>

<br>
<br>
<br>
<br>
<br>
<div class="container">

"""),format.raw/*14.29*/("""
"""),format.raw/*15.1*/("""<span style="color:red">
"""),_display_(/*16.2*/if(flash.containsKey("success"))/*16.34*/{_display_(Seq[Any](format.raw/*16.35*/("""
"""),_display_(/*17.2*/flash/*17.7*/.get("success"))))}),format.raw/*17.23*/("""
"""),format.raw/*18.1*/("""</span>
 <br>
     <p class="lead">Tool Overview </p>
    <br>
      <img src='"""),_display_(/*22.18*/tool/*22.22*/.imageLink),format.raw/*22.32*/("""' border='0' style="width:170px;height:170px;" /><br>
      <h3>"""),_display_(/*23.12*/tool/*23.16*/.name),format.raw/*23.21*/("""</h3>
    <br>

 <table class="table table-striped">
  <tbody>
     <tr>
        <td>
             <B>Tool Name:</b>
         </td>
        <td>
                """),_display_(/*33.18*/tool/*33.22*/.name),format.raw/*33.27*/("""
          """),format.raw/*34.11*/("""</td>

      </tr>
      <tr>
        <td>
             <B>Owner:</b>
         </td>
        <td>
               """),_display_(/*42.17*/toolOwner/*42.26*/.username),format.raw/*42.35*/("""  """),format.raw/*42.37*/("""&nbsp; &nbsp;<a href="mailto:"""),_display_(/*42.67*/toolOwner/*42.76*/.email),format.raw/*42.82*/("""?subject=I would like to borrow your tool!"><span class="glyphicon glyphicon-envelope"></span>Send email to Owner </a>
          </td>

      </tr>
      <tr>
        <td>
             <B>Category:</b>
         </td>
        <td>
              """),_display_(/*51.16*/toolCategory/*51.28*/.name),format.raw/*51.33*/("""
          """),format.raw/*52.11*/("""</td>

      </tr>

       <tr>
        <td>
             <B>SubCategory:</b>
         </td>
        <td>
               """),_display_(/*61.17*/subToolCategory/*61.32*/.name),format.raw/*61.37*/("""
          """),format.raw/*62.11*/("""</td>

      </tr>

      <tr>
        <td>
             <B>Is Available:</b>
         </td>
        <td>
               """),_display_(/*71.17*/tool/*71.21*/.isAvailable),format.raw/*71.33*/("""
          """),format.raw/*72.11*/("""</td>

      </tr>

      <tr>
        <td>
             <B>Price:</b>
         </td>
        <td>
              $"""),_display_(/*81.17*/tool/*81.21*/.price),format.raw/*81.27*/(""" """),format.raw/*81.28*/("""Per Day
          </td>

      </tr>

       <tr>
        <td>
             <B>Description:</b>
         </td>
        <td>
              """),_display_(/*91.16*/tool/*91.20*/.description),format.raw/*91.32*/("""
          """),format.raw/*92.11*/("""</td>

      </tr>

       <tr>
        <td>
             <B>Specification:</b>
         </td>
        <td>
             """),_display_(/*101.15*/tool/*101.19*/.specification),format.raw/*101.33*/("""
         """),format.raw/*102.10*/("""</td>

      </tr>


     </tbody>
   </table>

 </div>
 <br>
 <hr>

"""),_display_(/*114.2*/if(reviews.isEmpty())/*114.23*/ {_display_(Seq[Any](format.raw/*114.25*/("""

"""),format.raw/*116.1*/("""<div class="panel panel-default">
  <div class="panel-body">
   No reviews for this Tool
  </div>
</div>

""")))}/*122.2*/else/*122.7*/{_display_(Seq[Any](format.raw/*122.8*/("""
"""),format.raw/*123.1*/("""<div class="panel-heading"><b>Reviews</b></div>

    """),_display_(/*125.6*/for(r <- reviews) yield /*125.23*/ {_display_(Seq[Any](format.raw/*125.25*/("""

"""),format.raw/*127.1*/("""<div class="panel panel-default">
  <div class="panel-body">
    """),_display_(/*129.6*/r/*129.7*/.body),format.raw/*129.12*/("""
  """),format.raw/*130.3*/("""</div>
  <div class="panel-footer">
    posted_by: """),_display_(/*132.17*/r/*132.18*/.poster_name),format.raw/*132.30*/(""" """),format.raw/*132.31*/("""<br>
    posted_on: """),_display_(/*133.17*/r/*133.18*/.posted_on),format.raw/*133.28*/(""" """),format.raw/*133.29*/("""<br>
  </div>
</div>

 """)))}),format.raw/*137.3*/("""
""")))}),format.raw/*138.2*/("""


"""),format.raw/*141.1*/("""<form class="form-horizontal" ng-app="myApp" ng-controller="myCtrl" ng-hide="hideform" action=""""),_display_(/*141.97*/routes/*141.103*/.Tools.reviewPost(tool.id)),format.raw/*141.129*/("""" method="post" name="myForm" novalidate>
 <div class="form-group">
            <label class="col-sm-2 control-label">Review:</label>
            <div class="col-sm-10">
                <textarea name="review" ng-model="review" placeholder="Review" cols="50" rows="10"  ng-minlength="1" ng-maxlength="350">
                 </textarea>
                  <span style="color:red" ng-show="myForm.review.$dirty && myForm.review.$invalid">
                      <span ng-show="myForm.review.$error.maxlength">At Most 350 characters.</span>
                 </span>

            </div>
        </div>


   <hr>
   <button class="btn btn-success" ng-disabled="error||max"> Add your review </button>
 </form>
""")))}))
      }
    }
  }

  def render(tool:Tool,toolOwner:ToolUser,toolCategory:ToolCategory,subToolCategory:SubToolCategory,reviews:List[Review],login_user:ToolUser): play.twirl.api.HtmlFormat.Appendable = apply(tool,toolOwner,toolCategory,subToolCategory,reviews,login_user)

  def f:((Tool,ToolUser,ToolCategory,SubToolCategory,List[Review],ToolUser) => play.twirl.api.HtmlFormat.Appendable) = (tool,toolOwner,toolCategory,subToolCategory,reviews,login_user) => apply(tool,toolOwner,toolCategory,subToolCategory,reviews,login_user)

  def ref: this.type = this

}


}

/**/
object overview extends overview_Scope0.overview
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 18:12:36 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/tools/overview.scala.html
                  HASH: f8f0ff84a6dfbfcff07f12857824f46baaaaa210
                  MATRIX: 815->1|1046->136|1074->139|1095->152|1134->154|1162->156|1396->364|1410->370|1472->412|1595->535|1624->537|1677->564|1718->596|1757->597|1786->600|1799->605|1839->621|1868->623|1979->707|1992->711|2023->721|2116->787|2129->791|2155->796|2354->968|2367->972|2393->977|2433->989|2582->1111|2600->1120|2630->1129|2660->1131|2717->1161|2735->1170|2762->1176|3043->1430|3064->1442|3090->1447|3130->1459|3288->1590|3312->1605|3338->1610|3378->1622|3536->1753|3549->1757|3582->1769|3622->1781|3773->1905|3786->1909|3813->1915|3842->1916|4018->2065|4031->2069|4064->2081|4104->2093|4263->2224|4277->2228|4313->2242|4353->2253|4462->2335|4493->2356|4534->2358|4566->2362|4698->2475|4711->2480|4750->2481|4780->2483|4863->2539|4897->2556|4938->2558|4970->2562|5065->2630|5075->2631|5102->2636|5134->2640|5216->2694|5227->2695|5261->2707|5291->2708|5341->2730|5352->2731|5384->2741|5414->2742|5473->2770|5507->2773|5541->2779|5665->2875|5682->2881|5731->2907
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|53->22|53->22|53->22|54->23|54->23|54->23|64->33|64->33|64->33|65->34|73->42|73->42|73->42|73->42|73->42|73->42|73->42|82->51|82->51|82->51|83->52|92->61|92->61|92->61|93->62|102->71|102->71|102->71|103->72|112->81|112->81|112->81|112->81|122->91|122->91|122->91|123->92|132->101|132->101|132->101|133->102|145->114|145->114|145->114|147->116|153->122|153->122|153->122|154->123|156->125|156->125|156->125|158->127|160->129|160->129|160->129|161->130|163->132|163->132|163->132|163->132|164->133|164->133|164->133|164->133|168->137|169->138|172->141|172->141|172->141|172->141
                  -- GENERATED --
              */
          