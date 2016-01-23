
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jintao/CTS2/CTS/conf/routes
// @DATE:Sun Dec 13 17:02:48 EST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:37
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseTools(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.edit",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:29
    def reviewPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.reviewPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/overview/review/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:23
    def addPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.addPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/add"})
        }
      """
    )
  
    // @LINE:27
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.deletePost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/delete/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:22
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.add",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/add"})
        }
      """
    )
  
    // @LINE:28
    def overview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.overview",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/overview/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:25
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.editPost",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:26
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Tools.delete",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tool/delete/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseCategories(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:31
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:33
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Categories.show",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def subcategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.subcategory",
      """
        function(id1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home/subcategory/" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id1", id1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id2", id2)])})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def userlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.userlist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/userlist"})
        }
      """
    )
  
    // @LINE:13
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signup"})
        }
      """
    )
  
    // @LINE:17
    def user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/user"})
        }
      """
    )
  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/logout"})
        }
      """
    )
  
    // @LINE:20
    def saveProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.saveProfile",
      """
        function(user_id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/userlist" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("user_id", user_id)])})
        }
      """
    )
  
    // @LINE:18
    def userById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.userById",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/userById/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:14
    def loginPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.loginPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/login"})
        }
      """
    )
  
    // @LINE:15
    def signupPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.signupPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signup"})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/login"})
        }
      """
    )
  
  }


}