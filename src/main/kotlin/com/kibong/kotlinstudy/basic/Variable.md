# 코틀린 변수

## 변수 선언
코틀린에서 변수를 선언하는 방법은 2가지 방법이 있다.

1. val
2. var

## val

코틀린에서 val은 불변 변수를 선언할 때 사용한다.  
Java에서 final 키워드와 같은 역할을 한다.

```kotlin
val name: String = "KiBong"
name = "Kibong" // Error
```

하지만 컬렉션의 경우 element를 추가하거나 삭제하는 것은 가능하다.

```kotlin
val list = mutableListOf(1, 2, 3)
list.add(4)
list.remove(1)
```

코드를 깔끔하게 관리하기 위해서는 val를 사용하다 필요에 따라 var로 변경하는 것이 좋다.

## var

코틀린에서 var은 가변 변수를 선언할 때 사용한다.

```kotlin
var age: Int = 30
age = 31
```
