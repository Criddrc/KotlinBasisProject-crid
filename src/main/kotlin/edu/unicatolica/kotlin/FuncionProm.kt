package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun section1(title: String){
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))
}

fun gradesDemo() {
    section1("4) Average of Grades - 3 Subjects")

    // Grades of the 3 subjects
    val math = 4.567
    val programming = 2.932
    val databases = 3.245

    // Individual evaluation with decimals reduced to 2
    println("Math = ${"%.2f".format(math)} -> ${if (math >= 3.0) "Passed" else "Failed"}")
    println("Programming = ${"%.2f".format(programming)} -> ${if (programming >= 3.0) "Passed" else "Failed"}")
    println("Databases = ${"%.2f".format(databases)} -> ${if (databases >= 3.0) "Passed" else "Failed"}")

    // Average
    val average = (math + programming + databases) / 3
    println("\nFinal Average = ${"%.2f".format(average)} -> ${if (average >= 3.0) "Passed the course" else "Failed the course"}")
}

fun main(){
    section1("Section #1")
    gradesDemo()
}
