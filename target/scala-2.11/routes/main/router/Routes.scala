
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/kieran/Applications/Apprenticeship/Apprenticeship-Portal/conf/routes
// @DATE:Thu Jul 05 10:04:25 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_3: controllers.LoginController,
  // @LINE:7
  CandidatePortalController_4: controllers.CandidatePortalController,
  // @LINE:8
  ManagerPortalController_0: controllers.ManagerPortalController,
  // @LINE:9
  AdminPortalController_1: controllers.AdminPortalController,
  // @LINE:12
  ExamController_5: controllers.ExamController,
  // @LINE:18
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_3: controllers.LoginController,
    // @LINE:7
    CandidatePortalController_4: controllers.CandidatePortalController,
    // @LINE:8
    ManagerPortalController_0: controllers.ManagerPortalController,
    // @LINE:9
    AdminPortalController_1: controllers.AdminPortalController,
    // @LINE:12
    ExamController_5: controllers.ExamController,
    // @LINE:18
    Assets_2: controllers.Assets
  ) = this(errorHandler, LoginController_3, CandidatePortalController_4, ManagerPortalController_0, AdminPortalController_1, ExamController_5, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_3, CandidatePortalController_4, ManagerPortalController_0, AdminPortalController_1, ExamController_5, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login"""),
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
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_3.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """Portals""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_CandidatePortalController_candidate1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("candidate")))
  )
  private[this] lazy val controllers_CandidatePortalController_candidate1_invoker = createInvoker(
    CandidatePortalController_4.candidate,
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

  // @LINE:8
  private[this] lazy val controllers_ManagerPortalController_manager2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_ManagerPortalController_manager2_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_AdminPortalController_admin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminPortalController_admin3_invoker = createInvoker(
    AdminPortalController_1.admin,
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

  // @LINE:12
  private[this] lazy val controllers_ExamController_exam4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exam")))
  )
  private[this] lazy val controllers_ExamController_exam4_invoker = createInvoker(
    ExamController_5.exam,
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

  // @LINE:13
  private[this] lazy val controllers_ExamController_createExam5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create-exam")))
  )
  private[this] lazy val controllers_ExamController_createExam5_invoker = createInvoker(
    ExamController_5.createExam,
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

  // @LINE:14
  private[this] lazy val controllers_ExamController_report6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("report")))
  )
  private[this] lazy val controllers_ExamController_report6_invoker = createInvoker(
    ExamController_5.report,
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

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_LoginController_login0_route(params) =>
      call { 
        controllers_LoginController_login0_invoker.call(LoginController_3.login)
      }
  
    // @LINE:7
    case controllers_CandidatePortalController_candidate1_route(params) =>
      call { 
        controllers_CandidatePortalController_candidate1_invoker.call(CandidatePortalController_4.candidate)
      }
  
    // @LINE:8
    case controllers_ManagerPortalController_manager2_route(params) =>
      call { 
        controllers_ManagerPortalController_manager2_invoker.call(ManagerPortalController_0.manager)
      }
  
    // @LINE:9
    case controllers_AdminPortalController_admin3_route(params) =>
      call { 
        controllers_AdminPortalController_admin3_invoker.call(AdminPortalController_1.admin)
      }
  
    // @LINE:12
    case controllers_ExamController_exam4_route(params) =>
      call { 
        controllers_ExamController_exam4_invoker.call(ExamController_5.exam)
      }
  
    // @LINE:13
    case controllers_ExamController_createExam5_route(params) =>
      call { 
        controllers_ExamController_createExam5_invoker.call(ExamController_5.createExam)
      }
  
    // @LINE:14
    case controllers_ExamController_report6_route(params) =>
      call { 
        controllers_ExamController_report6_invoker.call(ExamController_5.report)
      }
  
    // @LINE:18
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
