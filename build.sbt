scalaVersion := "2.11.4"

libraryDependencies ++= (
  ("com.googlecode.json-simple" % "json-simple" % "1.1.1" exclude("junit", "junit")) ::
  ("com.novocode" % "junit-interface" % "0.11" % "test") ::
  ("org.mockito" % "mockito-all" % "1.8.5" % "test") ::
  Nil
)
