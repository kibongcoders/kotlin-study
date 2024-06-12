# Kotlin Class
코틀린에서 클래스를 선언하는 방법은 다음과 같다.

## Class and Property
```kotlin
class Person {
    var name: String = ""
    var age: Int = 0
}
```
constructor를 사용하여 생성자를 만들 수 있다.

```kotlin
class Person constructor(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}
```
constructor 키워드는 생략할 수 있다.

```kotlin
class Person(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}
```

그리고 생성자 내에 Property를 선언할 수 있다.

```kotlin
class Person(
    var name: String,
    var age: Int)
```
    

Getter와 Setter를 정의하지 않아도 .feld를 사용하여 접근할 수 있다.

```kotlin
class Person(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}

fun main() {
    val person = Person("Kibong", 30)
    println(person.name)
    println(person.age)
}
```

## Constructor and Init

### Init
Init은 생성자가 호출될 때 가장 먼저 실행되는 블록이다.

```kotlin
class Person(
    var name: String,
    var age: Int) {
    init {
        println("Person is created")
    }
}
```
그리고 이 Init 블록에서 검증도 가능하다.
    
```kotlin
class Person(
    var name: String,
    var age: Int) {
    init {
        require(name.isNotEmpty()) { "Name should not be empty" }
        require(age > 0) { "Age should be greater than 0" }
    }
}
```
Init은 값을 적절히 만들어주거나 validation을 할 때 사용한다.

### Constructor
Constructor는 여러개 만들 수 있다.

```kotlin
class Person(
    var name: String,
    var age: Int) {
    constructor(name: String) : this(name, 0)
    constructor(age: Int) : this("", age)
}

fun main() {
    val person1 = Person("Kibong")
    val person2 = Person(30)
}
```

Constructor는 Primary Constructor와 Secondary Constructor로 나뉜다.
- Primary Constructor : 클래스 선언부에 선언되어 있는 Constructor이다.
- Secondary Constructor : 클래스 선언부에 선언되어 있지 않은 Constructor이다.
  - Secondary Constructor는 body를 가질 수 있다.
  - Secondary Constructor는 Primary Constructor를 호출해야 한다.
  - Secondary Constructor는 this 키워드를 사용하여 Primary Constructor를 호출한다.
  - 호출 순서는 Init -> Primary Constructor -> Secondary Constructor이다.
- Default Constructor : Primary Constructor가 없는 경우에 Default Constructor가 생성된다.
  - Kotlin에서는 Secondary Constructor를 사용하지 않는 것을 권장한다.

```kotlin
class Person {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
```

만약 Converting 하고 싶을 때에는 static factory method를 사용할 수 있다.

```kotlin
class Person private constructor(
    var name: String,
    var age: Int) {
    companion object {
        fun create(name: String, age: Int): Person {
            return Person(name, age)
        }
    }
}
```

## Custom Getter and Setter
Getter와 Setter를 사용하여 Property에 접근할 때 추가적인 작업을 할 수 있다.

```kotlin
class Person {
    var name: String = ""
        get() {
            println("Name is $field")
            return field
        }
        set(value) {
            println("Name is set to $value")
            field = value
        }
    
    val isAdult: Boolean
        get() = age >= 20
}
```
객체의 속성을 나타내는 것이라면 Custom Getter 그렇지 않으면 함수를 쓰는것을 권장

## backing field
Custom Getter와 Setter를 사용할 때에는 backing field를 사용하여 값을 저장할 수 있다.

```kotlin
class Person {
    var name: String = ""
        get() {
            println("Name is $field")
            return field
        }
        set(value) {
            println("Name is set to $value")
            field = value
        }
    
    val isAdult: Boolean
        get() = age >= 20
}
```
- backing field는 field 키워드를 사용하여 접근할 수 있다.
- backing field를 사용하는 이유는 getter와 setter에서 사용하는 변수를 다르게 하기 위해서이다.

