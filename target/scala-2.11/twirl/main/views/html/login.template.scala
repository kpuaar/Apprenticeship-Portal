
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<section id="top">

    <div class="wrapper">
        <img src="images/Capgemini-Logo.png" width="200" height="100">
    </div>

</section>

<div id="content" class="wrapper doc">

    <article>

        <h1>Sign in</h1>

        <p>
            <input type="username" name="username" placeholder="Username">
        </p>

        <p>
            <input type="password" name="password" placeholder="Password">
        </p>

        <p>
            <button type="submit">Login</button>
        </p>

    </article>

</div>
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/login.scala.html
                  HASH: 9a30bad358cf8180ce9e9a7a5c8abe16a23b40c7
                  MATRIX: 534->1|671->43|699->45
                  LINES: 20->1|25->1|27->3
                  -- GENERATED --
              */
          