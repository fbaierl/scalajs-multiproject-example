enablePlugins(ScalaJSPlugin)

lazy val root = (project in file("."))
	.aggregate(subproject1, subproject2)
lazy val subproject1 = project.in(file("subproject1")).dependsOn(core)
lazy val subproject2 = project.in(file("subproject2")).dependsOn(core)
lazy val core = project.in(file("core"))

scalaVersion := "2.11.5"
