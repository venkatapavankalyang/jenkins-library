def call(String ProjectKey, String ProjectName, String ProjectVersion, String sonarLogin, String hostUrl) {
   def sonarqubeScannerHome = tool name: 'sonar-scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv(credentialsId: '9090') {
            sh "${sonarqubeScannerHome}/bin/sonar-scanner "
                   "-Dsonar.host.url= ${hostUrl}"
                   "-Dsonar.login=${sonarLogin}"
                   "-Dsonar.projectName=${ProjectName}"
                   "-Dsonar.projectVersion=${ProjectVersion}"
                   "-Dsonar.projectKey=${ProjectKey}"
                   "-Dsonar.sources=*src/main/*"
                   "-Dsonar.java.libraries=target/*"
	               "-Dsonar.java.binaries=target/classes"
	               "-Dsonar.language=java"
    }
}
