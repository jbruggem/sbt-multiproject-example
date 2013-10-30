// -----------------------------
// project definition
// -----------------------------

name := "Fruits"

version := "0.0.3"

organization := "fruits.jbr"

scalaVersion := "2.9.3"

// -----------------------------
// Add your stuff here
// -----------------------------


// .... 


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

publishTo := Some(Resolver.file("file",  new File(customRepository) ))
