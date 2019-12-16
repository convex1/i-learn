name := "i-learn"

version := "0.1"

lazy val utilities = (project in file("src/common"))
    .configs(IntegrationTest).settings (
  name := "common",
  scalaVersion := "2.11.8",
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.4",
  "org.apache.spark" %% "spark-sql" % "2.4.1",
  "org.apache.spark" %% "spark-mllib" % "2.4.0"
))

lazy val ETL = (project in file("src/ETL"))
  .configs(IntegrationTest).settings (
  name := "etl",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.4.4",
    "org.apache.spark" %% "spark-sql" % "2.4.1",
    "org.apache.spark" %% "spark-mllib" % "2.4.0"
  )).dependsOn(utilities)