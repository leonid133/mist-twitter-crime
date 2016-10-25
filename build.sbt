import AssemblyKeys._

assemblySettings

name := "twitter-crime"

version := "1.0"

scalaVersion := "2.10.6"

resolvers += "Typesafe Repository" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.2",
  "org.apache.spark" %% "spark-sql" % "1.6.2",
  "org.apache.spark" %% "spark-hive" % "1.6.2",
  "io.hydrosphere" %% "mist-oldspark" % "0.5.1-SNAPSHOT",
  "org.apache.spark" %% "spark-streaming" % "1.6.2",
  "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.6.2"
)
