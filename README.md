


SBT testing project
===================

Important
--------

- multi-project sbt
- junit
- capable of publishing to a local maven repo with an overridable location
- capable of publishing to an s3 repository
- sbt dependencies
- maven dependencies


Nice to have
------------
- generating a POM for maven systems
- shareable sbt config for some elements?


Tips & tricks
-------------

### Files
- `ROOT/project/Build.scala`: multi-project definition. This file is loaded with the root project, before build.sbt is loaded. Internal dependencies (i.e. between subprojects of this multi-project setup) should be defined there, and *not* in one of the build.sbt
- `build.sbt`: each project has one. Put stuff unrelated to multi-project-ness

### Executing commands

By default, will run on root and recursively run on child projects
- run on root project: `sbt run`
- run on specific project: `sbt apple/run`


