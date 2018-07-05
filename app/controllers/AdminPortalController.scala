package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class AdminPortalController @Inject() extends Controller {

  def admin = Action {
    Ok(views.html.adminPortal(""))
  }

}
