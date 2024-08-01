package com.kibong.kotlinstudy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KeywordKotlinTest {

    @Test
    fun variableTest() {
        val immutableKiBong:String = "immutable kibong"
        var mutableKiBong:String = "mutable kibong"
        //immutableKiBong = "immutable kibong test" Error
        mutableKiBong = "mutable kibong test"
    }

    @Test
    fun variableInitTest(){
        //val initKibong Error
        //초기화 할 대에는 무조건 값이나 타입을 지정해야한다.
        val immutableKiBong:String
        immutableKiBong = "immutable kibong"
        println(immutableKiBong)
    }

    @Test
    fun  immutableListTest(){
        val immutableList: MutableList<String> = mutableListOf()
        immutableList.add("immutable")
        immutableList.add("kibong")
        immutableList.add("is Good")
        assertEquals(immutableList.size, 3)
    }

}
