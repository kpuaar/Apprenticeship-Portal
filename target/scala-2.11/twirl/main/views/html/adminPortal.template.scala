
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminPortal_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class adminPortal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""
"""),_display_(/*2.2*/main("Admin Portal | Apprenticeship Portal")/*2.46*/ {_display_(Seq[Any](format.raw/*2.48*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href="/@documentation/resources/style/main.css">

<section id="top">
    <div class="wrapper">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href=""""),_display_(/*11.52*/controllers/*11.63*/.routes.AdminPortalController.admin),format.raw/*11.98*/("""">
                        <img id="logo" width="400" height="90" src=""""),_display_(/*12.70*/routes/*12.76*/.Assets.versioned("images/Capgemini-Logo.png")),format.raw/*12.122*/("""">
                    </a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href=""""),_display_(/*17.50*/controllers/*17.61*/.routes.AdminPortalController.admin),format.raw/*17.96*/("""">Home</a></li>
                    <li><a href=""""),_display_(/*18.35*/controllers/*18.46*/.routes.ExamController.exam),format.raw/*18.73*/("""">Tests</a></li>
                    <li><a href="">Users</a></li>
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
            <h3>101</h3>
            <tr>
                <th>ID</th>
                <th>Exam Name</th>
                <th>Manager</th>
            </tr>
            <tr>
                <td>KM101</td>
                <td>Knowledge Module 1</td>
                <td>Kieran Puaar</td>
                <td><button class="assignButton">Assign</button></td>
                <td><button class="editButton">Edit</button></td>
                <td><button class="removeButton">Remove</button></td>
            </tr>
            <tr>
                <td>KM1012</td>
                <td>Knowledge Module 1</td>
                <td>John Smith</td>
                <td><button class="assignButton">Assign</button></td>
                <td><button class="editButton">Edit</button></td>
                <td><button class="removeButton">Remove</button></td>
            </tr>
            <td><button class="addExamButton">Add Exam</button></td>
        </table>

        <table style="width:100%">
            <h3>102</h3>
            <tr>
                <th>ID</th>
                <th>Exam Name</th>
                <th>Manager</th>
            </tr>
            <tr>
                <td>KM101</td>
                <td>Knowledge Module 2</td>
                <td>Kieran Puaar</td>
                <td><button class="assignButton">Assign</button></td>
                <td><button class="editButton">Edit</button></td>
                <td><button class="removeButton">Remove</button></td>
            </tr>
            <td><button class="addExamButton">Add Exam</button></td>
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
object adminPortal extends adminPortal_Scope0.adminPortal
              /*
                  -- GENERATED --
                  DATE: Mon Jul 09 21:15:23 BST 2018
                  SOURCE: /Users/Kieran/Documents/Programming/Apprenticeship-Portal/app/views/adminPortal.scala.html
                  HASH: 594c646534a2a225952a5e63434aff8a3fa6cbc7
                  MATRIX: 546->1|683->43|710->45|762->89|801->91|829->93|1170->408|1190->419|1246->454|1345->526|1360->532|1428->578|1613->736|1633->747|1689->782|1766->832|1786->843|1834->870|1962->971|1982->982|2032->1011
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|35->11|35->11|35->11|36->12|36->12|36->12|41->17|41->17|41->17|42->18|42->18|42->18|44->20|44->20|44->20
                  -- GENERATED --
              */
          