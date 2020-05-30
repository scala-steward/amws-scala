addSbtPlugin("org.foundweekends" % "sbt-bintray"     % "0.5.6")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"         % "1.0.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.6.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"         % "2.0.1")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.4.0")
addSbtPlugin("org.scoverage"     % "sbt-scoverage"   % "1.6.1")
addSbtPlugin("org.wartremover"   % "sbt-wartremover" % "2.4.9")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.30" // Needed by sbt-git
