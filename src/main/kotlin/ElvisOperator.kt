fun main(args: Array<String>) {
//    Elvis operator
    var maybeWelcome: String? = "Hello world"
    println(maybeWelcome?.length ?: 0)
}