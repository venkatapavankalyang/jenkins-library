def call () {
     try {
         sh """
	       ./gradlew
		    withSonarQubeEnv("SonarQube-7.5") {
                sh "./gradlew sonarqube"
            }
         """
	}
    catch(Exception e) {
         println(e)
    }
}
