
def call(final String URL, String Branch) {
    checkout([$class           : 'GitSCM',
              branches         : [[name: "$Branch"]],
              extensions       : [[$class: 'CloneOption', timeout: 60,]],
              userRemoteConfigs: [[credentialsId: 'github access' , url: "$URL"]]])
}