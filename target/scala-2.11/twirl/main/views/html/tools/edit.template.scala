
package views.html.tools

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Tool,ToolUser,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
     <p class="lead">Edit Tool </p>
    <br>
      <img src='"""),_display_(/*18.18*/tool/*18.22*/.imageLink),format.raw/*18.32*/("""' border='0' style="width:170px;height:170px;" /><br>
      <h3>"""),_display_(/*19.12*/tool/*19.16*/.name),format.raw/*19.21*/("""</h3>


   <br>



<body  ng-app="myApp" ng-controller="myCtrl" ng-init="toolname='"""),_display_(/*26.66*/tool/*26.70*/.name),format.raw/*26.75*/("""';imageLink='"""),_display_(/*26.89*/tool/*26.93*/.imageLink),format.raw/*26.103*/("""';price='"""),_display_(/*26.113*/tool/*26.117*/.price),format.raw/*26.123*/("""';description='"""),_display_(/*26.139*/tool/*26.143*/.description),format.raw/*26.155*/("""';specification='"""),_display_(/*26.173*/tool/*26.177*/.specification),format.raw/*26.191*/("""';pass('"""),_display_(/*26.200*/tool/*26.204*/.isAvailable),format.raw/*26.216*/("""','"""),_display_(/*26.220*/categoryName),format.raw/*26.232*/("""','"""),_display_(/*26.236*/subcategoryName),format.raw/*26.251*/("""')">

<form class="form-horizontal" ng-hide="hideform" action=""""),_display_(/*28.59*/routes/*28.65*/.Tools.editPost(tool.id)),format.raw/*28.89*/("""" method="post" name="toolForm" novalidate>

       <div class="form-group">
            <label class="col-sm-2 control-label">Tool Name:</label>
            <div class="col-sm-10">
                <input type="text" name="toolname" ng-model="toolname" required> <span style="color:red"><font size="3">*</font></span>
                    <span style="color:red" ng-show="toolForm.toolname.$dirty&& toolForm.toolname.$invalid">
                      <span ng-show="toolForm.toolname.$error.required">Tool name is required.</span>
                      </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">User Name: &nbsp;&nbsp;&nbsp;</label>

            <div class="col-sm-10">
                <input type="text" name="username" ng-model="username" placeholder=""""),_display_(/*44.86*/user/*44.90*/.username),format.raw/*44.99*/("""" readonly required >
                <span style="color:red" ng-show="toolForm.username.$dirty &&  toolForm.username.$invalid">
                      <span ng-show="toolForm.username.$error.required">username is required.</span>
                      </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Image Link:</label>
            <div class="col-sm-10">
                <input type="text" name="imageLink" ng-model="imageLink" placeholder=""""),_display_(/*54.88*/tool/*54.92*/.imageLink),format.raw/*54.102*/("""">


            </div>
        </div>

       <div class="form-group">
            <label class="col-sm-2 control-label">Category:</label>
            <div class="col-sm-10">
             <select id="category" name="category" ng-selected="Power Tools" ng-model="subcategories" ng-options="category for (category, subcategories) in categories" required>

                    <option value=''selected>Select</option>

                </select> <span style="color:red"><font size="3">*</font></span>
                <span style="color:red" ng-show="toolForm.category.$dirty &&  toolForm.category.$invalid">
                      <span ng-show="toolForm.category.$error.required">Category is required.</span>

                </span>
                <br>
            </div>
        </div>

        <div class="form-group" >
            <label class="col-sm-2 control-label">SubCategory:</label>
            <div class="col-sm-10">
                <select id="subcategory" name="subcategory" ng-disabled="!subcategories" ng-model="subcategory" required >
                    <option value='' selected>Select</option>

                      <option ng-repeat="subcategory in subcategories" value='"""),format.raw/*82.79*/("""{"""),format.raw/*82.80*/("""{"""),format.raw/*82.81*/("""subcategory"""),format.raw/*82.92*/("""}"""),format.raw/*82.93*/("""}"""),format.raw/*82.94*/("""'>"""),format.raw/*82.96*/("""{"""),format.raw/*82.97*/("""{"""),format.raw/*82.98*/("""subcategory"""),format.raw/*82.109*/("""}"""),format.raw/*82.110*/("""}"""),format.raw/*82.111*/("""</option>
                  </select> <span style="color:red"><font size="3">*</font></span>
                <span style="color:red" ng-show="toolForm.subcategory.$dirty && toolForm.subcategory.$invalid"">
                 <span ng-show="toolForm.subcategory.$error.required">SubCategory is required.</span>

                </span>
                <br>
            </div>
        </div>



      <div class="form-group" >
            <label class="col-sm-2 control-label">Is Available:</label>
            <div class="col-sm-10">
                <select name="isAvailable" ng-model="isAvailable" required >
                    <option  value="">Select</option>
                    <option value="Available" selected>Available</option>
                     <option value="Not Available">Not Available</option>

                </select> <span style="color:red"><font size="3">*</font></span>
                 <span style="color:red" ng-show="toolForm.isAvailable.$dirty && toolForm.isAvailable.$invalid"">
                 <span ng-show="toolForm.isAvailable.$error.required">required.</span>
                <br>
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label">Price:</label>
            <div class="col-sm-10">
                $<input type="text" name="price" ng-model="price"  > Per Day

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Description:</label>
            <div class="col-sm-10">
                <textarea name="description" ng-model="description" cols="50" rows="10" ng-maxlength="1000">
                 </textarea>
                 <span style="color:red" ng-show="toolForm.description.$dirty && toolForm.description.$invalid">

                 <span ng-show="toolForm.description.$error.maxlength">At Most 1000 characters.</span>
                 </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Specification:</label>
            <div class="col-sm-10">
                <textarea name="specification" ng-model="specification" cols="50" rows="10" ng-maxlength="1000">
                 </textarea>
                  <span style="color:red" ng-show="toolForm.specification.$dirty && toolForm.specification.$invalid">

                 <span ng-show="toolForm.specification.$error.maxlength">At Most 1000 characters.</span>
                 </span>

            </div>
        </div>


        <hr>
        <button class="btn btn-success" ng-disabled="incomplete || error"> Save </button>
    </form>
</div>

</body>
</html>
""")))}),format.raw/*151.2*/("""
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
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Sat Dec 12 23:15:38 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/tools/edit.scala.html
                  HASH: e756d3bd79c5b07a2fc99d9375e2e759f6c3a051
                  MATRIX: 770->1|938->74|966->77|987->90|1026->92|1054->94|1288->302|1302->308|1366->352|1507->466|1522->472|1558->487|1684->586|1697->590|1728->600|1821->666|1834->670|1860->675|1978->766|1991->770|2017->775|2058->789|2071->793|2103->803|2141->813|2155->817|2183->823|2227->839|2241->843|2275->855|2321->873|2335->877|2371->891|2408->900|2422->904|2456->916|2488->920|2522->932|2554->936|2591->951|2684->1017|2699->1023|2744->1047|3624->1900|3637->1904|3667->1913|4225->2444|4238->2448|4270->2458|5518->3678|5547->3679|5576->3680|5615->3691|5644->3692|5673->3693|5703->3695|5732->3696|5761->3697|5801->3708|5831->3709|5861->3710|8623->6441
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|45->14|45->14|45->14|49->18|49->18|49->18|50->19|50->19|50->19|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|59->28|59->28|59->28|75->44|75->44|75->44|85->54|85->54|85->54|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|113->82|182->151
                  -- GENERATED --
              */
          