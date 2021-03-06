import com.twitter.sbt._

seq(StandardProject.newSettings: _*)

packageDistZipName := "cf-unfiltered-sample.zip"

organization := "com.example"

name := "cf-unfiltered-sample"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.6.1",
  "net.databinder" %% "unfiltered-jetty" % "0.6.1",
  "org.clapper" %% "avsl" % "0.3.6",
  "net.databinder" %% "unfiltered-spec" % "0.6.1" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource