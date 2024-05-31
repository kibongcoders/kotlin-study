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

