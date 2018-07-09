package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class LoginController @Inject() extends Controller {

  def login = Action {
    Ok(views.html.login(""))
  }

}
