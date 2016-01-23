
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jintao/CTS2/CTS/conf/routes
// @DATE:Sun Dec 13 17:02:48 EST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: controllers.Application,
  // @LINE:9
  Home_3: controllers.Home,
  // @LINE:12
  Account_2: controllers.Account,
  // @LINE:22
  Tools_1: controllers.Tools,
  // @LINE:31
  Categories_0: controllers.Categories,
  // @LINE:37
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:9
    Home_3: controllers.Home,
    // @LINE:12
    Account_2: controllers.Account,
    // @LINE:22
    Tools_1: controllers.Tools,
    // @LINE:31
    Categories_0: controllers.Categories,
    // @LINE:37
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_5, Home_3, Account_2, Tools_1, Categories_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, Home_3, Account_2, Tools_1, Categories_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Home.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home/subcategory/""", """controllers.Home.subcategory(id1:Integer, id2:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/login""", """controllers.Account.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signup""", """controllers.Account.signup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/login""", """controllers.Account.loginPost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signup""", """controllers.Account.signupPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/logout""", """controllers.Account.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/user""", """controllers.Account.user()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/userById/$id<[^/]+>""", """controllers.Account.userById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/userlist""", """controllers.Account.userlist()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/userlist""", """controllers.Account.saveProfile(user_id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/add""", """controllers.Tools.add()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/add""", """controllers.Tools.addPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/edit/$id<[^/]+>""", """controllers.Tools.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/edit/$id<[^/]+>""", """controllers.Tools.editPost(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/delete/$id<[^/]+>""", """controllers.Tools.delete(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/delete/$id<[^/]+>""", """controllers.Tools.deletePost(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/overview/$id<[^/]+>""", """controllers.Tools.overview(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tool/overview/review/$id<[^/]+>""", """controllers.Tools.reviewPost(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.Categories.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.Categories.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories/$id<[^/]+>""", """controllers.Categories.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Home_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Home_index1_invoker = createInvoker(
    Home_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "index",
      Nil,
      "GET",
      """POST    /                      controllers.Application.login()
POST    /                      controllers.Application.signup()""",
      this.prefix + """home"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Home_subcategory2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home/subcategory/")))
  )
  private[this] lazy val controllers_Home_subcategory2_invoker = createInvoker(
    Home_3.subcategory(fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "subcategory",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """home/subcategory/"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Account_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/login")))
  )
  private[this] lazy val controllers_Account_login3_invoker = createInvoker(
    Account_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """account/login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Account_signup4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signup")))
  )
  private[this] lazy val controllers_Account_signup4_invoker = createInvoker(
    Account_2.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """account/signup"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Account_loginPost5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/login")))
  )
  private[this] lazy val controllers_Account_loginPost5_invoker = createInvoker(
    Account_2.loginPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "loginPost",
      Nil,
      "POST",
      """""",
      this.prefix + """account/login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Account_signupPost6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signup")))
  )
  private[this] lazy val controllers_Account_signupPost6_invoker = createInvoker(
    Account_2.signupPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "signupPost",
      Nil,
      "POST",
      """""",
      this.prefix + """account/signup"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Account_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/logout")))
  )
  private[this] lazy val controllers_Account_logout7_invoker = createInvoker(
    Account_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """account/logout"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Account_user8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/user")))
  )
  private[this] lazy val controllers_Account_user8_invoker = createInvoker(
    Account_2.user(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "user",
      Nil,
      "GET",
      """""",
      this.prefix + """account/user"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Account_userById9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/userById/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Account_userById9_invoker = createInvoker(
    Account_2.userById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "userById",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """account/userById/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Account_userlist10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/userlist")))
  )
  private[this] lazy val controllers_Account_userlist10_invoker = createInvoker(
    Account_2.userlist(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "userlist",
      Nil,
      "GET",
      """""",
      this.prefix + """account/userlist"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Account_saveProfile11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/userlist")))
  )
  private[this] lazy val controllers_Account_saveProfile11_invoker = createInvoker(
    Account_2.saveProfile(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "saveProfile",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """account/userlist"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Tools_add12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/add")))
  )
  private[this] lazy val controllers_Tools_add12_invoker = createInvoker(
    Tools_1.add(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "add",
      Nil,
      "GET",
      """""",
      this.prefix + """tool/add"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Tools_addPost13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/add")))
  )
  private[this] lazy val controllers_Tools_addPost13_invoker = createInvoker(
    Tools_1.addPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "addPost",
      Nil,
      "POST",
      """""",
      this.prefix + """tool/add"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Tools_edit14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_edit14_invoker = createInvoker(
    Tools_1.edit(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """tool/edit/$id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Tools_editPost15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_editPost15_invoker = createInvoker(
    Tools_1.editPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "editPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """tool/edit/$id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Tools_delete16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_delete16_invoker = createInvoker(
    Tools_1.delete(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "delete",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """tool/delete/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Tools_deletePost17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_deletePost17_invoker = createInvoker(
    Tools_1.deletePost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "deletePost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """tool/delete/$id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Tools_overview18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/overview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_overview18_invoker = createInvoker(
    Tools_1.overview(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "overview",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """tool/overview/$id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Tools_reviewPost19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tool/overview/review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Tools_reviewPost19_invoker = createInvoker(
    Tools_1.reviewPost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Tools",
      "reviewPost",
      Seq(classOf[Integer]),
      "POST",
      """""",
      this.prefix + """tool/overview/review/$id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Categories_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_Categories_index20_invoker = createInvoker(
    Categories_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Categories_create21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_Categories_create21_invoker = createInvoker(
    Categories_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Categories_show22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Categories_show22_invoker = createInvoker(
    Categories_0.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Categories",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """categories/$id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.index())
      }
  
    // @LINE:9
    case controllers_Home_index1_route(params) =>
      call { 
        controllers_Home_index1_invoker.call(Home_3.index())
      }
  
    // @LINE:10
    case controllers_Home_subcategory2_route(params) =>
      call(params.fromQuery[Integer]("id1", None), params.fromQuery[Integer]("id2", None)) { (id1, id2) =>
        controllers_Home_subcategory2_invoker.call(Home_3.subcategory(id1, id2))
      }
  
    // @LINE:12
    case controllers_Account_login3_route(params) =>
      call { 
        controllers_Account_login3_invoker.call(Account_2.login())
      }
  
    // @LINE:13
    case controllers_Account_signup4_route(params) =>
      call { 
        controllers_Account_signup4_invoker.call(Account_2.signup())
      }
  
    // @LINE:14
    case controllers_Account_loginPost5_route(params) =>
      call { 
        controllers_Account_loginPost5_invoker.call(Account_2.loginPost())
      }
  
    // @LINE:15
    case controllers_Account_signupPost6_route(params) =>
      call { 
        controllers_Account_signupPost6_invoker.call(Account_2.signupPost())
      }
  
    // @LINE:16
    case controllers_Account_logout7_route(params) =>
      call { 
        controllers_Account_logout7_invoker.call(Account_2.logout())
      }
  
    // @LINE:17
    case controllers_Account_user8_route(params) =>
      call { 
        controllers_Account_user8_invoker.call(Account_2.user())
      }
  
    // @LINE:18
    case controllers_Account_userById9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Account_userById9_invoker.call(Account_2.userById(id))
      }
  
    // @LINE:19
    case controllers_Account_userlist10_route(params) =>
      call { 
        controllers_Account_userlist10_invoker.call(Account_2.userlist())
      }
  
    // @LINE:20
    case controllers_Account_saveProfile11_route(params) =>
      call(params.fromQuery[Integer]("user_id", None)) { (user_id) =>
        controllers_Account_saveProfile11_invoker.call(Account_2.saveProfile(user_id))
      }
  
    // @LINE:22
    case controllers_Tools_add12_route(params) =>
      call { 
        controllers_Tools_add12_invoker.call(Tools_1.add())
      }
  
    // @LINE:23
    case controllers_Tools_addPost13_route(params) =>
      call { 
        controllers_Tools_addPost13_invoker.call(Tools_1.addPost())
      }
  
    // @LINE:24
    case controllers_Tools_edit14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_edit14_invoker.call(Tools_1.edit(id))
      }
  
    // @LINE:25
    case controllers_Tools_editPost15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_editPost15_invoker.call(Tools_1.editPost(id))
      }
  
    // @LINE:26
    case controllers_Tools_delete16_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_delete16_invoker.call(Tools_1.delete(id))
      }
  
    // @LINE:27
    case controllers_Tools_deletePost17_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_deletePost17_invoker.call(Tools_1.deletePost(id))
      }
  
    // @LINE:28
    case controllers_Tools_overview18_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_overview18_invoker.call(Tools_1.overview(id))
      }
  
    // @LINE:29
    case controllers_Tools_reviewPost19_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Tools_reviewPost19_invoker.call(Tools_1.reviewPost(id))
      }
  
    // @LINE:31
    case controllers_Categories_index20_route(params) =>
      call { 
        controllers_Categories_index20_invoker.call(Categories_0.index())
      }
  
    // @LINE:32
    case controllers_Categories_create21_route(params) =>
      call { 
        controllers_Categories_create21_invoker.call(Categories_0.create())
      }
  
    // @LINE:33
    case controllers_Categories_show22_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Categories_show22_invoker.call(Categories_0.show(id))
      }
  
    // @LINE:37
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_4.versioned(path, file))
      }
  }
}