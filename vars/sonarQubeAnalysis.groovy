
sonar.projectKey=$JOB_NAME
 sonar.projectName=$JOB_NAME
 sonar.projectVersion=$BUILD_NUMBER
 sonar.exclusions=vendor/**, storage/**, resources/**
 sonar.language=java
 sonar.sources=$WORKSPACE
 sonar.sourceEncoding=UTF-8
 sonar.java.binaries=$WORKSPACE/build/classes/java/main