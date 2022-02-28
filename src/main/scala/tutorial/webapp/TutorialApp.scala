package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

def appendPar(targetNode: dom.Node, text: String): Unit =
  val parNode = document.createElement("p")
  parNode.textContent = text
  targetNode.appendChild(parNode)

def addClickedMessage(): Unit =
  appendPar(document.body, "You clicked the button!")

object TutorialApp:
  def main(args: Array[String]): Unit =
    document.addEventListener("DOMContentLoaded", (e: dom.Event) => setupUI())

  def toButton(label: String) = 
    val button = document.createElement("button")
    button.textContent = label
    button.addEventListener("click", (e: dom.MouseEvent) => addClickedMessage())
    document.body.appendChild(button)
    
  def setupUI(): Unit =
    appendPar(document.body, "SynapseFlux")
    val menuItems = List("Bio", "Projects and Talks", "Blog", "Art", "Behind The Wall")
    for item <- menuItems yield
       toButton(item)


    // val button = document.createElement("button")
    // button.textContent = "Click me!"
    // button.addEventListener(
    //   "click",
    //   (e: dom.MouseEvent) => addClickedMessage()
    // )
    // document.body.appendChild(button)
    // appendPar(document.body, "Hello Taylor")
