 def call(String ProjectKey, String ProjectName) {
    def sonarDir = tool name: 'scanner-project'
    withSonarQubeEnv(credentialsId: 'sonarqube_token') {
        sh "${sonarDir}/bin/sonar-scanner \
           -Dsonar.ProjectKey=${ProjectKey} \
           -Dsonar.ProjectName=${ProjectName} \
           -Dsonar.ws.timeout=60 \
           -Dsonar.sources=. \
           -Dsonar.sourceEncoding=UTF-8 \
           -Dsonar.java.binaries=. \
           -Dsonar.language=java \
           -Dsonar.java.source=1.8"
    }
}