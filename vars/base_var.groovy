import com.example.*


def call() {
    def bJSON = new baseJSON()
    branch = bJSON.branch_tag()
    branch.branching.each{
        println "${it}"
    }
}

call()
// branch = new testing()
// branch = branch.branch_tag()
// println branch

// branch.branching.each{
//     println "${it}"
// }