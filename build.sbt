name := "Scala.js Blog"
scalaVersion := "3.0.2"

// this is core scalajs stuff.
enablePlugins(ScalaJSPlugin)

// --------------------=LAMINAR=--------------------
libraryDependencies += "com.raquo" %%% "laminar" % "0.13.1" // Requires Scala.js >= 1.5.0
//if you want to change airstream versions to be more recent without upgrading laminar
// libraryDependencies += "com.raquo" %%% "airstream" % "<version>"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"

/* !!!! everything below this line represents failed attampts to get scalajs-react
to work with scala 3 and scalajs-bundler. I don't know why but I was getting
errors about require() not working even through I was bundling, I didn't think
I should need to add requirejs to the browser to make the code work because
scalajs-bundler was supposed to take care of it. I followed the setup docs for
everythign and was considering using snowpack instead but I ended up just changing
to a different lib, react not being a hard requirement for this project.
 */

//---------------------SCALAJS REACT-----------------------
// tell build.sbt our application has a main method
// for scalajs-react to be added to the build we will use the bundler plugin
// we do get the react and react-dom dependencies from npm
// enablePlugins(ScalaJSBundlerPlugin)

// violating the default in the below because I am manually calling my main method according to this
// scalajs-react example I'm following
// scalaJSUseMainModuleInitializer := true

/* note, if you get an error while doing fast linking, use export NODE_OPTIONS=--openssl-legacy-provider
 this is related to what seems like a webpack issue that started ~3/24/2022 and might be resolved by the time you
 read this again.*/

// we are going to try and use scalajs-react
// libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "2.0.1"
// Compile / npmDependencies ++= Seq("react" -> "17.0.2", "react-dom" -> "17.0.2")

//-----------------------other from the scalajs tutorial-------------------
/* uncomment these when the react stuff works */
// libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"

// jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
// libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.11" % "test"
// testFrameworks += new TestFramework("utest.runner.Framework")
