fun main(args: Array<String>) {
    println(Myfunction("Rekayasa Perangkat Lunak"))
//    Lambda function
    val mylambda : (String)->Unit = {s: String-> print(s) }
    val v: String = "Jurusan Teknik Informatika"
    mylambda(v)

//    Inline lambda
    myFun(v, mylambda) // passing lambda as a parameter of another function
}
fun Myfunction(x: String):String{
    var c: String = "Hey!! Welcome To ---"
    return (c+x)
}
fun myFun(a: String, action: (String)->Unit){ // Passing lambda
    print("\nHeyy!!!")
    action(a) // call  to lambda function
}

