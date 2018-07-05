
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createExam_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createExam extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<section id="top">
    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">capgemini logo</a>
                    <img src="images/Capgemini-Logo.png" width="200" height="100">
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Home</a></li>
                    <li class="active"><a href="exams.scala.html">Exams</a></li>
                    <li><a href="users.scala.html">Users</a></li>
                    <li><a href="login.scala.html"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
                </ul>
            </div>
        </nav>
    </div>
</section>

<div id="content" class="wrapper doc">
    <article>

        <table style="width:100%">
            <tr>
                <th>ID</th>
                <th>Exam Name</th>
                <th>Pass mark</th>
            </tr>
            <tr>
                <td></td>
                <td><textarea></textarea></td>
                <td><textarea></textarea></td>
            </tr>
        </table>

        <h2>Question 1</h2>
        <h3><textarea></textarea></h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"><textarea></textarea><br>
            <input type="radio" name="answer" value="answer2"><textarea></textarea><br>
            <input type="radio" name="answer" value="answer3"><textarea></textarea><br>
            <input type="radio" name="answer" value="answer4"><textarea></textarea><br>
        </form>

        <button>Add Question</button>

        <button>Save</button>
        <button>Publish</button>

        <pre><code>@(message: String)

@main("Welcome to Play") """),format.raw/*56.27*/("""{"""),format.raw/*56.28*/("""

    """),format.raw/*58.5*/("""@welcome(message, style = "scala")

"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""</code></pre>

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
object createExam extends createExam_Scope0.createExam
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/createExam.scala.html
                  HASH: 6909668981762605c14575e317cdd8895934ff73
                  MATRIX: 544->1|681->43|709->45|2578->1888|2607->1889|2640->1895|2703->1932|2731->1933
                  LINES: 20->1|25->1|27->3|80->56|80->56|82->58|84->60|84->60
                  -- GENERATED --
              */
          