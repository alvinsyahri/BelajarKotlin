fun main() {
    var firstName: String = "Alvin"
    var lastName: String = "Syahri"
    var address1: String = """ 
       |ini adalah jalan belum jadi rt 01 01
       |kabupaten lhokseumawe aceh indonesia
        """.trimMargin()
    var address2: String = """ 
       >ini adalah jalan belum jadi rt 01 01
       >kabupaten lhokseumawe aceh indonesia
        """.trimMargin(marginPrefix = ">")

//    println
//    println(lastName)
//    println(address1)
//    println(address2)

//    var fullName: String = firstName + " " + lastName

//    println(fullName)

    var fullName: String = "$firstName $lastName"
    var desc: String = "total $fullName char= ${fullName.length}"
    
    println(fullName)
    println(desc)

}