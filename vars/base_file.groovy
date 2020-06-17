import groovy.json.JsonSlurperClassic

class Dname{
    @NonCPS
    def myFile() {
        def slurper = new groovy.json.JsonSlurperClassic()
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('/var/lib/jenkins/workspace/jenkins-share-demo@libs/jenkins-shared-library/resources/config.json'))
        def D = new Dname()
            branch = D.myFile()
            branch.branching.each{
                println "${it}"
    }
    }
}