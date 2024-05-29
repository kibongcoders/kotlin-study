# Kotlin Primitive Type

- 코틀린에서 Primitive Type은 Primitive Type과 Reference Type을 구분하지 않는다.  
- 이 타입들은 실행시 Primitive Type으로 표현 되지만 코드에서는 평범한 클래스로 보인다.
  - 개발자가 boxing, unboxing을 신경쓸 필요가 없다.

## Kotlin에서 Primitive Type 표현 방법
```kotlin
val a: Int = 10000
val text: String = "Hello"
val b: Double = 100.0
```

## Nullable Primitive Type
- Primitive Type은 null을 가질 수 없다.
- Primitive Type을 nullable하게 사용하려면 `?`를 사용한다.
```kotlin
val a: Int? = null
val b: Double? = null
```
## Instance 선언 방법
- Kotlin에서 인스턴스를 선언 할 때에는 Java와 다르게 `new` 키워드를 사용하지 않는다.
```kotlin
val person = Pertson("KiBong", 30)
``` 
