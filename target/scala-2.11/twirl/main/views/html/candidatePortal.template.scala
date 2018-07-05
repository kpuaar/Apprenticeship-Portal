
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object candidatePortal_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class candidatePortal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">

    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">capgemini logo</a>
                    <img id="logo" width="400" height="90" src=""""),_display_(/*12.66*/routes/*12.72*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*12.118*/("""">
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="candidatePortal.scala.html">Home</a></li>
                    <li><a href="tests.scala.html">Tests</a></li>
                    <li><a href=""""),_display_(/*18.35*/controllers/*18.46*/.routes.LoginController.login),format.raw/*18.75*/(""""><span class="glyphicon glyphicon-log-out"></span>Log out</a></li>
                </ul>
            </div>
        </nav>

    </div>

</section>

<div id="content" class="wrapper doc">
    <article>

        <h1>Welcome Kieran Puaar</h1>


        <table style="width:100%">
            <tr>
                <th>ID</th>
                <th>Exam Name</th>
                <th>Due Date</th>
                <th>Completion Date</th>
                <th>Score</th>
            </tr>
            <tr>
                <td>KM101</td>
                <td>Knowledge Module 1</td>
                <td>1/6/2018</td>
                <td>5/6/2018</td>
                <td>15/20</td>
                <td><button class="examButton">See Report</button></td>
            </tr>
            <tr>
                <td>KM102</td>
                <td>Knowledge Module 2</td>
                <td>6/6/2018</td>
                <td></td>
                <td></td>
                <td><button class="examButton">Take the Exam</button></td>
            </tr>
            <tr>
                <td>KM103</td>
                <td>Knowledge Module 3</td>
                <td>2/7/2018</td>
                <td></td>
                <td></td>
                <td><button class="examButton">Take the Exam</button></td>
            </tr>
        </table>


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
object candidatePortal extends candidatePortal_Scope0.candidatePortal
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/candidatePortal.scala.html
                  HASH: 90c9d62cf6a626c0897ce840dc5e858232345aab
                  MATRIX: 554->1|691->43|719->45|1147->447|1162->453|1230->499|1531->773|1551->784|1601->813
                  LINES: 20->1|25->1|27->3|36->12|36->12|36->12|42->18|42->18|42->18
                  -- GENERATED --
              */
          