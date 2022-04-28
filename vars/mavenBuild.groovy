def call(final String ModuleType String Build_TOOL ) {

    def str = "$params.ModuleType"
    if (str.contains("Maven_Build")) {
        dir("${WORKSPACE}/PROJECT_NAME/") {
            sh """
		    cd "${WORKSPACE}{PROJECT_NAME}
			mvn clean packge
            withSonarQubeEnv("SonarQube-7.5") {
              sh "mvn sonar:sonar"
			}
           """
        }
    }
    else if (str.contains("Gradle_Build")) {
        dir("${WORKSPACE}/PROJECT_NAME/") {
            sh """
		    cd "${WORKSPACE}{PROJECT_NAME}
			mvn clean packge
            withSonarQubeEnv("SonarQube-7.5") {
              sh "mvn sonar:sonar"
			}
           """
        }
    }
}