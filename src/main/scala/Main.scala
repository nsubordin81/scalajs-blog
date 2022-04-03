import org.scalajs.dom
import com.raquo.laminar.api.L.{*, given}

// val helloDiv: Div = dev("Hello, World!")

// def msg = "I was compiled by Scala 3. :)"
object ScalaJSBlog {
  def main(args: Array[String]): Unit =
    documentEvents.onDomContentLoaded.foreach { _ =>
      val appContainer = dom.document.querySelector("#appContainer")
      val rootElement = div(
        header(
          cls("SiteTitle"),
          h1("Synapse Flux"),
          p("a site about learning and the thrill of new things")
        ),
        nav(
          cls("TopNavigation"),
          button("bio"),
          button("music"),
          button("art"),
          button("programming"),
          button("the space behind")
        ),
        com.raquo.laminar.api.L.main(
          cls("Contents"),
          article(
            header(cls("ArticleHeader"), "Here We Are"),
            section(cls("IntroParagraph"), "finally I'm in main")
          )
        ),
        footer("author Taylor Bird")
      )
      render(dom.document.querySelector("#appContainer"), rootElement)

    }(unsafeWindowOwner)
}
