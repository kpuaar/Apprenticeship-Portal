package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import services.Counter

/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class creates an
 * `Action` that shows an incrementing count to users. The [[Counter]]
 * object is injected by the Guice dependency injection system.
 */
@Singleton
class CountController @Inject() (counter: Counter) extends Controller {

  def count = Action { Ok(counter.nextCount().toString) }

}
