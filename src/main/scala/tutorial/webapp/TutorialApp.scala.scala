package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document

def appendPar(targetNode: dom.Node, text: String): Unit =
  val parNode = document.createElement("p")
  parNode.textContent = text
  targetNode.appendChild(parNode)

object TutorialApp:
  def main(args: Array[String]): Unit =
    appendPar(document.body, "Hello Taylor")
