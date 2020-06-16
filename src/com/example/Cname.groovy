package com.example
import groovy.json.JsonSlurperClassic

class Cname{
    @NonCPS
    def confFile() {
        def slurper = new groovy.json.JsonSlurperClassic()
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('/var/lib/jenkins/workspace/jenkins-share-demo@libs/jenkins-shared-library/resources/config.json'))
        return confFile
    }
}