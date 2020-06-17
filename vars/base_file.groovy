import groovy.json.JsonSlurperClassic


class Dname{
    @NonCPS
    def myFile() {
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('/var/lib/jenkins/workspace/jenkins-share-demo@libs/jenkins-shared-library/resources/config.json'))
             confFile.branching.each{
                return "${it}"
        }
    }
}