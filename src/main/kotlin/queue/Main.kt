package queue

fun main() {

    "O ArrayDeque é uma estrutura de dados eficiente para implementar filas, pois permite adição e remoção de " +
            "elementos nas extremidades de maneira rápida, com complexidade de tempo constante (O(1))."

    // Fila - Primeiro a entrar é o primeiro a sair
    val queue: ArrayDeque<Int> = ArrayDeque()

    // Adicionando elementos - Enqueue
    queue.addLast(1)
    queue.addLast(2)
    queue.addLast(3)
    println(queue)

    // Removendo o elemento que está na frente da fila - Dequeue
    println("==============================")
    queue.removeFirst()
    println(queue)
    println("==============================")

    // Fazendo peek para consultar qual o proximo elemento da fila - Peek
    println(queue.first())

    // Se a lista está vazia
    println(queue.isEmpty())









}