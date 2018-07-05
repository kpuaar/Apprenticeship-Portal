
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">
    <div class="wrapper">
        <img id="logo" width="400" height="90" src=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned(" images/Capgemini-Logo.png")),format.raw/*7.107*/("""">
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
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/welcome.scala.html
                  HASH: e6d1b3e7928c5ffa12b3ae40b549954d797b76af
                  MATRIX: 538->1|675->43|703->45|915->232|929->238|997->285
                  LINES: 20->1|25->1|27->3|31->7|31->7|31->7
                  -- GENERATED --
              */
          