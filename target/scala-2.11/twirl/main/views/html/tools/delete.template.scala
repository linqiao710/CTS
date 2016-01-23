
package views.html.tools

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object delete_Scope0 {
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

class delete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Tool,ToolUser,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tool: Tool, user:ToolUser, categoryName:String, subcategoryName:String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/main("Tools")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/tooledit.js")),format.raw/*5.65*/("""" type="text/javascript"></script>

<br>
<br>
<br>
<br>

<div class="container">

   <h4><p><u><a href='"""),_display_(/*14.24*/routes/*14.30*/.Account.user()),format.raw/*14.45*/("""'>Back</a></u></p></h4>
    <br>
     <p class="lead">Delete Tool </p>
    <br>
      <img src='"""),_display_(/*18.18*/tool/*18.22*/.imageLink),format.raw/*18.32*/("""' border='0' style="width:170px;height:170px;" /><br>
      <h3>"""),_display_(/*19.12*/tool/*19.16*/.name),format.raw/*19.21*/("""</h3>


   <br>



<body  ng-app="myApp" ng-controller="myCtrl" ng-init="toolname='"""),_display_(/*26.66*/tool/*26.70*/.name),format.raw/*26.75*/("""';imageLink='"""),_display_(/*26.89*/tool/*26.93*/.imageLink),format.raw/*26.103*/("""';price='"""),_display_(/*26.113*/tool/*26.117*/.price),format.raw/*26.123*/("""';description='"""),_display_(/*26.139*/tool/*26.143*/.description),format.raw/*26.155*/("""';specification='"""),_display_(/*26.173*/tool/*26.177*/.specification),format.raw/*26.191*/("""';pass('"""),_display_(/*26.200*/tool/*26.204*/.isAvailable),format.raw/*26.216*/("""','"""),_display_(/*26.220*/categoryName),format.raw/*26.232*/("""','"""),_display_(/*26.236*/subcategoryName),format.raw/*26.251*/("""')">

<form class="form-horizontal" ng-hide="hideform" action=""""),_display_(/*28.59*/routes/*28.65*/.Tools.deletePost(tool.id)),format.raw/*28.91*/("""" method="post" name="toolForm" novalidate>

       <div class="form-group">
            <label class="col-sm-2 control-label">Tool Name:</label>
            <div class="col-sm-10">
                <input type="text" name="toolname" ng-model="toolname" readonly>

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">User Name: &nbsp;&nbsp;&nbsp;</label>

            <div class="col-sm-10">
                <input type="text" name="username" ng-model="username" placeholder=""""),_display_(/*42.86*/user/*42.90*/.username),format.raw/*42.99*/("""" readonly>

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Image Link:</label>
            <div class="col-sm-10">
                <input type="text" name="imageLink" ng-model="imageLink" placeholder=""""),_display_(/*50.88*/tool/*50.92*/.imageLink),format.raw/*50.102*/("""">


            </div>
        </div>

       <div class="form-group">
            <label class="col-sm-2 control-label">Category:</label>
            <div class="col-sm-10">
             <select id="category" name="category" ng-selected="Power Tools" ng-model="subcategories" ng-options="category for (category, subcategories) in categories">

                    <option value=''selected>Select</option>

                </select>
                <span style="color:red" ng-show="toolForm.category.$dirty &&  toolForm.category.$invalid">
                      <span ng-show="toolForm.category.$error.required">Category is required.</span>

                </span>
                <br>
            </div>
        </div>

        <div class="form-group" >
            <label class="col-sm-2 control-label">SubCategory:</label>
            <div class="col-sm-10">
                <select id="subcategory" name="subcategory" ng-disabled="!subcategories" ng-model="subcategory">
                    <option value='' selected>Select</option>

                      <option ng-repeat="subcategory in subcategories" value='"""),format.raw/*78.79*/("""{"""),format.raw/*78.80*/("""{"""),format.raw/*78.81*/("""subcategory"""),format.raw/*78.92*/("""}"""),format.raw/*78.93*/("""}"""),format.raw/*78.94*/("""'>"""),format.raw/*78.96*/("""{"""),format.raw/*78.97*/("""{"""),format.raw/*78.98*/("""subcategory"""),format.raw/*78.109*/("""}"""),format.raw/*78.110*/("""}"""),format.raw/*78.111*/("""</option>
                  </select>

                <br>
            </div>
        </div>



      <div class="form-group" >
            <label class="col-sm-2 control-label">Is Available:</label>
            <div class="col-sm-10">
                <select name="isAvailable" ng-model="isAvailable">
                    <option  value="">Select</option>
                    <option value="Available" selected>Available</option>
                     <option value="Not Available">Not Available</option>

                </select>

                <br>
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label">Price:</label>
            <div class="col-sm-10">
                $<input type="text" name="price" ng-model="price"  readonly> Per Day

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Description:</label>
            <div class="col-sm-10">
                <textarea name="description" ng-model="description" cols="50" rows="10" ng-maxlength="1000" readonly>
                 </textarea>

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Specification:</label>
            <div class="col-sm-10">
                <textarea name="specification" ng-model="specification" cols="50" rows="10" ng-maxlength="1000" readonly>
                 </textarea>


            </div>
        </div>


        <hr>
        <button class="btn btn-success"> Confirm Delete </button>
    </form>
</div>

</body>
</html>
""")))}),format.raw/*137.2*/("""
"""))
      }
    }
  }

  def render(tool:Tool,user:ToolUser,categoryName:String,subcategoryName:String): play.twirl.api.HtmlFormat.Appendable = apply(tool,user,categoryName,subcategoryName)

  def f:((Tool,ToolUser,String,String) => play.twirl.api.HtmlFormat.Appendable) = (tool,user,categoryName,subcategoryName) => apply(tool,user,categoryName,subcategoryName)

  def ref: this.type = this

}


}

/**/
object delete extends delete_Scope0.delete
              /*
                  -- GENERATED --
                  DATE: Sat Dec 12 23:31:35 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/tools/delete.scala.html
                  HASH: d943474767bcabfa32c7f55b23335622249b6305
                  MATRIX: 774->1|942->74|970->77|991->90|1030->92|1058->94|1292->302|1306->308|1370->352|1511->466|1526->472|1562->487|1690->588|1703->592|1734->602|1827->668|1840->672|1866->677|1984->768|1997->772|2023->777|2064->791|2077->795|2109->805|2147->815|2161->819|2189->825|2233->841|2247->845|2281->857|2327->875|2341->879|2377->893|2414->902|2428->906|2462->918|2494->922|2528->934|2560->938|2597->953|2690->1019|2705->1025|2752->1051|3335->1607|3348->1611|3378->1620|3687->1902|3700->1906|3732->1916|4906->3062|4935->3063|4964->3064|5003->3075|5032->3076|5061->3077|5091->3079|5120->3080|5149->3081|5189->3092|5219->3093|5249->3094|6955->4769
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|45->14|45->14|45->14|49->18|49->18|49->18|50->19|50->19|50->19|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|59->28|59->28|59->28|73->42|73->42|73->42|81->50|81->50|81->50|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|168->137
                  -- GENERATED --
              */
          