package com.example.nesnetabanliprogramlama.bolum1

fun main() {

    val f = Fonksiyonlar()
    f.selamla()
    val gelenDeger = f.selamla2()
    println("Sonuç : $gelenDeger")
    println("Sonuç : ${f.selamla3("Mehmet")}")
    f.toplama()
    val gelenDeger2 = f.toplama2()
    println("Gelen Toplam : $gelenDeger2")

}