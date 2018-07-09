
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
"""),_display_(/*2.2*/main("Report | Apprenticeship Portal")/*2.40*/ {_display_(Seq[Any](format.raw/*2.42*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">
    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*11.52*/controllers/*11.63*/.routes.CandidatePortalController.candidate),format.raw/*11.106*/("""">
                        <img id="logo" width="400" height="90" src=""""),_display_(/*12.70*/routes/*12.76*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*12.122*/("""">
                    </a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href=""""),_display_(/*17.35*/controllers/*17.46*/.routes.CandidatePortalController.candidate),format.raw/*17.89*/("""">Home</a></li>
                    <li><a href="">Classes</a></li>
                    <li class="active"><a href=""""),_display_(/*19.50*/controllers/*19.61*/.routes.ExamController.exam),format.raw/*19.88*/("""">Tests</a></li>
                    <li><a href=""""),_display_(/*20.35*/controllers/*20.46*/.routes.LoginController.login),format.raw/*20.75*/("""">
                        <span class="glyphicon glyphicon-log-out"></span>Log out</a></li>
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
object report extends report_Scope0.report
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/report.scala.html
                  HASH: 362b5fedd819454d94033bd421b409e3682606e0
                  MATRIX: 536->1|673->43|700->45|746->83|785->85|813->87|1154->402|1174->413|1239->456|1338->528|1353->534|1421->580|1591->723|1611->734|1675->777|1819->894|1839->905|1887->932|1965->983|1985->994|2035->1023
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|35->11|35->11|35->11|36->12|36->12|36->12|41->17|41->17|41->17|43->19|43->19|43->19|44->20|44->20|44->20
                  -- GENERATED --
              */
          