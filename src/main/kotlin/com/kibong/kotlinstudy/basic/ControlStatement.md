## Kotlin 제어문 (Control Statement)

## Kotlin 제어문 종류
- if
- when
- for
- while
- do-while

## if
- Kotlin If문은 Java와 크게 다를게 없다.
- 하지만 다른 점이 있는데 그것은 Statement가 아닌 Expression이다.
- Kotlin은 삼항 연산자를 사용하지 않는다.

```kotlin
val a = 10
val b = 20

if (a > b) {
    println("a is greater than b")
} else {
    println("a is less than b")
}
```

### Java If와 Kotlin If 비교
- Java에서는 if문은 Statement이다.
- Kotlin에서는 if문은 Expression이다.
- Statement와 Expression의 차이는 값을 반환하는지 여부이다.

```java
int a = 10;
int b = 20;

String result = "";
if (a > b) {
    result = "a is greater than b";
} else {
    result = "a is less than b";
}
```

```kotlin
val a = 10
val b = 20

val result = if (a > b) {
    "a is greater than b"
} else {
    "a is less than b"
}
```



## when
- Kotlin에서 switch문 대신 when을 사용한다.

```kotlin
val x = 1

when (x) {
    1 -> println("x == 1")
    2 -> println("x == 2")
    else -> {
        println("x is neither 1 nor 2")
    }
}
```

