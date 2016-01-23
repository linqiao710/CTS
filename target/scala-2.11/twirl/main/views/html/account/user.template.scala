
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[ToolUser,List[Tool],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(toolUser: ToolUser, tools: List[Tool]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),_display_(/*2.2*/main("ToolCategory")/*2.22*/ {_display_(Seq[Any](format.raw/*2.24*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.versioned("javascripts/user.js")),format.raw/*6.61*/("""" type="text/javascript"></script>
<br>
<br>
<br>
<br>

<div class="container">

  <div class="col-md-3">
    <p class="lead">Account Page</p>
    <div class="list-group">
      <img src='"""),_display_(/*17.18*/toolUser/*17.26*/.imageLink),format.raw/*17.36*/("""' border='0' style="width:100px;height:100px;" /><br>
      <h3>"""),_display_(/*18.12*/toolUser/*18.20*/.username),format.raw/*18.29*/("""</h3>
      <br>
      <form action=""""),_display_(/*20.22*/routes/*20.28*/.Tools.add()),format.raw/*20.40*/("""" method="get">
        <button class="btn btn-success">
          <span class="glyphicon glyphicon-plus"></span> Add New Tool

        </button>
      </form>
      <br>

      """),_display_(/*28.8*/if(toolUser.username=="admin")/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""
      """),format.raw/*29.7*/("""<form action=""""),_display_(/*29.22*/routes/*29.28*/.Account.userlist()),format.raw/*29.47*/("""" method="get">
        <button class="btn btn-success">
          <span class="glyphicon glyphicon-list-alt"></span> Manage Users

        </button>
      </form>
      <br>
   """)))}),format.raw/*36.5*/("""
      """),format.raw/*37.7*/("""<h3>Tools Added by """),_display_(/*37.27*/toolUser/*37.35*/.username),format.raw/*37.44*/("""</h3>
    </div>
  </div>


  <!-- begin edit profile-->

  <form class="navbar-form navbar-left" ng-app="myApp" ng-controller="userCtrl"  ng-hide="hideform" ng-init="phone='"""),_display_(/*44.118*/toolUser/*44.126*/.phone),format.raw/*44.132*/("""';email='"""),_display_(/*44.142*/toolUser/*44.150*/.email),format.raw/*44.156*/("""'" action=""""),_display_(/*44.168*/routes/*44.174*/.Account.saveProfile(toolUser.id)),format.raw/*44.207*/("""" method="post" name="myForm" novalidate>
    <div class="form-group">
      <label for="username" >Username: </label>

    <input type="text" class="form-control" name="username" value="""),_display_(/*48.68*/toolUser/*48.76*/.username),format.raw/*48.85*/(""" """),format.raw/*48.86*/("""readonly>
    </div>
      <br>
    <br>

    <div lass="form-group">

      <label for="phone">Phone Number: &nbsp;&nbsp;&nbsp;</label>
      <input type="text" class="form-control" name="phone" ng-model="phone" value="""),_display_(/*56.84*/toolUser/*56.92*/.phone),format.raw/*56.98*/(""">
    </div>
    <br>


    <div lass="form-group">

    <label for="email">Email: &nbsp;&nbsp;&nbsp;</label>
    <input type="email" class="form-control" name="email" ng-model="email" required>  <span style="color:red"><font size="3">*</font></span>
     <span style="color:red" ng-show="myForm.email.$dirty && myForm.email.$invalid">
      <span ng-show="myForm.email.$error.required">Email is required.</span>
       <span ng-show="myForm.email.$error.email">Invalid email address.</span>
       </span>

    </div>
    <br>
    <button ng-disabled="myForm.email.$error.required||myForm.email.$error.email">Save Profile</button><br>
    <br>

    """),format.raw/*75.33*/("""
   """),format.raw/*76.4*/("""<span style="color:red">
"""),_display_(/*77.2*/if(flash.containsKey("success"))/*77.34*/{_display_(Seq[Any](format.raw/*77.35*/("""
"""),_display_(/*78.2*/flash/*78.7*/.get("success"))))}),format.raw/*78.23*/("""
"""),_display_(/*79.2*/if(flash.containsKey("error"))/*79.32*/{_display_(Seq[Any](format.raw/*79.33*/("""
"""),_display_(/*80.2*/flash/*80.7*/.get("error"))))}),format.raw/*80.21*/("""
"""),_display_(/*81.2*/if(flash.containsKey("disconnected"))/*81.39*/{_display_(Seq[Any](format.raw/*81.40*/("""
"""),_display_(/*82.2*/flash/*82.7*/.get("disconnected"))))}),format.raw/*82.28*/("""
 """),format.raw/*83.2*/("""</span>
  </form>

  <!-- end edit profile-->


"""),_display_(/*89.2*/if(tools.isEmpty())/*89.21*/{_display_(Seq[Any](format.raw/*89.22*/("""
  """),format.raw/*90.3*/("""<table class="table table-striped">

    <thead>
    <tr>
      <th>Tool Image</th>
      <th>Tool Name</th>
      <th>Price(Per Day)</th>
      <th>Is Available</th>
      <th>Edit</th>
    </tr>
    </thead>
    <tbody>
    <tr>
   <td>
No tool added
   </td>
    </tr>
    </tbody>
    </table>
""")))}/*109.2*/else/*109.7*/{_display_(Seq[Any](format.raw/*109.8*/("""
"""),format.raw/*110.1*/("""<br>
  <br>
  <br>
<table class="table table-striped">

  <thead>
  <tr>
    <th>Tool Image</th>
    <th>Tool Name</th>
    <th>Price(Per Day)</th>
    <th>Is Available</th>
    <th>Edit</th>
  </tr>
  </thead>
  <tbody>
  """),_display_(/*125.4*/for(t <- tools) yield /*125.19*/ {_display_(Seq[Any](format.raw/*125.21*/("""
  """),format.raw/*126.3*/("""<tr >
    <td>
      <img class="img-responsive" src='"""),_display_(/*128.41*/t/*128.42*/.imageLink),format.raw/*128.52*/("""' border='0' style="width:120px;height:120px;" /><br>
    </td>
    <td>
      <a href='"""),_display_(/*131.17*/routes/*131.23*/.Tools.overview(t.id)),format.raw/*131.44*/("""'>"""),_display_(/*131.47*/t/*131.48*/.name),format.raw/*131.53*/("""</a>
    </td>

    <td>
       """),_display_(/*135.9*/t/*135.10*/.price),format.raw/*135.16*/("""
    """),format.raw/*136.5*/("""</td>


    <td>
      """),_display_(/*140.8*/t/*140.9*/.isAvailable),format.raw/*140.21*/("""
    """),format.raw/*141.5*/("""</td>

    <td>
      <form action=""""),_display_(/*144.22*/routes/*144.28*/.Tools.edit(t.id)),format.raw/*144.45*/("""" method="get">
      <button class="btn btn-success">
        <span class="glyphicon glyphicon-pencil"></span>  Edit

      </button>
        </form>
      <br>
      <form action=""""),_display_(/*151.22*/routes/*151.28*/.Tools.delete(t.id)),format.raw/*151.47*/("""" method="get">
        <button class="btn btn-success">
          <span class="glyphicon glyphicon-remove"></span>  Delete

        </button>
      </form>
    </td>

  </tr>
  """)))}),format.raw/*160.4*/("""
  """),format.raw/*161.3*/("""</tbody>
</table>


</div>



""")))}),format.raw/*169.2*/("""
""")))}),format.raw/*170.2*/("""
"""))
      }
    }
  }

  def render(toolUser:ToolUser,tools:List[Tool]): play.twirl.api.HtmlFormat.Appendable = apply(toolUser,tools)

  def f:((ToolUser,List[Tool]) => play.twirl.api.HtmlFormat.Appendable) = (toolUser,tools) => apply(toolUser,tools)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Sun Dec 13 18:02:33 EST 2015
                  SOURCE: C:/Users/jintao/CTS2/CTS/app/views/account/user.scala.html
                  HASH: e36ff3118bab2cda410aec17e861d23ac9c55a79
                  MATRIX: 764->1|898->40|926->43|954->63|993->65|1023->69|1257->277|1271->283|1331->323|1558->523|1575->531|1606->541|1699->607|1716->615|1746->624|1813->664|1828->670|1861->682|2074->869|2113->899|2152->900|2187->908|2229->923|2244->929|2284->948|2500->1134|2535->1142|2582->1162|2599->1170|2629->1179|2839->1361|2857->1369|2885->1375|2923->1385|2941->1393|2969->1399|3009->1411|3025->1417|3080->1450|3298->1641|3315->1649|3345->1658|3374->1659|3629->1887|3646->1895|3673->1901|4370->2598|4402->2603|4455->2630|4496->2662|4535->2663|4564->2666|4577->2671|4617->2687|4646->2690|4685->2720|4724->2721|4753->2724|4766->2729|4804->2743|4833->2746|4879->2783|4918->2784|4947->2787|4960->2792|5005->2813|5035->2816|5116->2871|5144->2890|5183->2891|5214->2895|5551->3213|5564->3218|5603->3219|5633->3221|5899->3460|5931->3475|5972->3477|6004->3481|6089->3538|6100->3539|6132->3549|6252->3641|6268->3647|6311->3668|6342->3671|6353->3672|6380->3677|6444->3714|6455->3715|6483->3721|6517->3727|6572->3755|6582->3756|6616->3768|6650->3774|6718->3814|6734->3820|6773->3837|6991->4027|7007->4033|7048->4052|7267->4240|7299->4244|7369->4283|7403->4286
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|37->6|37->6|37->6|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|51->20|59->28|59->28|59->28|60->29|60->29|60->29|60->29|67->36|68->37|68->37|68->37|68->37|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|79->48|79->48|79->48|79->48|87->56|87->56|87->56|106->75|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|120->89|120->89|120->89|121->90|140->109|140->109|140->109|141->110|156->125|156->125|156->125|157->126|159->128|159->128|159->128|162->131|162->131|162->131|162->131|162->131|162->131|166->135|166->135|166->135|167->136|171->140|171->140|171->140|172->141|175->144|175->144|175->144|182->151|182->151|182->151|191->160|192->161|200->169|201->170
                  -- GENERATED --
              */
          