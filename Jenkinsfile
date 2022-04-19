pipeline {
   agent any
      parameters{
      choice(name: 'Moduletype', choices: ['maven' , 'sonar'])
      string(name: 'Branch', defaultValue: 'main')
   }
    stages {
      stage('checkout') {
                           }
      }
      stage('build') {
          steps{
              sh 'mvn package'
          }
      }
    }
}