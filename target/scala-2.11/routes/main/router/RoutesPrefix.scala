
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/jintao/CTS2/CTS/conf/routes
// @DATE:Sun Dec 13 17:02:48 EST 2015


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
