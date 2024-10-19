package linkedList

import java.util.*

fun main() {

    // Boa opção para quando necessário constante alternacia na extremidade de inicio de uma lista
    // Porém não é uma boa para a maioria dos casos, visto que mutableList e list tem um desempenho melhor situações comuns
    val linkedList = LinkedList<String>()
    linkedList.add("Kotlin")
    linkedList.add("Java")
    linkedList.add("Python")

    println(linkedList)  // Saída: [Kotlin, Java, Python]

    linkedList.removeFirst()
    println(linkedList)  // Saída: [Java, Python]

}