def PIPELINE_PROPS
pipeline {
   agent any
      parameters{
      choice(name: 'Moduletype', choices: ['maven' , 'sonar'])
      string(name: 'Branch', defaultValue: 'main')
   }
    stages {
      stage('checkout') {
         steps {
           PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
           gitCheckOut("${PIPELINE_PROPS["MAVEN_URL"]}", "$params.Branch" )
         }
      }
      stage('build') {
          steps{
              sh 'mvn package'
          }
      }
    }
}