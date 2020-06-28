import groovy.json.JsonSlurperClassic

resources = '/jenkins-share-demo@libs/jenkins-shared-library/resources/'

class Dname{
    @NonCPS
    def myFile() {
        def slurper = groovy.json.JsonSlurperClassic
        def confFile = new slurper().parse(new File('${workspace}' + '${resources}' + 'config.json'))
             confFile.branching.each{
                return "${it}"
        }
    }
}