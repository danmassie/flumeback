lazy val root = project in file(".") settings (
         organization  := "com.beamly.flumeback",
                 name  := "flumeback",
              version  := "0.1-SNAPSHOT",
             licenses  := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
         scalaVersion  := "2.11.2",
   crossScalaVersions  := Seq(scalaVersion.value),
        scalacOptions  += "-deprecation",
        scalacOptions ++= Seq("-encoding", "utf8"),
        scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint"),
        scalacOptions  += "-optimize",
        scalacOptions  += "-Yinline-warnings",
        scalacOptions  += "-Yno-adapted-args",
        scalacOptions  += "-Ywarn-value-discard",
  libraryDependencies  += "ch.qos.logback"          %  "logback-classic" % "1.1.1",
  libraryDependencies  += "net.databinder.dispatch" %% "dispatch-core"   % "0.11.1")
