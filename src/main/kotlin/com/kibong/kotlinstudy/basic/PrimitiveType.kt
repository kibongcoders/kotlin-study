package com.kibong.kotlinstudy.basic

fun main() {

    val int: Int = 1
    val intNull: Int? = null

    val long: Long = 1L
    val float: Float = 1.0f
    val double: Double = 1.0
    val char: Char = 'A'

    val string: String = "Hello, Kotlin!"
    val compareString : String = "Hello, Kotlin!"
    val boolean: Boolean = true

    data class User(val name: String, val age: Int)

    val user = User("Kibong", 30)

}