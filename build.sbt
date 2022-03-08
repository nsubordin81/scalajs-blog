name := "Scala.js Blog"
scalaVersion := "3.0.2"

enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.0.1"

Compile / npmDependencies ++= Seq("react" -> "17.0.2", "react-dom" -> "17.0.2")

scalaJSUseMainModuleInitializer := true
libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(
  CrossVersion.for3Use2_13
)

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.11" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.0.1"
