import com.example.*


def conf() {
    def C = new Cname()
    branch = C.confFile()
    branch.branching.each{
        println "${it}"
    }
}