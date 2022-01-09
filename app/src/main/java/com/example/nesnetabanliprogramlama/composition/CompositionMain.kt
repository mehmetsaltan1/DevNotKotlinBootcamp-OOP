package com.example.nesnetabanliprogramlama.composition

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val y2 = Yonetmenler(2,"Quentin Tarantino")
    val f1 = Filmler(1,"Django",2013,k1,y2)
    println("Film id : ${f1.film_id}")
    println("Film Adı : ${f1.film_ad}")
    println("Film Yılı : ${f1.film_yil}")
    println("Film Kategori : ${f1.kategori.kategori_ad}")
    println("Film Yonetmen : ${f1.yonetmen.yonetmen_ad}")

}