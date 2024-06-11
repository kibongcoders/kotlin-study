## Kotlin 반복문

Kotlin에서 반복문은 Java와 매우 유사하다.

## ForEach문

Kotlin에서는 `forEach`문을 사용하여 컬렉션을 순회할 수 있다.  
그리고 Java와 달리 in을 사용해서 컬렉션을 순회할 수 있다.

```kotlin
val list = listOf(1, 2, 3, 4, 5)

list.forEach {
    println(it)
}

for (i in list) {
    println(i)
}
```

## 전통적인 for문

코틀린에서는 전통적인 for문도 사용할 수 있다.

```kotlin
for (i in 1..10) { 
    println(i)
}
```

역으로 내려가는 경우에는 downTo를 사용해서 역순으로 for문을 돌 수 있다.
    
```kotlin
for (i in 10 downTo 1) { 
    println(i) 
}
```

2칸씩 올라가는 경우는??

```kotlin
for (i in 1..10 step 2) { 
    println(i) 
}
```

## while문

Kotlin에서는 while문을 사용할 수 있다.

```kotlin
var i = 0
while (i < 10) {
    println(i)
    i++
}
```

do while문도 사용할 수 있다.

```kotlin
var i = 0
do {
    println(i)
    i++
} while (i < 10)
```
