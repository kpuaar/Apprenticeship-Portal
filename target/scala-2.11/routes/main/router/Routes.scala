
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kieran/Applications/Apprenticeship/Apprenticeship-Knowledge-Module-Practice-portal/conf/routes
// @DATE:Thu Jul 05 09:49:10 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  LoginController_6: controllers.LoginController,
  // @LINE:14
  CandidatePortalController_7: controllers.CandidatePortalController,
  // @LINE:15
  ManagerPortalController_0: controllers.ManagerPortalController,
  // @LINE:16
  AdminPortalController_3: controllers.AdminPortalController,
  // @LINE:19
  ExamController_8: controllers.ExamController,
  // @LINE:25
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    LoginController_6: controllers.LoginController,
    // @LINE:14
    CandidatePortalController_7: controllers.CandidatePortalController,
    // @LINE:15
    ManagerPortalController_0: controllers.ManagerPortalController,
    // @LINE:16
    AdminPortalController_3: controllers.AdminPortalController,
    // @LINE:19
    ExamController_8: controllers.ExamController,
    // @LINE:25
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_4, LoginController_6, CandidatePortalController_7, ManagerPortalController_0, AdminPortalController_3, ExamController_8, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_4, LoginController_6, CandidatePortalController_7, ManagerPortalController_0, AdminPortalController_3, ExamController_8, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """candidate""", """controllers.CandidatePortalController.candidate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.ManagerPortalController.manager"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminPortalController.admin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exam""", """controllers.ExamController.exam"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create-exam""", """controllers.ExamController.createExam"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """report""", """controllers.ExamController.report"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    LoginController_6.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """Portals""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CandidatePortalController_candidate4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("candidate")))
  )
  private[this] lazy val controllers_CandidatePortalController_candidate4_invoker = createInvoker(
    CandidatePortalController_7.candidate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CandidatePortalController",
      "candidate",
      Nil,
      "GET",
      """""",
      this.prefix + """candidate"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ManagerPortalController_manager5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_ManagerPortalController_manager5_invoker = createInvoker(
    ManagerPortalController_0.manager,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ManagerPortalController",
      "manager",
      Nil,
      "GET",
      """""",
      this.prefix + """manager"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AdminPortalController_admin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminPortalController_admin6_invoker = createInvoker(
    AdminPortalController_3.admin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminPortalController",
      "admin",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ExamController_exam7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exam")))
  )
  private[this] lazy val controllers_ExamController_exam7_invoker = createInvoker(
    ExamController_8.exam,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExamController",
      "exam",
      Nil,
      "GET",
      """Exam""",
      this.prefix + """exam"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ExamController_createExam8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create-exam")))
  )
  private[this] lazy val controllers_ExamController_createExam8_invoker = createInvoker(
    ExamController_8.createExam,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExamController",
      "createExam",
      Nil,
      "GET",
      """""",
      this.prefix + """create-exam"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ExamController_report9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("report")))
  )
  private[this] lazy val controllers_ExamController_report9_invoker = createInvoker(
    ExamController_8.report,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExamController",
      "report",
      Nil,
      "GET",
      """""",
      this.prefix + """report"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:13
    case controllers_LoginController_login3_route(params) =>
      call { 
        controllers_LoginController_login3_invoker.call(LoginController_6.login)
      }
  
    // @LINE:14
    case controllers_CandidatePortalController_candidate4_route(params) =>
      call { 
        controllers_CandidatePortalController_candidate4_invoker.call(CandidatePortalController_7.candidate)
      }
  
    // @LINE:15
    case controllers_ManagerPortalController_manager5_route(params) =>
      call { 
        controllers_ManagerPortalController_manager5_invoker.call(ManagerPortalController_0.manager)
      }
  
    // @LINE:16
    case controllers_AdminPortalController_admin6_route(params) =>
      call { 
        controllers_AdminPortalController_admin6_invoker.call(AdminPortalController_3.admin)
      }
  
    // @LINE:19
    case controllers_ExamController_exam7_route(params) =>
      call { 
        controllers_ExamController_exam7_invoker.call(ExamController_8.exam)
      }
  
    // @LINE:20
    case controllers_ExamController_createExam8_route(params) =>
      call { 
        controllers_ExamController_createExam8_invoker.call(ExamController_8.createExam)
      }
  
    // @LINE:21
    case controllers_ExamController_report9_route(params) =>
      call { 
        controllers_ExamController_report9_invoker.call(ExamController_8.report)
      }
  
    // @LINE:25
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
