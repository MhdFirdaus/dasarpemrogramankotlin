fun main(args: Array<String>) {
    println("Contoh kode program menggunakan tipe data bilangan bulat:")
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)

    println("----------------")
    println("Contoh kode program menggunakan tipe data bilangan decimal (floating-point):")
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.123456789

    println("maxFloat:" + maxFloat)
    println("maxDouble:" + maxDouble)

    println("-------------------")
    println("Contoh kode program menggunakan literal konstan:")
    val floatLiteral : Float = 178.95F //Literal Float
    println("Contoh Literal Float : " + floatLiteral)
    val oneBillion: Long = 1000000000L //Literal Long
    println("Contoh Literal Long : " + oneBillion)
    val valHeksa = 0x0F //Literal heksadesimal diawali dengan 0x
    println("Contoh Literal Heksadesimal : " + valHeksa)
    val valBinary = 0b00001011 //Literal binary diawali dengan 0b
    println("Contoh Literal Binary : " + valBinary)
    val notasiKonvensional = 123.5e10
    println("Contoh Literal Konvensional Floating Point Number : " + notasiKonvensional)

    println("-------------------")
    println("Underscore dalam Literal")
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
        println("oneMillion = " + oneMillion)
        println("creditCardNumber = " + creditCardNumber)
        println("socialSecurityNumber = " + socialSecurityNumber)
        println("hexBytes = " + hexBytes)
        println("bytes = " + bytes)

    println("-------------------")
    println("Representasi")
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a : " + (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA ===
            anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "
            + (boxedA == anotherBoxedA))

    println("-------------------")
    println("Konversi Eksplisit")
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)

    println("-------------------")
    println("contoh Char")
    //Karakter di Kotlin ditandai dengan memberikan single quotes pada nilai sebuah variabel.
    //Karakter di Kotlin tidak bisa diperlakukan secara langsung sebagai Number.
    var charA : Char = 'A'
    ///println(charA == 65)

    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)

    println("-------------------")
    println("Penerapan Konversi Eksplisit pada Char")
    //ASCII value
    var c: Char // character
    var i: Int // ordinal (ASCII) value of the character
    // conversion from text to ASCII value
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")
    // conversion from an ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")

    println("-------------------")
    println("Boolean (true or false)")
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)
    //Tambahkan kode berikut dalam program dan perhatikan hasilnya:
    /*var varInt : Int = 1
    if(varInt)
        println("varInt bernilai " + varInt)*/

    println("-------------------")
    println("String (Array of Character)")
    val myName: String = "Muhammad Firdaus"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +,
    val s = "abc" + 1
    println(s + "def")
    //Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    //raw String yang dipisahkan dengan triple quotes (""").
    var text = """
        for (c in "foo")
            print(c)
               """
    println(text)

    //Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String
    var teks = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(teks)

    println("-------------------")
    println("String Templates")
    val e = 7
    val f = 8
    val g = e + f
    val h = "When we add $e and $f, we get $g"
    println(h)
    println("When we add $e and $f, we get ${e + f}")
    val price = """
    ${'$'}9.99
    """
    println(price)

    println("-------------------")
    println("Fungsi Anggota pada String")
    val j = "Rhinopotamus"
    println(j.startsWith("rhin"))
    println(j.endsWith("tamus"))
    println(j.contains("pot"))
    println(j.contains("lol"))
    //toUpperCase() and toLowerCase()
    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))
    //replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")
    //substring()
    println("I would not banish all of these Internets.".substring(2, 7))
    //compareTo()
    println("alpha".compareTo("bravo"))

    println("-------------------")
    println("Penerapan String")
    // Character occurrence in a sentence analysis
    // the string that we want to analyze
    var k = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(k)
    k = k.toLowerCase()
    // counters initialization
    var vowelCount = 0
    var consonantCount = 0
    // definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
    // main loop
    for (c in k) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${k.length - (vowelCount + consonantCount)}")


    println("-------------------")
    println("Program Caesar Chiper")
    //The Caesar cipher
    // variable initialization
    val l = "blackholesarewheregoddividedbyzero"
    println("Original message: $l")
    var message = ""
    var shift = 1
    // loop iterating over characters
    for (c in l) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }
    // printing
    println("Encrypted message: $message")

    println("-------------------")
    println("Program Sandi Morse")
    // split() and joinToString()
    // Morse code decoder
    // the string which we want to decode
    val m = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $m")
    // the string with the decoded message
    var pesan = ""
    // array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    // splitting the string into Morse characters
        val characters = m.split(" ")
    // iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
    // character was found
        if (index != -1) {
            pesan += alphabetChars[index]
        }
    }
    println("The decoded message: $pesan")
}