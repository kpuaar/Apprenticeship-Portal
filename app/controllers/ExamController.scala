package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class ExamController @Inject() extends Controller {

  def exam = Action {
    Ok(views.html.exam(""))
  }

  def createExam = Action {
    Ok(views.html.createExam(""))
  }

  def report = Action {
    Ok(views.html.report(""))
  }

}
