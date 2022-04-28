def call() {
    try {
        sh """
	      mvn package
		  withSonarQubeEnv("SonarQube-7.5") {
                      sh "mvn sonar:sonar"
          }
          """
    }
    catch (Exception e) {
        println(e)
    }
}