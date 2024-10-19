package list

fun main() {

    // Tamanho fixo e imutável
    // Oferece segurança, sem gerenciamento de modificações de estados
    val listOf = listOf(4, 2, 9, 1, 6, 11, 13, 14, 56, 18)

    listOf.forEach { list ->
        println(list)
    }

}