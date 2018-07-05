
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object managerPortal_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class managerPortal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<section id="top">
    <div class="wrapper">
        <img src="images/Capgemini-Logo.png" width="200" height="100">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">capgemini logo</a>
                    <img src="images/Capgemini-Logo.png" width="200" height="100">
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="managerPortal.scala.html">Home</a></li>
                    <li><a href="classes.scala.html">Classes</a></li>
                    <li><a href="tests.scala.html">Tests</a></li>
                    <li><a href="login.scala.html"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
                </ul>
            </div>
        </nav>
    </div>
</section>

<div id="content" class="wrapper doc">
    <article>

        <h1>Welcome Kieran Puaar</h1>

        <table style="width:100%">
            <h3>101</h3>
            <tr>
                <th>ID</th>
                <th>Student First Name</th>
                <th>Student Surname</th>
                <th>Exam Name</th>
                <th>Completed</th>
                <th>Score</th>
            </tr>
            <tr>
                <td>KP101</td>
                <td>Kieran</td>
                <td>Puaar</td>
                <td>Knowledge Module 1</td>
                <td>Yes/No</td>
                <td>15/20</td>
                <td><button class="reportButton">See Report</button></td>
            </tr>
        </table>

        <table style="width:100%">
            <h3>102</h3>
            <tr>
                <th>ID</th>
                <th>Student First Name</th>
                <th>Student Surname</th>
                <th>Exam Name</th>
                <th>Completed</th>
                <th>Score</th>
            </tr>
            <tr>
                <td>KP102</td>
                <td>Kieran</td>
                <td>Puaar</td>
                <td>Knowledge Module 2</td>
                <td>Yes/No</td>
                <td></td>
                <td><button class="reportButton">See Report</button></td>
            </tr>
        </table>

        <pre><code>@(message: String)

@main("Welcome to Play") """),format.raw/*74.27*/("""{"""),format.raw/*74.28*/("""

    """),format.raw/*76.5*/("""@welcome(message, style = "scala")

"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""</code></pre>

    </article>

</div>"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


}

/**/
object managerPortal extends managerPortal_Scope0.managerPortal
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/managerPortal.scala.html
                  HASH: 2a330791a6d51bdb5fc8f115cd3b0df62db5b48a
                  MATRIX: 550->1|687->43|715->45|3073->2377|3102->2378|3135->2384|3198->2421|3226->2422
                  LINES: 20->1|25->1|27->3|98->74|98->74|100->76|102->78|102->78
                  -- GENERATED --
              */
          