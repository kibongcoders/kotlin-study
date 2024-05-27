# Kotlin
- 코틀린은 2011년 JetBrains에서 발표한 프로그래밍 언어
- 코틀린은 Java의 단점을 보완하고자 만들어진 언어
- Java의 프레임 워크와 라이브러리를 활용하면서 더욱 표현력이 뛰어나고 명확한 구문을 제공하는 것을 목표로 만들어짐
- 코틀린은 JVM에서 동작하는 언어로 Java와 100% 호환된다.

## 특징
- 간결성
- 표현성
- 자바와 상호 운용성

### 간결성
- 코틀린은 코드를 간결하게 작성할 수 있도록 설계되었다.

```kotlin
    data class User(val name: String, val age: Int)

    val user = User("KiBong", 30)
    val user1 = User("KiBong", 30)
    println(user.age.toString())
    println(user.name.equals("KiBong"))
    println(user.hashCode().compareTo(user1.hashCode()))

```

### 표현성
- 더 읽기 쉽고 이해하기 쉬운 코드를 작성 가능
```kotlin
  when (user.age) {
        1 -> println("미성년자")
        2 -> println("성인")
        else -> println("노인")
    }
```
### Java와 상호 운용성
- 코틀린은 100% 호환되기 때문에 Java와 쉽게 상호 운용이 가능하다.

```kotlin
fun getList(): List<String> = listOf("Kibong", "Kotlin", "Java")

//Java
List<String> list = KotlinTestKt.getList();
```

