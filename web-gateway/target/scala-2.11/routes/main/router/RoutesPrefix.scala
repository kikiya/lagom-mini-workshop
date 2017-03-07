
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kiki/workspace/online-auction-scala/web-gateway/conf/routes
// @DATE:Mon Mar 06 22:18:46 EST 2017


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
