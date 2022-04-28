def call(final String PROJECT_NAME,String MVN_BUILD_COMMAND, String CUSTOMPATH, String WORKSPACE) {
    def CUSTOMPATH
    CUSTOMPATH = "${WORKSPACE}${PROJECT_NAME}
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
}