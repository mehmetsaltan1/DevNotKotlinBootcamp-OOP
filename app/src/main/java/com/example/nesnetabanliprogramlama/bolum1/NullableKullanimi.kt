package com.example.nesnetabanliprogramlama.bolum1

fun main() {
    var str1:String? = null
   str1="Merhaba "
    //Yöntem 1
    println("Sonuç 1 : ${str1?.trim()}")
    //Yöntem 2
    //println("Sonuç 2 : ${str1!!.trim()}")
    //Yöntem 3
    if (str1!=null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("Sonuç nulldur")

    }

}