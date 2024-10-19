package stack

fun main() {

    "O ArrayDeque é uma estrutura de dados eficiente para implementar pilhas, pois permite adição e remoção de " +
            "elementos nas extremidades de maneira rápida, com complexidade de tempo constante (O(1))."

    // Pilha - Ultimo a entrar é o primeiro a sair
    val stack: ArrayDeque<String> = ArrayDeque()

    // Adicionando elementos - Push
    stack.addLast("Mateus")
    stack.addLast("Lucas")
    stack.addLast("Mario")
    stack.addLast("Rogerio")
    stack.addLast("Pedro")
    stack.addLast("Luiz")

    // Removendo o ultimo adicionado - Pop
    stack.removeLast()

    // Vendo o ultimo elemento adicionado - peek
    println(stack.last())

}