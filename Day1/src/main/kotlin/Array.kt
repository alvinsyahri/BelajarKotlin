fun main() {
    val members: Array<String> = arrayOf("Alvin", "Syahri", "Bin")
    val values: Array<Byte> = arrayOf(100, 90, 5)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(members)
    println(values.size)
    println(values[0])
    values.set(0, 110)
    println(values[0])
    values[0] = 90
    println(values.get(0))

    val names: Array<String?> = arrayOfNulls(size = 5)
    names.set(0, "Alvin")
    names.set(1, null)
    names.set(2, "Syahri")
    names.set(3, null)
    names.set(4, "Bin")
}