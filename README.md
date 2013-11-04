


SBT testing project
===================

Working
-------
- `sbt test` on all projects
- `sbt PROJ/run` on projects
- dependencies: banana and apple depend on fruitLib (ok for: assembly, run, eclipse)

Important
--------

- ✔ multi-project sbt
- ✔ multi-project works with eclipse (internal project dependencies added in path)
- ✔ unit testing
- ✔ unit test eclipse integration (use http://www.scalatest.org/user_guide/using_scalatest_with_eclipse )
- ✔ capable of publishing to a local maven repo
- override location of local maven repo
- capable of publishing to an s3 repository
- ✔ ivy dependencies
- ✔ maven dependencies
- ✔ assembly


Nice to have
------------
- generating a POM for maven systems
- shareable sbt config for some elements?


Tips & tricks
-------------

### Files

- `ROOT/project/Build.scala`: multi-project definition. This file is loaded with the root project, before build.sbt is loaded. Internal dependencies (i.e. between subprojects of this multi-project setup) should be defined there, and *not* in one of the build.sbt
- `build.sbt`: each project has one. Put stuff unrelated to multi-project-ness
- `assembly.sbt`: assembly settings

### Executing commands

By default, will run on root and recursively run on child projects
- run on root project: `sbt run`
- run on specific project: `sbt apple/run`

### Maven install

- use `sbt publish` (configured in build.sbt) 
- can specify a custom location for the maven repo: `-Dmaven.repo`. Example:

 `sbt -Dmaven.repo=/home/bob/tmp/mavenRepo publish`

