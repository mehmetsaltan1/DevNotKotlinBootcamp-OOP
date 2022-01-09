package com.example.nesnetabanliprogramlama.collections

fun main() {
    val meyveler = HashSet<String>()
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler.toString())
    meyveler.add("Amasya Elması")
    println(meyveler.toString())
    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler){
        println("Sonuç : $m")
    }
    //Silme
    meyveler.remove("Kiraz")
    println(meyveler)
    meyveler.clear()
    println(meyveler)
}