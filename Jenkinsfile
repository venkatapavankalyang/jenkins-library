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
      stage('SONAR_BUILD') {
         steps {
           script {
             PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
             gitCheckOut("${PIPELINE_PROPS["MAVEN_URL"]}", "$params.Branch" )

             build("$MAVEN_BUILD_COMMAND")
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