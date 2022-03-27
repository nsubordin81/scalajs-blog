// this is for scalajs itself
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.9.0")

// bundler is to provide me with react and other npm dependencies as web browser executable scripts
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0")

// this is for jsdom to interact with the dom. I have been having issues with require() not defined errors.
// libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.0.0"
