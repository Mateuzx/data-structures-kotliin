package hashMap

import java.util.*

fun main() {

    val hashMap = HashMap<String, Int>()
    hashMap["Carlos"] = 30
    hashMap["Ana"] = 25
    hashMap["João"] = 40

    println(hashMap["Carlos"])  // Saída: 30
    println(hashMap["Ana"])     // Saída: 25
    println(hashMap["João"])    // Saída: 40

    // Modificando um valor
    hashMap["Carlos"] = 35
    println(hashMap["Carlos"])  // Saída: 35


}