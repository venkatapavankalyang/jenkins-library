def call(final String ModuleType, String Build_TOOL ) {
   def CUSTOMPATH
    CUSTOMPATH = "${WORKSPACE}"
    if (Build_TOOL.contains("Maven_Build")) {
        dir("$WORKSPACE/mavenproject") {
            sh """
		    cd "${WORKSPACE}/mavenproject"
			mvn clean packge
            withSonarQubeEnv("SonarQube-7.5") {
              sh "mvn sonar:sonar"
			}
           """
        }
    }
    else if (Build_TOOL.contains("Gradle_Build")) {
        dir("${WORKSPACE}/gradeleproject/") {
            sh """
		    cd "$WORKSPACE/gradelproject"
			mvn clean packge
            withSonarQubeEnv("SonarQube-7.5") {
              sh "mvn sonar:sonar"
			}
           """
        }
    }
}