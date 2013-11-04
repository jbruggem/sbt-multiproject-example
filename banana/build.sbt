// -----------------------------
// project definition
// -----------------------------

name := "Fruits Banana"

version := "0.0.3"

organization := "jbr.fruits"

scalaVersion := "2.10.3"
// -----------------------------
// common dependencies
// -----------------------------

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0" % "test"

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

publishTo := Some(Resolver.file("file",  new File(customRepository) ))
