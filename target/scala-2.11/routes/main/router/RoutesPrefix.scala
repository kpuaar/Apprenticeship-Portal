
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Kieran/Documents/Programming/Apprenticeship-Portal/conf/routes
// @DATE:Mon Jul 09 20:54:34 BST 2018


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
