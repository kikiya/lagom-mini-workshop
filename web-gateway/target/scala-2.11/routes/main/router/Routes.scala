
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiki/workspace/online-auction-scala/web-gateway/conf/routes
// @DATE:Mon Mar 06 22:18:46 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Main_1: controllers.Main,
  // @LINE:10
  ProfileController_3: controllers.ProfileController,
  // @LINE:13
  ItemController_2: controllers.ItemController,
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    Main_1: controllers.Main,
    // @LINE:10
    ProfileController_3: controllers.ProfileController,
    // @LINE:13
    ItemController_2: controllers.ItemController,
    // @LINE:19
    Assets_0: controllers.Assets
  ) = this(errorHandler, Main_1, ProfileController_3, ItemController_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Main_1, ProfileController_3, ItemController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Main.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createuser""", """controllers.Main.createUserForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Main.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """currentuser/""" + "$" + """userId<[^/]+>""", """controllers.Main.currentUser(userId:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """my/items/""" + "$" + """status<[^/]+>""", """controllers.ProfileController.myItems(status:String, page:Option[Int], pageSize:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createitem""", """controllers.ItemController.createItemForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item""", """controllers.ItemController.createItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item/""" + "$" + """id<[^/]+>""", """controllers.ItemController.getItem(id:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item/""" + "$" + """id<[^/]+>/auction""", """controllers.ItemController.startAuction(id:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item/""" + "$" + """id<[^/]+>/bid""", """controllers.ItemController.placeBid(id:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_Main_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Main_index0_invoker = createInvoker(
    Main_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_Main_createUserForm1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createuser")))
  )
  private[this] lazy val controllers_Main_createUserForm1_invoker = createInvoker(
    Main_1.createUserForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "createUserForm",
      Nil,
      "GET",
      """ User management""",
      this.prefix + """createuser"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Main_createUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Main_createUser2_invoker = createInvoker(
    Main_1.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Main_currentUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentuser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Main_currentUser3_invoker = createInvoker(
    Main_1.currentUser(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Main",
      "currentUser",
      Seq(classOf[java.util.UUID]),
      "POST",
      """""",
      this.prefix + """currentuser/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProfileController_myItems4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("my/items/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_myItems4_invoker = createInvoker(
    ProfileController_3.myItems(fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "myItems",
      Seq(classOf[String], classOf[Option[Int]], classOf[Option[Int]]),
      "GET",
      """ User profile""",
      this.prefix + """my/items/""" + "$" + """status<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ItemController_createItemForm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createitem")))
  )
  private[this] lazy val controllers_ItemController_createItemForm5_invoker = createInvoker(
    ItemController_2.createItemForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "createItemForm",
      Nil,
      "GET",
      """ Items""",
      this.prefix + """createitem"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ItemController_createItem6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item")))
  )
  private[this] lazy val controllers_ItemController_createItem6_invoker = createInvoker(
    ItemController_2.createItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "createItem",
      Nil,
      "POST",
      """""",
      this.prefix + """item"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ItemController_getItem7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ItemController_getItem7_invoker = createInvoker(
    ItemController_2.getItem(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "getItem",
      Seq(classOf[java.util.UUID]),
      "GET",
      """""",
      this.prefix + """item/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ItemController_startAuction8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item/"), DynamicPart("id", """[^/]+""",true), StaticPart("/auction")))
  )
  private[this] lazy val controllers_ItemController_startAuction8_invoker = createInvoker(
    ItemController_2.startAuction(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "startAuction",
      Seq(classOf[java.util.UUID]),
      "POST",
      """""",
      this.prefix + """item/""" + "$" + """id<[^/]+>/auction"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ItemController_placeBid9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bid")))
  )
  private[this] lazy val controllers_ItemController_placeBid9_invoker = createInvoker(
    ItemController_2.placeBid(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "placeBid",
      Seq(classOf[java.util.UUID]),
      "POST",
      """""",
      this.prefix + """item/""" + "$" + """id<[^/]+>/bid"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Main_index0_route(params) =>
      call { 
        controllers_Main_index0_invoker.call(Main_1.index)
      }
  
    // @LINE:5
    case controllers_Main_createUserForm1_route(params) =>
      call { 
        controllers_Main_createUserForm1_invoker.call(Main_1.createUserForm)
      }
  
    // @LINE:6
    case controllers_Main_createUser2_route(params) =>
      call { 
        controllers_Main_createUser2_invoker.call(Main_1.createUser)
      }
  
    // @LINE:7
    case controllers_Main_currentUser3_route(params) =>
      call(params.fromPath[java.util.UUID]("userId", None)) { (userId) =>
        controllers_Main_currentUser3_invoker.call(Main_1.currentUser(userId))
      }
  
    // @LINE:10
    case controllers_ProfileController_myItems4_route(params) =>
      call(params.fromPath[String]("status", None), params.fromQuery[Option[Int]]("page", None), params.fromQuery[Option[Int]]("pageSize", None)) { (status, page, pageSize) =>
        controllers_ProfileController_myItems4_invoker.call(ProfileController_3.myItems(status, page, pageSize))
      }
  
    // @LINE:13
    case controllers_ItemController_createItemForm5_route(params) =>
      call { 
        controllers_ItemController_createItemForm5_invoker.call(ItemController_2.createItemForm)
      }
  
    // @LINE:14
    case controllers_ItemController_createItem6_route(params) =>
      call { 
        controllers_ItemController_createItem6_invoker.call(ItemController_2.createItem)
      }
  
    // @LINE:15
    case controllers_ItemController_getItem7_route(params) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        controllers_ItemController_getItem7_invoker.call(ItemController_2.getItem(id))
      }
  
    // @LINE:16
    case controllers_ItemController_startAuction8_route(params) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        controllers_ItemController_startAuction8_invoker.call(ItemController_2.startAuction(id))
      }
  
    // @LINE:17
    case controllers_ItemController_placeBid9_route(params) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        controllers_ItemController_placeBid9_invoker.call(ItemController_2.placeBid(id))
      }
  
    // @LINE:19
    case controllers_Assets_at10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_0.at(path, file))
      }
  }
}
