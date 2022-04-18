def PIPELINE_PROPS

pipeline{
    agent any
       parameters{
       choice(name: 'Moduletype', choices: ['maven' , 'sonar'])
       string(name: 'Branch', defaultValue: 'main')
    }
    stages {
      stage('maven build') {
        steps {
          stage('checkout'){
             steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/sreenivas449/java-hello-world-with-maven.git']]])
          }
      }
      stage('build'){
        steps{
          sh 'mvn package'
        }
      }
    }
}