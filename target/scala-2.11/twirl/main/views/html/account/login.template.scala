
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("ToolCategory")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src=""""),_display_(/*4.15*/routes/*4.21*/.Assets.versioned("javascripts/user.js")),format.raw/*4.61*/("""" type="text/javascript"></script>
<body >
<br>
<br>
<br>
<br>

<div class="container">
<h4><p><u><a href='"""),_display_(/*12.21*/routes/*12.27*/.Home.index()),format.raw/*12.40*/("""'>Back</a></u></p></h4>
<br>
    <h1>Log In</h1>
<br>


        <form class="form-horizontal" ng-app="myApp" ng-controller="userCtrl" ng-hide="hideform"  action=""""),_display_(/*18.108*/routes/*18.114*/.Account.loginPost()),format.raw/*18.134*/("""" method="post" name="myForm" novalidate>

            <div class="form-group">
                <label class="col-sm-2 control-label">Username:</label>
                <div class="col-sm-10">
                    <input type="text" name="username" ng-model="username"  placeholder="username" required>  <span style="color:red"><font size="3">*</font></span>
                     <span style="color:red" ng-show="myForm.username.$dirty && myForm.username.$invalid">
                      <span ng-show="myForm.username.$error.required">Username is required.</span>
                      </span>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">Password:</label>
                <div class="col-sm-10">
                    <input type="password" name="passw1" ng-model="passw1" placeholder="Password" ng-minlength="8" required> <span style="color:red"><font size="3">*</font></span>
                     <span style="color:red" ng-show="myForm.passw1.$dirty && myForm.passw1.$invalid">
                      <span ng-show="myForm.passw1.$error.required">Password is required.</span>
                      <span ng-show="myForm.passw1.$error.minlength">Password contains at least 8 characters.</span>
                      </span>
                </div>
            </div>

            <hr>
            <button class="btn btn-success" ng-disabled="myForm.username.$error.required||myForm.passw1.$error.required|| myForm.passw1.$error.minlength">
                <span class="glyphicon glyphicon-log-in"></span> Login
            </button>
        </form>
</div>

</body>
</html>
""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 16:35:29 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/account/login.scala.html
                  HASH: 08b702815fd85f867d3b7de564530226461e0d26
                  MATRIX: 835->1|863->21|902->23|930->25|1164->233|1178->239|1238->279|1381->395|1396->401|1430->414|1627->583|1643->589|1685->609|3408->2302
                  LINES: 32->1|32->1|32->1|33->2|35->4|35->4|35->4|43->12|43->12|43->12|49->18|49->18|49->18|81->50
                  -- GENERATED --
              */
          