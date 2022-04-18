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
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/venkatapavankalyang/maven-project.git']]])
             }
          }
        }
      }
      stage('build'){
        steps{
          sh 'mvn package'
        }
      }
    }
}