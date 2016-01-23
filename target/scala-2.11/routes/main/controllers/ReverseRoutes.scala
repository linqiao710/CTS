
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jintao/CTS2/CTS/conf/routes
// @DATE:Sun Dec 13 17:02:48 EST 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:22
  class ReverseTools(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def edit(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tool/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:29
    def reviewPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tool/overview/review/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:23
    def addPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tool/add")
    }
  
    // @LINE:27
    def deletePost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tool/delete/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:22
    def add(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tool/add")
    }
  
    // @LINE:28
    def overview(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tool/overview/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:25
    def editPost(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tool/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:26
    def delete(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tool/delete/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }

  // @LINE:31
  class ReverseCategories(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:31
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:33
    def show(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categories/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }

  // @LINE:9
  class ReverseHome(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def subcategory(id1:Integer, id2:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "home/subcategory/" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("id1", id1)), Some(implicitly[QueryStringBindable[Integer]].unbind("id2", id2)))))
    }
  
    // @LINE:9
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAccount(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def userlist(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/userlist")
    }
  
    // @LINE:13
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signup")
    }
  
    // @LINE:17
    def user(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/user")
    }
  
    // @LINE:16
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/logout")
    }
  
    // @LINE:20
    def saveProfile(user_id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/userlist" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("user_id", user_id)))))
    }
  
    // @LINE:18
    def userById(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/userById/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:14
    def loginPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/login")
    }
  
    // @LINE:15
    def signupPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signup")
    }
  
    // @LINE:12
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/login")
    }
  
  }


}