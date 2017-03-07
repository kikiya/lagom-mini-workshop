
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiki/workspace/online-auction-scala/web-gateway/conf/routes
// @DATE:Mon Mar 06 22:18:46 EST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseItemController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def startAuction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.startAuction",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0) + "/auction"})
        }
      """
    )
  
    // @LINE:15
    def getItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.getItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:13
    def createItemForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.createItemForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createitem"})
        }
      """
    )
  
    // @LINE:14
    def createItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.createItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item"})
        }
      """
    )
  
    // @LINE:17
    def placeBid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.placeBid",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0) + "/bid"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def myItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.myItems",
      """
        function(status0,page1,pageSize2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my/items/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("status", encodeURIComponent(status0)) + _qS([(""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("page", page1), (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("pageSize", pageSize2)])})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseMain(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def createUserForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.createUserForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createuser"})
        }
      """
    )
  
    // @LINE:7
    def currentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.currentUser",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "currentuser/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("userId", userId0)})
        }
      """
    )
  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Main.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }


}
