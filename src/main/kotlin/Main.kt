package org.example

import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val file = File("src/main/input.txt")

    val sumMaxJoltage = file.readLines().sumOf { Utils.findMaxJoltage(it) }

    print("Sum of Joltage: $sumMaxJoltage")
}