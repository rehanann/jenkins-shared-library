package com.example
import groovy.json.JsonSlurperClassic

class Bname{
    @NonCPS
    def branch_tag() {
        def slurper = new groovy.json.JsonSlurperClassic()
        def branch_name = slurper.parseText('{ "branching": ["cp", "cps", "din", "po", "master", "testsub"] }')
        return branch_name
    }
}