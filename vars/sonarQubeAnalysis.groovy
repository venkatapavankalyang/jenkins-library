def call(String ProjectKey, String ProjectName, String ProjectVersion, String sonarLogin, String hostUrl) {
    withSonarQubeEnv('sonarqube-7.9.5') {
            sh     "-Dsonar.host.url= ${hostUrl}",
                   "-Dsonar.login=${sonarLogin}",
                   "-Dsonar.projectName=${ProjectName}",
                   "-Dsonar.projectVersion=${ProjectVersion}",
                   "-Dsonar.projectKey=${ProjectKey}"

    }
}
