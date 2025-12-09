package org.example

import org.example.day1.DialRotator
import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Day 1
    val inputs = File("src/main/resources/day1.txt").readLines()

    val dialRotator = DialRotator()

    inputs.forEach { dialRotator.rotate(it) }

    println("The password is ${dialRotator.zeros}")
    println("There were ${dialRotator.crossings} crossings over 0")
}