package com.kibong.kotlinstudy.basic

fun main() {
    try {
        val immutable: String = "Hello, Kotlin!"
        //immutable = "hello" // Val cannot be reassigned 에러 발생
        var mutable: String = "Hello, Kotlin!"
        mutable = "Hello, Java!"
        println(mutable)

        val immutableList: MutableList<String> = mutableListOf("Hello", "Kotlin")
        immutableList.add("Java")
        println(immutableList)
    } catch (e: Exception) {
        println(e)
    }
}