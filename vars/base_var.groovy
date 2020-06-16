import com.example.*


def call() {
    def b = new Bname()
    branch = b.branch_tag()
    branch.branching.each{
        return "${it}"
    }
}

println call()
// branch = new testing()
// branch = branch.branch_tag()
// println branch

// branch.branching.each{
//     println "${it}"
// }