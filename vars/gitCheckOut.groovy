
def call(final string URL, String Branch) {
    checkout([$class           : 'GitSCM',
              branches         : [[name: "$Branch"]],
              extensions       : [[$class: 'CloneOption', timeout: 60,]],
              userRemoteConfigs: [[credentialsId: 'github access' , url: "$URL"]]])
}