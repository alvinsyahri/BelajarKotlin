fun main() {
    var age: Int = 21
    var sample: Float = 18.18F

//    println(age)
//    println(sample)

    var binary: Int = 0b010101001
    var hexadecimal: Int = 0xFF

//    println(binary)
//    println(hexadecimal)

    var price: Long = 900_000_000

//    println(price)

    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    //hati hati dalam mengonversi bilangan yang nilainya lebih tinggi
    // dari jumlah yang sanggup di baca oleh tipe data int karena bisa terjadi overflow
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(number)
    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)

}