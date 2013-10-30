import sbt._
import Keys._


object FruitBuild extends Build {    
    
    lazy val root = Project(id = "Fruits",
                            base = file(".")) aggregate(fruitLib, 
                            apple, banana) dependsOn(apple, banana)

    lazy val fruitLib = Project(id = "fruitLib",
                           base = file("fruitLib")) 
                           
    lazy val apple = Project(id = "apple",
                           base = file("apple")) dependsOn(fruitLib)

    lazy val banana = Project(id = "banana",
                           base = file("banana")) dependsOn(fruitLib)
                           
    lazy val customRepo = System.getProperty("maven.repo")

    lazy val customRepository = (if( null != customRepo ) customRepo else Path.userHome.absolutePath+"/.m2/repository")
    
    publishMavenStyle := true
}
