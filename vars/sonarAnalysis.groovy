def call(String sonarProjectKey, String sonarProjectName, String scannerHome, String sonarProjectVersion) {
    withSonarQubeEnv('sonarqube') {
        sh "${scannerHome}/bin/sonar-scanner    " + {
            "-Dsonar.projectKey=${sonarProjectKey} " +
            "-Dsonar.projectName=\"${sonarProjectName}\" " +
            "-Dsonar.projectVersion=${sonarProjectVersion}"
        }
    }
}