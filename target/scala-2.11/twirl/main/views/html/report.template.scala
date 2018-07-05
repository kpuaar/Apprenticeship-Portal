
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object report_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class report extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

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
                    <li><a href="managerPortal.scala.html">Home</a></li>
                    <li><a href="classes.scala.html">Classes</a></li>
                    <li class="active"><a href="tests.scala.html">Tests</a></li>
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
                <th>Student First Name</th>
                <th>Student Surname</th>
                <th>Exam Name</th>
                <th>Score</th>
            </tr>
            <tr>
                <td>KP101</td>
                <td>Kieran</td>
                <td>Puaar</td>
                <td>Knowledge Module 1</td>
                <td>17/20</td>
            </tr>
        </table>

        <h2>Question 1</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2" checked>Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 2</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3" checked>Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 3</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 4</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 5</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4" checked>Answer 4<br>
        </form>

        <h2>Question 6</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1" checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 7</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2" checked>Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 8</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2" checked>Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 9</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3" checked>Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 10</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1" checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 11</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4" checked>Answer 4<br>
        </form>

        <h2>Question 12</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3" checked>Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 13</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 14</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2" checked>Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 15</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3" checked>Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 16</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2" checked>Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 17</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 18</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4" checked>Answer 4<br>
        </form>

        <h2>Question 19</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1"checked>Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 20</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4"checked>Answer 4<br>
        </form>

        <button>Return to Homepage</button>

        <pre><code>@(message: String)

@main("Welcome to Play") """),format.raw/*249.27*/("""{"""),format.raw/*249.28*/("""

    """),format.raw/*251.5*/("""@welcome(message, style = "scala")

"""),format.raw/*253.1*/("""}"""),format.raw/*253.2*/("""</code></pre>

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
object report extends report_Scope0.report
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/report.scala.html
                  HASH: 44016bf1f56869b4288ccdd825a662733f6b4e00
                  MATRIX: 536->1|673->43|701->45|10853->10170|10883->10171|10917->10177|10981->10214|11010->10215
                  LINES: 20->1|25->1|27->3|273->249|273->249|275->251|277->253|277->253
                  -- GENERATED --
              */
          