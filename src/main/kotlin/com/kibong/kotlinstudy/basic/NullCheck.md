# Kotlin Null Check 
- Kotlin은 null safety를 지원한다.
- null safety를 지원하기 위해 Nullable Type을 제공한다.

## Nullable Type
- Nullable Type은 null을 가질 수 있는 타입을 말한다.
- Nullable Type은 `?`를 사용하여 선언한다.
```kotlin
val a: Int? = null
val b: Double? = null
```

## Safe Call Operator
- Nullable Type을 사용할 때 null check를 하지 않고 안전하게 호출할 수 있는 연산자이다.
- `?.`을 사용하여 Nullable Type을 안전하게 호출할 수 있다.
```kotlin
val name: String? = null
println(name?.length)
```

## Elvis Operator
- Elvis를 닮았다고 해서 Elvis Operator라고 불린다.
- Nullable Type을 사용할 때 null check를 하지 않고 default 값을 지정할 수 있는 연산자이다.
- `?:`을 사용하여 Nullable Type을 안전하게 호출할 수 있다.
```kotlin
val name: String? = null
val length = name?.length ?: 0
```

## Not Null Assertion Operator
- Nullable Type을 사용할 때 null check를 하지 않고 null이 아님을 확신할 때 사용한다.
- `!!`을 사용하여 Nullable Type을 안전하게 호출할 수 있다.
```kotlin
val name: String? = null
val length = name!!.length
```

