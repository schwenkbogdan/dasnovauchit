class Person(
    val name: String,
    val age: Int,
    val city: String,
    val weight: Int
) {
    public final fun whoami() {
        println(name)
    }

    val weightInKgs: Double
        get() = weight / 2.2

    //private  val balance = TODO()
}