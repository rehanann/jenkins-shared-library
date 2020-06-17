import groovy.json.JsonSlurperClassic

class Dname{
    // @NonCPS
    def myFile() {
        // def slurper = new groovy.json.JsonSlurperClassic()
        // def confFile = new groovy.json.JsonSlurperClassic().parse(new File('/var/lib/jenkins/workspace/jenkins-share-demo@libs/jenkins-shared-library/resources/config.json'))
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('..//resources/config.json'))
            // branch = D.myFile()
            confFile.branching.each{
                println "${it}"
        }
    }
}

// Dname d = new Dname()
// println d.myFile()