// -----------------------------
// project definition
// -----------------------------

name := "Fruits Apple"

version := "0.0.3"

organization := "jbr.fruits"

scalaVersion := "2.9.3"

// -----------------------------
// common dependencies
// -----------------------------

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

//libraryDependencies += "junit" % "junit" % "4.10" % "test"


// -----------------------------
// Add your stuff here
// -----------------------------



// -----------------------------
// resolvers (source repositories)
// -----------------------------

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Local Maven Repository" at "file:///"+Path.userHome+"/.m2/repository"
)

// -----------------------------
// Publishing rules
// -----------------------------

publishMavenStyle := true

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
