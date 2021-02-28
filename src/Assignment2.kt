
fun main() {
    name()
    var result =modulus(32,23)
    println(result)
    var total=add(34,10,15,16)
    println(total)
    fact()

}
fun name(){
    var name="Rebecca"
    println("Hellow ${name}")

}
fun modulus(a:Int,b:Int):Int{
    var mod=a% b
    return mod


}
fun add(a:Int,b:Int,c:Int,d:Int):Int{

    var sum=a+b+c+d
    return sum
}
fun fact(){
    var interest="watching"
    println(interest)
}
