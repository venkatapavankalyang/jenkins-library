pipeline {
   agent any
    stages {
      stage('checkout') {
         steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/venkatapavankalyang/maven-project.git']]])
         }
      }
      stage('build') {
          steps{
              sh 'mvn package'
          }
      }
    }
}