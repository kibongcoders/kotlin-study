package com.kibong.kotlinstudy.basic

fun main() {
    startWithANullable("Apple") // true
    println(startWithANullable("Apple")) // true
    println(startWithANullable("Banana")) // false

    val nullString: String? = null
    println(startWithANullable(nullString))
    println(startWithANull(nullString))
    try {
        startWithAException(nullString)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    //safe call
    println(nullString?.let { startWithANullable(it) })

    //elvis operator
    println(nullString?.let { startWithANullable(it) } ?: false)

    println(nullString?.let { startWithA(it) } ?: false)

    try {
        println(startWithAAlways(nullString))
    } catch (e: NullPointerException) {
        println(e.message)
    }


}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startWithAAlways(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startWithANullable(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startWithAException(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null은 허용되지 않습니다.")
    }
    return str.startsWith("A")
}

fun startWithANull(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}