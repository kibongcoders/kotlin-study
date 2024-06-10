package com.kibong.kotlinstudy.basic

fun main() {
    val score = 60
    validateScoreIsNotNegative(score)
    println(passFail(score))
    println(inScoreZeroToHundred(score))
    println(whenStatement(score))
    println(whenTypeStatement(score))
    println(judgeScore(score))
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0 보다 작을 수 없습니다.");
    } else {
        println("점수는 ${score}입니다.")
    }
}

fun passFail(score: Int): String {
    return if (score >= 80) {
        "합격"
    } else {
        "불합격"
    }
}

fun inScoreZeroToHundred(score: Int): Boolean {
    return score in 0..100
}

fun whenStatement(score: Int): String {
    //어떠한 expression이라도 사용 가능
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

fun whenTypeStatement(obj: Any): String {
    return when (obj) {
        is String -> "String"
        is Int -> "Int"
        else -> "Unknown"
    }
}

fun judgeScore(score: Int): String {
    return when (score) {
        1, 0, -1 -> "1, 0, -1"
        else -> "other"
    }
}