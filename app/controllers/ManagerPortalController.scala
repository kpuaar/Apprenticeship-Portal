package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class ManagerPortalController @Inject() extends Controller {

  def manager = Action {
    Ok(views.html.managerPortal(""))
  }

}
