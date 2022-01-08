package com.example.nesnetabanliprogramlama.bolum1

class Fonksiyonlar {
    //void
    fun selamla() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return
    fun selamla2(): String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    //Parametreli
    fun selamla3(isim:String): String {
        val sonuc = "Merhaba $isim"
        return sonuc
    }
    fun toplama(){
        val toplam = 10 + 20
        println("Toplam : $toplam")
    }
    fun toplama2():Int{
        val toplam = 10 + 20
        return toplam
    }
}