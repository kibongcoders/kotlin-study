package com.kibong.kotlinstudy.basic

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val str = "1"
    val number = parseNumber(str)
    println(number)
    //studyCheckedException()
    studyTryWithResource()
}

fun parseNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}은 숫자가 아닙니다.")
    }
}

fun studyCheckedException() {
    throw IllegalArgumentException("checked exception")
}

fun studyTryWithResource(): String? {
    // kotlin
    BufferedReader(FileReader("file.txt")).use { br -> return br.readLine() }
}