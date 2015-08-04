scalacOptions ++= Seq("-deprecation", "-language:_", "-unchecked")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "maven(com.typesafe.play, play_2.11)")
