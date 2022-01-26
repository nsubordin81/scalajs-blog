enablePlugins(ScalaJSPlugin)

name := "Scala.js Blog"
scalaVersion := "3.0.2"

scalaJSUseMainModuleInitializer := true
libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(
  CrossVersion.for3Use2_13
)
