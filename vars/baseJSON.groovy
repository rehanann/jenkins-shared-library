import groovy.json.JsonSlurper

class baseJSON{
    def branch_tag() {
        def slurper = new JsonSlurper()
        def brach_name = slurper.parseText('{ "branching": ["cp", "cps", "din", "po", "master", "testsub"] }')
    }
}