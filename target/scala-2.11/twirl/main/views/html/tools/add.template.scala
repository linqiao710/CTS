
package views.html.tools

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object add_Scope0 {
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

class add extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ToolUser,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:ToolUser):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/main("Tools")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/tool.js")),format.raw/*5.61*/("""" type="text/javascript"></script>

<br>
<br>
<br>
<br>
<div class="container">
    <h4><p><u><a href='"""),_display_(/*12.25*/routes/*12.31*/.Account.user()),format.raw/*12.46*/("""'>Back</a></u></p></h4>
    <br>

   <h1>Submit a new tool</h1>
    <br>
<body  ng-app="myApp" ng-controller="myCtrl" >
<form class="form-horizontal" ng-hide="hideform" action=""""),_display_(/*18.59*/routes/*18.65*/.Tools.addPost()),format.raw/*18.81*/("""" method="post" name="toolForm" novalidate>

       <div class="form-group">
            <label class="col-sm-2 control-label">Tool Name:</label>
            <div class="col-sm-10">
                <input type="text" name="toolname" ng-model="toolname" placeholder="Tool Name" required>  <span style="color:red"><font size="3">*</font></span>
                    <span style="color:red" ng-show="toolForm.toolname.$dirty&& toolForm.toolname.$invalid">
                      <span ng-show="toolForm.toolname.$error.required">Tool name is required.</span>
                      </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">User Name: &nbsp;&nbsp;&nbsp;</label>

            <div class="col-sm-10">
                <input type="text" name="username" ng-model="username" placeholder=""""),_display_(/*34.86*/user/*34.90*/.username),format.raw/*34.99*/("""" readonly required >
                <span style="color:red" ng-show="toolForm.username.$dirty &&  toolForm.username.$invalid">
                      <span ng-show="toolForm.username.$error.required">username is required.</span>
                      </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Image Link:</label>
            <div class="col-sm-10">
                <input type="text" name="imageLink" ng-model="imageLink" placeholder=".jpg/.img/.png">

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Category:</label>
            <div class="col-sm-10">
             <select id="category" name="category" ng-model="subcategories" ng-options="category for (category, subcategories) in categories" required>

                    <option value=''selected>Select</option>

                </select>  <span style="color:red"><font size="3">*</font></span>
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

                      <option ng-repeat="subcategory in subcategories" value='"""),format.raw/*71.79*/("""{"""),format.raw/*71.80*/("""{"""),format.raw/*71.81*/("""subcategory"""),format.raw/*71.92*/("""}"""),format.raw/*71.93*/("""}"""),format.raw/*71.94*/("""'>"""),format.raw/*71.96*/("""{"""),format.raw/*71.97*/("""{"""),format.raw/*71.98*/("""subcategory"""),format.raw/*71.109*/("""}"""),format.raw/*71.110*/("""}"""),format.raw/*71.111*/("""</option>
                  </select>  <span style="color:red"><font size="3">*</font></span>
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
                    <option  value='' selected>Select</option>
                    <option value="Available" selected>Available</option>
                     <option value="Not Available">Not Available</option>

                </select>  <span style="color:red"><font size="3">*</font></span>
                 <span style="color:red" ng-show="toolForm.isAvailable.$dirty && toolForm.isAvailable.$invalid"">
                 <span ng-show="toolForm.isAvailable.$error.required"> required.</span>
                <br>
            </div>
        </div>



        <div class="form-group">
            <label class="col-sm-2 control-label">Price:</label>
            <div class="col-sm-10">
                $<input type="text" name="price" ng-model="price" placeholder="0.00" > Per Day

            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Description:</label>
            <div class="col-sm-10">
                <textarea name="description" ng-model="description" placeholder="description" cols="50" rows="10" ng-maxlength="1000">
                 </textarea>
                 <span style="color:red" ng-show="toolForm.description.$dirty && toolForm.description.$invalid">

                 <span ng-show="toolForm.description.$error.maxlength">At Most 1000 characters.</span>
                 </span>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Specification:</label>
            <div class="col-sm-10">
                <textarea name="specification" ng-model="specification" placeholder="specification" cols="50" rows="10"  ng-maxlength="1000">
                 </textarea>
                  <span style="color:red" ng-show="toolForm.specification.$dirty && toolForm.specification.$invalid">

                 <span ng-show="toolForm.specification.$error.maxlength">At Most 1000 characters.</span>
                 </span>

            </div>
        </div>


        <hr>
        <button class="btn btn-success" ng-disabled="incomplete || error"> Submit </button>
    </form>
</div>

</body>
</html>
""")))}),format.raw/*139.2*/("""
"""))
      }
    }
  }

  def render(user:ToolUser): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((ToolUser) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object add extends add_Scope0.add
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 17:55:56 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/tools/add.scala.html
                  HASH: 6d09b2f78d2525537027101c6a0a47a0b3c5aa67
                  MATRIX: 749->1|859->16|887->19|908->32|947->34|975->36|1209->244|1223->250|1283->290|1421->401|1436->407|1472->422|1683->606|1698->612|1735->628|2640->1506|2653->1510|2683->1519|4449->3257|4478->3258|4507->3259|4546->3270|4575->3271|4604->3272|4634->3274|4663->3275|4692->3276|4732->3287|4762->3288|4792->3289|7640->6106
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|43->12|43->12|43->12|49->18|49->18|49->18|65->34|65->34|65->34|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|170->139
                  -- GENERATED --
              */
          