name := "backlog-cli"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {

  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  val sprayJsonV = "1.3.2"
  Seq(
    "org.scalatest" % "scalatest_2.11" % "2.2.4",
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-json" % sprayJsonV,
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
    "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
    // to avoid conflict of multiple versions
    "org.scala-lang" % "scala-reflect" % "2.11.7",
    "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.4",
    "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4"
  )
}