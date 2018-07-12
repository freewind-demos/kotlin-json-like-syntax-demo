package example

class Hello
data class User(var name: String? = null, var words: String? = null)

operator fun Hello.invoke(config: User.() -> Unit) {
    val user = User()
    config(user)
    println("Hello, ${user.name}, ${user.words}!")
}

private val hello = Hello()

fun main(args: Array<String>) {
    hello {
        name = "Kotlin"
        words = "you have good syntax"
    }
}
