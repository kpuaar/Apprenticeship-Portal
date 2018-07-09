
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
"""),_display_(/*2.2*/main("Create Exam | Apprenticeship Portal")/*2.45*/ {_display_(Seq[Any](format.raw/*2.47*/("""

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
                    <a href=""""),_display_(/*15.31*/controllers/*15.42*/.routes.AdminPortalController.admin),format.raw/*15.77*/("""">Home</a></li>
                    <li class="active"><a href=""""),_display_(/*16.50*/controllers/*16.61*/.routes.ExamController.exam),format.raw/*16.88*/("""">Tests</a></li>
                    <li><a href="">Users</a></li>
                    <li><a href=""""),_display_(/*18.35*/controllers/*18.46*/.routes.LoginController.login),format.raw/*18.75*/("""">
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
object createExam extends createExam_Scope0.createExam
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/createExam.scala.html
                  HASH: 7aa45a007b3c94167a2924027b7c9022540ee8f3
                  MATRIX: 544->1|681->43|708->45|759->88|798->90|826->92|1167->407|1187->418|1252->461|1351->533|1366->539|1434->585|1542->666|1562->677|1618->712|1710->777|1730->788|1778->815|1906->916|1926->927|1976->956
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|35->11|35->11|35->11|36->12|36->12|36->12|39->15|39->15|39->15|40->16|40->16|40->16|42->18|42->18|42->18
                  -- GENERATED --
              */
          