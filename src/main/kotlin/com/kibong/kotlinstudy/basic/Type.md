# Kotlin Type

## 기본 타입

- Kotlin은 Java와 같이 Primitive Type을 제공한다.
- Kotlin은 선언된 기본값을 보고 타입을 추론한다.

### 기본 타입 종류

- Byte
- Short
- Int
- Long
- Float
- Double
- Char
- Boolean
- String

### 기본값 타입 추론

```kotlin
val a = 10000 // Int
val text = "Hello" // String
val b = 100.0 // Double
```

### 타입 변환

- Kotlin에서 기본 타입 변환은 명시적으로 이루어져야 한다.
```kotlin
val a: Int = 100
val b: Long = a.toLong()

val number1 = 4;
val number2 : Long = number1 // Error
//Type mismatch. Compile Error
```

## 일반 타입

- is, !is 연산자를 사용하여 타입을 체크할 수 있다.

```kotlin
val a: Int = 100
if (a is Int) { 
    println("a is Int")
}
```

- as 연산자를 사용하여 타입을 변환할 수 있다.

```kotlin
val a: Int = 100
val b: Long = a as Long // Error
```

## Kotlin에서만 사용하는 Type

- Any
- Unit
- Nothing

### Any

- Java의 Object와 같은 역할을 한다.
- 모든 Primitive 타입의 최상위 타입이다.
- null을 포함하고 싶다면 Any?를 사용한다.
```kotlin
val any: Any = 100
val any1: Any = "Hello"
val any2: Any = 100.0
```

### Unit
- Java의 void와 같은 역할을 한다.
- void와 다르게 타입 자체가 존재한다.
- 함수형 프로그래밍에서는 단 하나의 인스턴스만 갖는 타입임을 의미
```kotlin
fun printHello(): Unit {
    println("Hello")
}
```

### Nothing
- 함수가 정상적으로 종료되지 않는다는 것을 명시적으로 표현할 때 사용한다.
- 예외를 던지거나 무한 루프를 돌 때 사용한다.
- 잘 쓰이지는 않음 -> 무한루프를 잘 안돌기 때문에
```kotlin
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
```

## String interpolation / String Indexing

### String interpolation

- 문자열 내부에 변수를 삽입할 때 사용
- $를 사용하여 변수를 삽입

```kotlin
val name = "KiBong"
println("My name is $name")
```
- 중괄호를 생략 가능

```kotlin
val name = "KiBong"
println("My name is $name")
```
- 중괄호를 생략 가능하더라도 ${문자열} 로 써주는 것이 가독성이 좋다.
- 가독성, 일괄 변환, 정규식에 활용
------------------
- """"""를 사용하여 여러줄의 문자열을 사용할 수 있다.
- 변수를 삽입할 수 있다.
```kotlin
val name = "KiBong"
val text =
"""
    Tell me and I forget.
    Teach me and I remember.
    Involve me and I learn.
    (${name})
"""
println(text)
```

### String Indexing
- Java와 동일하게 문자열을 인덱싱하여 사용할 수 있다.
- 문자열의 길이는 length를 사용하여 구할 수 있다.
```kotlin
val text = "Hello"
println(text[0]) // H
println(text[1]) // e
println(text[2]) // l
println(text[3]) // l
println(text[4]) // o
println(text.length) // 5
```


