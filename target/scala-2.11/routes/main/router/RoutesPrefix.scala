
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kieran/Applications/Apprenticeship/Apprenticeship-Knowledge-Module-Practice-portal/conf/routes
// @DATE:Thu Jul 05 09:49:10 BST 2018


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
