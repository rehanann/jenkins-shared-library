package com.example
import groovy.json.JsonSlurperClassic

class Cname{
    @NonCPS
    def confFile() {
        def slurper = new groovy.json.JsonSlurperClassic()
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('../resources/config.json'))
        return confFile
    }
}