package com.kibong.kotlinstudy.basic

fun main() {
    //main 함수로 코드를 실행할 수 있다.
    println("Hello, Kotlin!")
    valAndVar()
}

// Kotlin에서 val 키워드를 통해 불변 변수를 선언
// var를 통해 가변 변수를 선언

fun valAndVar() {
    val immutable: String = "Hello, Kotlin!"
    var mutable: String = "Hello, Kotlin!"

    // immutable = "Hello, Java!" // 컴파일 에러
    mutable = "Hello, Java!"
    //immutable = "Hello, Java!" // Val cannot be reassigned 에러 발생

    println(immutable)
    println(mutable)
}

fun dataType() {


    val int: Int = 1
    val long: Long = 1L
    val float: Float = 1.0f
    val double: Double = 1.0
    val char: Char = 'A'
    val string: String = "Hello, Kotlin!"
    val boolean: Boolean = true

}