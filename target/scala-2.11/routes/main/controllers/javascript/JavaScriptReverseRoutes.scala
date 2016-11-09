
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saran/spark-mllib-scala-play/conf/routes
// @DATE:Tue Nov 08 17:03:43 EST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:21
  class ReverseTwitter(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Twitter.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:22
    def authenticated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Twitter.authenticated",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticated"})
        }
      """
    )
  
    // @LINE:21
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Twitter.authenticate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public-assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def classify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.classify",
      """
        function(keyword) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classify" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("keyword", keyword)])})
        }
      """
    )
  
    // @LINE:14
    def jsRoutes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsRoutes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jsRoutes"})
        }
      """
    )
  
    // @LINE:11
    def statisticsSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.statisticsSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statisticsSocket"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def eventSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.eventSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eventSocket"})
        }
      """
    )
  
  }


}