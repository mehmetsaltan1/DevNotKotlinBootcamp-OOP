package com.example.nesnetabanliprogramlama.collections

fun main() {
    val o1 = Ogrenciler(200,"Zeynep","9C")
    val o2 = Ogrenciler(300,"Ahmet","11Z")
    val o3 = Ogrenciler(100,"Beyza","12A")
    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)
   for (ogrenci in ogrencilerListesi){
       println("No : ${ogrenci.no}, Adı : ${ogrenci.adi}, Sınıfı : ${ogrenci.sinifi}")
   }
    println("Sayısal : Küçükten -> Büyüğe")
  val siralama1 = ogrencilerListesi.sortedWith(compareBy({it.no}))
    for (ogrenci in siralama1){
        println("No : ${ogrenci.no}, Adı : ${ogrenci.adi}, Sınıfı : ${ogrenci.sinifi}")
    }

    println("Sayısal : Büyükten -> Küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending({it.no}))
    for (ogrenci in siralama2){
        println("No : ${ogrenci.no}, Adı : ${ogrenci.adi}, Sınıfı : ${ogrenci.sinifi}")
    }

    println("Harfsel : Küçükten -> Büyüğe")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy({it.adi}))
    for (ogrenci in siralama3){
        println("No : ${ogrenci.no}, Adı : ${ogrenci.adi}, Sınıfı : ${ogrenci.sinifi}")
    }
    println("Harfsel : Büyükten -> Küçüğe")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending({it.adi}))
    for (ogrenci in siralama4){
        println("No : ${ogrenci.no}, Adı : ${ogrenci.adi}, Sınıfı : ${ogrenci.sinifi}")
    }
}