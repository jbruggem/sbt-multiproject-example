import sbt._
import Keys._


object ProjectBuild extends Build {    
                           
    lazy val customRepo = System.getProperty("maven.repo")

    lazy val customRepository = (if( null != customRepo ) customRepo else Path.userHome.absolutePath+"/.m2/repository")
    
}
