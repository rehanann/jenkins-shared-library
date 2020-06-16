import groovy.json.JsonSlurperClassic

class Cname{
    @NonCPS
    def conf_tag() {
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('/var/lib/jenkins/workspace/jenkins-share-demo@libs/jenkins-shared-library/resources/config.json'))
            confFile.branching.each{
            return "${it}"
        }
    }
}