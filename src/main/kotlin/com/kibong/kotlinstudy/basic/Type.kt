package com.kibong.kotlinstudy.basic

fun main() {

    val number = 3
    val numberLong: Long = number.toLong()
    println(numberLong.dec())

    val number2: Int? = null
    val number2Long: Long = number2?.toLong() ?: 0L
    println(number2Long.dec())

    printAgeIfPerson(Person("hello",100))
    printAgeAsIfPerson(Person("hello",100))

}

fun printAgeIfPerson(obj: Any) {
    //반대시 !is
    if (obj is Person) {
        println(obj.age)
    }else{
        println("Not a person")
    }
}

fun printAgeAsIfPerson(obj: Any?) {
    // value가 Type이면 Type으로 변환
    val person = obj as? Person
    println(person?.age)
}

data class Person(val name:String, val age: Int)
