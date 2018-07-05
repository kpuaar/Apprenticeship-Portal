
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kieran/Applications/Apprenticeship/Apprenticeship-Portal/conf/routes
// @DATE:Thu Jul 05 10:04:25 BST 2018


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
