
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/saran/spark-mllib-scala-play/conf/routes
// @DATE:Tue Nov 08 17:03:43 EST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
