package com.erikriosetiawan

/**
 * This function below are equivalent with this code
   fun printHello(name: String?) {
        if (name != null) {
            println("Hello $name")
        }
    }
 */
fun printHello(name: String?) {
    if (name != null) {
        println("Hello $name")
    }
}

/**
 * Single expression functions
 */
fun double(x: Int): Int = x * 2

/**
 * String interpolation
 * In java:
 * int num = 10
 * String s = "i = " + num;
 */
val num = 10
val s = "i = $num"

/**
 * Nullable references
 */
fun main() {
    /**
     *  var a: String = "abc"
        a = null
     */
   var a: String? = "abc"
    a = null

    /**
     * Equlity of values
     */
    val b = 5
    val c = 10

    if (b == c) {
        println("$b equals with $c")
    }
}
