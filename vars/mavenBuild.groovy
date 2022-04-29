import static com.sonar.Constants.*


def call(final String PROJECT_NAME, String GRADLE_MAVEN_NPM_BUILD_COMMAND, String BUILD_TOOL) {

    def CUSTOMPATH
    CUSTOMPATH = "${CUSTOM_WORKSPACE}${PROJECT_NAME}"
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