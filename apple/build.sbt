// -----------------------------
// project definition
// -----------------------------

name := "Apple"

version := "0.0.3"

organization := "jbr.fruits"

scalaVersion := "2.9.3"

// -----------------------------
// Add your stuff here
// -----------------------------


//libraryDependencies += "io.portico" %% "fruitLib" % "0.0.3"


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
