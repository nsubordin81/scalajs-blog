import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

// val helloDiv: Div = dev("Hello, World!")

// @main def hello: Unit =
//   println("Hello world!")
//   println(msg)

// def msg = "I was compiled by Scala 3. :)"
object ScalaJSBlog {
  def main(args: Array[String]): Unit =
    println("Hello world!")
    documentEvents.onDomContentLoaded.foreach { _ =>
      val appContainer = dom.document.querySelector("#appContainer")
      val appElement = div(h1("Hello world"))
      render(appContainer, appElement)
    }(unsafeWindowOwner)
}

// val nameVar = Var(initial = "world")

// val rootElement = div(
//   label("Your name: "),
//   input(
//     onMountFocus,
//     placeholder := "Enter your name here",
//     inContext { thisNode => onInput.map(_ => thisNode.ref.value) --> nameVar }
//   ),
//   span(
//     "Hello, ",
//     child.text <-- nameVar.signal.map(_.toUpperCase)
//   )
// )

// // In most other examples, containerNode will be set to this behind the scenes
// val containerNode = dom.document.querySelector("#mdoc-html-run0")

// render(containerNode, rootElement)
