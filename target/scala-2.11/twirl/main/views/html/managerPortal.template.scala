
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
"""),_display_(/*2.2*/main("Manager Portal | Apprenticeship Portal")/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">
    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*10.52*/controllers/*10.63*/.routes.CandidatePortalController.candidate),format.raw/*10.106*/("""">
                        <img id="logo" width="400" height="90" src=""""),_display_(/*11.70*/routes/*11.76*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*11.122*/("""">
                    </a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="">Home</a></li>
                    <li><a href="">Classes</a></li>
                    <li><a href=""""),_display_(/*18.35*/controllers/*18.46*/.routes.ExamController.exam),format.raw/*18.73*/("""">Tests</a></li>
                    <li><a href=""""),_display_(/*19.35*/controllers/*19.46*/.routes.LoginController.login),format.raw/*19.75*/("""">
                        <span class="glyphicon glyphicon-log-out"></span>Log out</a></li>
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
object managerPortal extends managerPortal_Scope0.managerPortal
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/managerPortal.scala.html
                  HASH: 715df32443541c7fd941db3c81a67eb5ae2b236a
                  MATRIX: 550->1|687->43|714->45|768->91|807->93|834->94|1175->409|1195->420|1260->463|1359->535|1374->541|1442->587|1728->846|1748->857|1796->884|1874->935|1894->946|1944->975
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|34->10|34->10|34->10|35->11|35->11|35->11|42->18|42->18|42->18|43->19|43->19|43->19
                  -- GENERATED --
              */
          