
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiki/workspace/online-auction-scala/web-gateway/conf/routes
// @DATE:Mon Mar 06 22:18:46 EST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:13
  class ReverseItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def startAuction(id:java.util.UUID): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "item/" + implicitly[PathBindable[java.util.UUID]].unbind("id", id) + "/auction")
    }
  
    // @LINE:15
    def getItem(id:java.util.UUID): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "item/" + implicitly[PathBindable[java.util.UUID]].unbind("id", id))
    }
  
    // @LINE:13
    def createItemForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createitem")
    }
  
    // @LINE:14
    def createItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "item")
    }
  
    // @LINE:17
    def placeBid(id:java.util.UUID): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "item/" + implicitly[PathBindable[java.util.UUID]].unbind("id", id) + "/bid")
    }
  
  }

  // @LINE:10
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def myItems(status:String, page:Option[Int], pageSize:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "my/items/" + implicitly[PathBindable[String]].unbind("status", dynamicString(status)) + queryString(List(Some(implicitly[QueryStringBindable[Option[Int]]].unbind("page", page)), Some(implicitly[QueryStringBindable[Option[Int]]].unbind("pageSize", pageSize)))))
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:2
  class ReverseMain(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def createUserForm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createuser")
    }
  
    // @LINE:7
    def currentUser(userId:java.util.UUID): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "currentuser/" + implicitly[PathBindable[java.util.UUID]].unbind("userId", userId))
    }
  
    // @LINE:2
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:6
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
  }


}
