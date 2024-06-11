# Kotlin Function

## Kotlin 함수 선언

Kotlin에서 함수를 선언하는 방법은 다음과 같다.

```kotlin
//변경 전
fun sum(a: Int, b: Int): Int {
    return a + b
}
//변경 후
fun sum(a: Int, b: Int): Int = a + b
```

block을 사용하는 경우 반환 타입이 Unit이 아니면 반드시 반환 타입을 명시해야 한다.

```kotlin
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
```

## Default Parameter
Java에서 같은 함수를 여러개 만들어야 하는 경우가 있다. (Overloading)  
Kotlin에서는 Default Parameter를 사용하여 함수를 여러개 만들 필요가 없다.  
파라미터 뒤에 `=`를 사용하여 기본값을 지정할 수 있다.
```kotlin
fun sum(a: Int, b: Int = 0, c: Int = 0): Int {
    return a + b + c
}
```

더하여 Named Parameter를 사용할 수 있다.
Default 파라미터를 사용하면서도 Named Parameter를 사용할 수 있다.
```kotlin
fun sum(a: Int, b: Int = 0, c: Int = 0): Int {
    return a + b + c
}

fun main() {
    println(sum(1, 2, 3))
    println(sum(1, c = 3))
}
```

## Named Argument
Java에서는 함수를 호출할 때 파라미터의 순서를 지켜야 한다.
Kotlin에서는 Named Argument를 사용하여 파라미터의 순서를 지키지 않아도 된다.
```kotlin
fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun main() {
    println(sum(a = 1, b = 2, c = 3))
    println(sum(c = 3, a = 1, b = 2))
}
```

## Variable Number of Arguments
Java에서는 가변인자를 사용할 때 `...`을 사용한다.
Kotlin에서는 `vararg`를 사용하여 가변인자를 사용할 수 있다.
```kotlin
fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    println(sum(1, 2, 3, 4, 5))
}
```

배열을 가변인자에 넣어줘야 할 때에는 `*`를 사용한다.
```kotlin
fun sum(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(sum(*numbers))
}
```




