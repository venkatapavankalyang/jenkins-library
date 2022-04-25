def call(String ProjectKey,String ProjectName) {
    def sonarDir = tool name: 'scanner-project', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv(credentialsId: 'comp-sonar') {
        sh "${sonarDir}/bin/sonar-scanner \
           -Dsonar.ProjectKey=${ProjectName} \
           -Dsonar.ProjectName=${ProjectName} \
           -Dsonar.ws.timeout=60 \
           -Dsonar.sources=. \
           -Dsonar.sourceEncoding=UTF-8 \
           -Dsonar.java.binaries=. \
           -Dsonar.language=java \
           -Dsonar.java.source=1.8"
    }
}