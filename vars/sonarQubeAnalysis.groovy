def call(String ProjectKey, String ProjectName, String ProjectVersion, String sonarLogin, String hostUrl) {
   def sonarqubeScannerHome = tool name: 'sonarqube', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonarqube-7.9.5') {
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
