package com.example.nesnetabanliprogramlama.collections

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")   //0. index
    meyveler.add("Muz")   //1. index
    meyveler.add("Kiraz") //2. index

    println(meyveler.toString())

    meyveler[1] = "Yeni Muz"
    println(meyveler.toString())

    meyveler.add(1,"Portakal")
    println(meyveler.toString())

    //Okuma İşlemi
   println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")
    println("Boş mu ? : ${meyveler.isEmpty()}")
    println("İçeriyor mu ? : ${meyveler.contains("Kiraz")}")

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler ){
        println("Sonuç 1 : $meyve")
    }
    for ((index,meyve) in meyveler.withIndex() ){
        println(" $index. -> : $meyve")
    }
    //Silme İşlemi
    meyveler.removeAt(2)
    println(meyveler)

    //İçeriği temizleme
    meyveler.clear()
    println(meyveler)



}