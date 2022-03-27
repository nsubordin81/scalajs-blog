val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs-blog",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.raquo" %%% "laminar" % "0.13.1"
  )
