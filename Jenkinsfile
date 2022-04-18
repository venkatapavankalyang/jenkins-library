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
          //script {
            //PIPELINE_PROPS = readProperties file: 'properties/pipeline.properties'
            //git branch: 'main', url: 'https://github.com/venkatapavankalyang/jenkins-library.git'
            //gitCheckOut("${PIPELINE_PROPS["MAVEN_URL"]}", "$params.Branch", "${PIPELINE_PROPS["MAVEN_CLEAN_COMMAND"]}", "${PIPELINE_PROPS["MAVEN_BUILD_COMMAND"]}")
          //}
        //}
      //}
    //}
//}
           stage('checkout'){
                       steps{
                           checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'github access', url: 'https://github.com/sreenivas449/java-hello-world-with-maven.git']]])
                       }
                   }
                   stage('build'){
                       steps{
                          bat 'mvn packag'
                       }
                   }
               }
           }
}