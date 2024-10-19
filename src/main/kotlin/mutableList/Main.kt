package mutableList

fun main() {

    // Tamanho variavel mutável
    // Se tiver muitas operações (adições e realocações) podem exigir realocação de memória e prejudicar o desempenho
    val mutableList = mutableListOf(4, 2, 9, 1, 6, 11, 13, 14, 56, 18)

    mutableList.forEach { list ->
        println(list)
    }

}