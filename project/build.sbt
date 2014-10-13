lazy val root = (
  project in file(".")
  settings (
         name := "flumeback-build",
    addSbtPlugin("com.github.gseitz" % "sbt-release"   % "0.8.5"),
    addSbtPlugin("com.typesafe.sbt"  % "sbt-pgp"       % "0.8.3"),
    addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"  % "0.2.1"))
)