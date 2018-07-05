
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
                    <li class="active"><a href="adminPortal.scala.html">Home</a></li>
                    <li><a href="exams.scala.html">Exams</a></li>
                    <li><a href="users.scala.html">Users</a></li>
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
        <pre><code>@(message: String)

@admin("Welcome to Play") """),format.raw/*76.28*/("""{"""),format.raw/*76.29*/("""

    """),format.raw/*78.5*/("""@welcome(message, style = "scala")

"""),format.raw/*80.1*/("""}"""),format.raw/*80.2*/("""</code></pre>

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
object adminPortal extends adminPortal_Scope0.adminPortal
              /*
                  -- GENERATED --
                  DATE: Thu Jul 05 09:42:12 BST 2018
                  SOURCE: /home/kieran/Applications/Apprenticeship/play-scala-starter-example-2.5.x/app/views/adminPortal.scala.html
                  HASH: 1c5ed1b33ea22cc4a13f5918bb6451cdb053aa20
                  MATRIX: 546->1|683->43|711->45|3412->2720|3441->2721|3474->2727|3537->2764|3565->2765
                  LINES: 20->1|25->1|27->3|100->76|100->76|102->78|104->80|104->80
                  -- GENERATED --
              */
          