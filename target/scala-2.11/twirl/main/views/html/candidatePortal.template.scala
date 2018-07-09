
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
"""),_display_(/*2.2*/main("Candidate Portal | Apprenticeship Portal")/*2.50*/ {_display_(Seq[Any](format.raw/*2.52*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">

    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*12.52*/controllers/*12.63*/.routes.CandidatePortalController.candidate),format.raw/*12.106*/("""">
                        <img id="logo" width="400" height="90" src=""""),_display_(/*13.70*/routes/*13.76*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*13.122*/("""">
                    </a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href=""""),_display_(/*18.50*/controllers/*18.61*/.routes.CandidatePortalController.candidate),format.raw/*18.104*/("""">Home</a></li>
                    <li><a href=""""),_display_(/*19.35*/controllers/*19.46*/.routes.ExamController.exam),format.raw/*19.73*/("""">Tests</a></li>
                    <li><a href=""""),_display_(/*20.35*/controllers/*20.46*/.routes.LoginController.login),format.raw/*20.75*/("""">
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
                <td>
                    <button class="examButton">
                        <a href=""""),_display_(/*52.35*/controllers/*52.46*/.routes.ExamController.report),format.raw/*52.75*/("""">See Report</a>
                    </button>
                </td>
            </tr>
            <tr>
                <td>KM102</td>
                <td>Knowledge Module 2</td>
                <td>6/6/2018</td>
                <td></td>
                <td></td>
                <td>
                    <button class="examButton">
                        <a href=""""),_display_(/*64.35*/controllers/*64.46*/.routes.ExamController.exam),format.raw/*64.73*/("""">Take Exam</a>
                    </button>
                </td>
            </tr>
            <tr>
                <td>KM103</td>
                <td>Knowledge Module 3</td>
                <td>2/7/2018</td>
                <td></td>
                <td></td>
                <td>
                    <button class="examButton">
                        <a href=""""),_display_(/*76.35*/controllers/*76.46*/.routes.ExamController.exam),format.raw/*76.73*/("""">Take Exam</a>
                    </button>
                </td>
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
object candidatePortal extends candidatePortal_Scope0.candidatePortal
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/candidatePortal.scala.html
                  HASH: acd62d6b4b1ab847ca5d211c81c65c52c70e664c
                  MATRIX: 554->1|691->43|718->45|774->93|813->95|841->97|1183->413|1203->424|1268->467|1367->539|1382->545|1450->591|1635->749|1655->760|1720->803|1797->853|1817->864|1865->891|1943->942|1963->953|2013->982|2841->1783|2861->1794|2911->1823|3306->2191|3326->2202|3374->2229|3768->2596|3788->2607|3836->2634
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|36->12|36->12|36->12|37->13|37->13|37->13|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|76->52|76->52|76->52|88->64|88->64|88->64|100->76|100->76|100->76
                  -- GENERATED --
              */
          