
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exam_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class exam extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""
"""),_display_(/*2.2*/main("Knowledge Module 1 | Apprenticeship Portal")/*2.52*/ {_display_(Seq[Any](format.raw/*2.54*/("""

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
                    <li class="active"><a href=""""),_display_(/*18.50*/controllers/*18.61*/.routes.ExamController.exam),format.raw/*18.88*/("""">Exams</a></li>
                    <li><a href=""""),_display_(/*19.35*/controllers/*19.46*/.routes.LoginController.login),format.raw/*19.75*/("""">
                        <span class="glyphicon glyphicon-log-out"></span>Log out</a></li>
                </ul>
            </div>
        </nav>
    </div>
</section>

<div id="content" class="wrapper doc">
    <article>

        <h1>Knowledge Module 1</h1>

        <h2>Question 1</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 2</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 3</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 4</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
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
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 6</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 7</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 8</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 9</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 10</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
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
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 12</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 13</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 14</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 15</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 16</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
            <input type="radio" name="answer" value="answer2">Answer 2<br>
            <input type="radio" name="answer" value="answer3">Answer 3<br>
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 17</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
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
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <h2>Question 19</h2>
        <h3>This is the question</h3>
        <p>Options</p>
        <form>
            <input type="radio" name="answer" value="answer1">Answer 1<br>
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
            <input type="radio" name="answer" value="answer4">Answer 4<br>
        </form>

        <button>Submit</button>


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
object exam extends exam_Scope0.exam
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/exam.scala.html
                  HASH: 969a7d3386daabaf35c78027b0695c9d9aa3e465
                  MATRIX: 532->1|669->43|696->45|754->95|793->97|821->99|1162->414|1182->425|1247->468|1346->540|1361->546|1429->592|1599->735|1619->746|1683->789|1775->854|1795->865|1843->892|1921->943|1941->954|1991->983
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|35->11|35->11|35->11|36->12|36->12|36->12|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19
                  -- GENERATED --
              */
          