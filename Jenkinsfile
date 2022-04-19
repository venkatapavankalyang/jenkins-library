def PIPELINE_PROPS
pipeline {
   agent any
   libraries {
       lib('jenkins-library')
   }
      parameters {
      choice(name: 'Moduletype', choices: ['maven' , 'sonar'])
      string(name: 'Branch', defaultValue: 'main')
   }
    stages {
      stage('checkout') {
         steps {
           script {
             PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
             gitCheckOut("${PIPELINE_PROPS["MAVEN_URL"]}", "$params.Branch" )
           }
         }
      }
      stage('build') {
          steps{
              sh 'mvn package'
          }
      }
    }
}