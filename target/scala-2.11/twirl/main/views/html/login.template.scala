
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
"""),_display_(/*2.2*/main("Login | Apprenticeship Portal")/*2.39*/ {_display_(Seq[Any](format.raw/*2.41*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

    <section id="top">
        <div class="wrapper">
            <img id="logo" width="400" height="90" src=""""),_display_(/*7.58*/routes/*7.64*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*7.110*/("""">
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
""")))}))
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
                  DATE: Mon Jul 09 21:14:27 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/login.scala.html
                  HASH: 23c0f5a191b1b3619bfd3a5d7b15e699500e46c7
                  MATRIX: 534->1|671->43|698->45|743->82|782->84|813->89|1037->288|1051->294|1118->340
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|31->7|31->7|31->7
                  -- GENERATED --
              */
          