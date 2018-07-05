package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class CandidatePortalController @Inject() extends Controller {

  def candidate = Action {
    Ok(views.html.candidatePortal(""))
  }

}
