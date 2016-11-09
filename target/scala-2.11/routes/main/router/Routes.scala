
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saran/spark-mllib-scala-play/conf/routes
// @DATE:Tue Nov 08 17:03:43 EST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """@controllers.Application@.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """classify""", """@controllers.Application@.classify(keyword:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """eventSocket""", """@controllers.Application@.eventSocket"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """statisticsSocket""", """@controllers.Application@.statisticsSocket"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jsRoutes""", """@controllers.Application@.jsRoutes"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public-assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""", """@controllers.Twitter@.authenticate"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticated""", """@controllers.Twitter@.authenticated"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """@controllers.Twitter@.logout"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_classify1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classify")))
  )
  private[this] lazy val controllers_Application_classify1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).classify(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "classify",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """classify"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_eventSocket2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventSocket")))
  )
  private[this] lazy val controllers_Application_eventSocket2_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).eventSocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "eventSocket",
      Nil,
      "GET",
      """""",
      this.prefix + """eventSocket"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_statisticsSocket3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statisticsSocket")))
  )
  private[this] lazy val controllers_Application_statisticsSocket3_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).statisticsSocket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "statisticsSocket",
      Nil,
      "GET",
      """""",
      this.prefix + """statisticsSocket"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_jsRoutes4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jsRoutes")))
  )
  private[this] lazy val controllers_Application_jsRoutes4_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).jsRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """ Javascript Routes""",
      this.prefix + """jsRoutes"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_at5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public-assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Assets""",
      this.prefix + """public-assets/$file<.+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Twitter_authenticate7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Twitter_authenticate7_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Twitter",
      "authenticate",
      Nil,
      "GET",
      """ Twitter auth""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Twitter_authenticated8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticated")))
  )
  private[this] lazy val controllers_Twitter_authenticated8_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).authenticated,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Twitter",
      "authenticated",
      Nil,
      "GET",
      """""",
      this.prefix + """authenticated"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Twitter_logout9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Twitter_logout9_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Twitter",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).index)
      }
  
    // @LINE:8
    case controllers_Application_classify1_route(params) =>
      call(params.fromQuery[String]("keyword", None)) { (keyword) =>
        controllers_Application_classify1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).classify(keyword))
      }
  
    // @LINE:10
    case controllers_Application_eventSocket2_route(params) =>
      call { 
        controllers_Application_eventSocket2_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).eventSocket)
      }
  
    // @LINE:11
    case controllers_Application_statisticsSocket3_route(params) =>
      call { 
        controllers_Application_statisticsSocket3_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).statisticsSocket)
      }
  
    // @LINE:14
    case controllers_Application_jsRoutes4_route(params) =>
      call { 
        controllers_Application_jsRoutes4_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).jsRoutes)
      }
  
    // @LINE:17
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(controllers.Assets.at(path, file))
      }
  
    // @LINE:18
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:21
    case controllers_Twitter_authenticate7_route(params) =>
      call { 
        controllers_Twitter_authenticate7_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).authenticate)
      }
  
    // @LINE:22
    case controllers_Twitter_authenticated8_route(params) =>
      call { 
        controllers_Twitter_authenticated8_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).authenticated)
      }
  
    // @LINE:23
    case controllers_Twitter_logout9_route(params) =>
      call { 
        controllers_Twitter_logout9_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Twitter]).logout)
      }
  }
}