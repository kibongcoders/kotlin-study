package com.kibong.kotlinstudy.basic

fun main() {
    //main 함수로 코드를 실행할 수 있다.
//    println("Hello, Kotlin!")
//    valAndVar()
//    dataType()

    val n = 15

    val result = n shl 2 shl 1
    println(result)
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
    val compareString : String = "Hello, Kotlin!"
    val boolean: Boolean = true

    val noType = 1L;

    data class User(val name: String, val age: Int)

    val user = User("Kibong", 27)
    val user1 = User("Kibong", 27)
    val user2 = User("Kibong", 28)

    //타입 비교 방법
    println(noType::class.simpleName) // 자동적으로 형변환을 한다.
    println(int.toLong() == long)
    println(float.toDouble() == double)
    println(string == compareString)
    println(user == user1)
    println(user === user1)
    println(user == user2)





}