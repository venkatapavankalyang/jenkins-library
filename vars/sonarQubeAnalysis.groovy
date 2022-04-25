 def call(String projectKey, String projectName) {
    def scannerhome = tool  name: 'scanner-project'
    withSonarQubeEnv(credentialsId: 'sonarqube_token') {
        sh "${scannerhome}/bin/sonar-scanner \
           -Dsonar.ProjectKey=${projectKey} \
           -Dsonar.ProjectName=${projectName} \
           -Dsonar.ws.timeout=60 \
           -Dsonar.sources=. \
           -Dsonar.sourceEncoding=UTF-8 \
           -Dsonar.java.binaries=. \
           -Dsonar.language=java \
           -Dsonar.java.source=1.8"
    }
}