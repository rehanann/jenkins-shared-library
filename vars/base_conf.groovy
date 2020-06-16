import groovy.json.JsonSlurperClassic

class Cname{
    @NonCPS
    def conf_tag() {
        def confFile = new groovy.json.JsonSlurperClassic().parse(new File('../resourses/config.json'))
            conf.branching.each{
            println "${it}"
        }
    }
}