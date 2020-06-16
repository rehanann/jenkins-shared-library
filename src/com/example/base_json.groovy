// package com.example
// import groovy.json.JsonSlurper

// public class baseJSON{
//     def branch_tag() {
//         def slurper = new JsonSlurper()
//         def branch_name = slurper.parseText('{ "branching": ["cp", "cps", "din", "po", "master", "testsub"] }')
//     }
// }

package com.example
import groovy.json.JsonSlurperClassic

class Bname{
    @NonCPS
    def branch_tag() {
        def slurper = new JsonSlurper()
        def branch_name = slurper.parseText('{ "branching": ["cp", "cps", "din", "po", "master", "testsub"] }')
        return branch_name
    }
}