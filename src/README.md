# Synapse Flux Page

Personal web page project, getting there the slow, roundabout way that involves a lot of 
technology I don't really know and trial and error. Yay!

## Compiling and running

This project is a scala.js project that makes use of scalajs-react and scala-js bundler to 
run npm packages and compile scala 3 code to javascript for browser based execution.

the pattern for working on this so far has been: 
1. `sbt` to open an sbt session in my terminal
2. build some react components, virtual dom and css
3. run `Compile / fastOptJS / webpack` to recompile and bundle into a main.js script
4. refresh the browser and see how I did

