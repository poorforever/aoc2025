package org.example

import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val file = File("src/main/resources/input.txt")
    val grid = file.readLines()
    val neighbourChecker = NeighbourChecker(grid)

    val admissibles = neighbourChecker.countAdmissibles()

    println("Admissibles: $admissibles")
}