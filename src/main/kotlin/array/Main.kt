package array

fun main() {

    // Tamanho fixo e mutável
    var array = arrayOf(4, 2, 9, 1, 6, 11, 13, 14, 56, 18)
    array[0] = 10  // Alterando valor de uma posição
    array = array.sortedArray()

    array.forEach { number ->
        println(number)
    }

}