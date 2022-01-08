package com.example.nesnetabanliprogramlama.bolum1

fun main() {
    val bmw = Araba("Kırmızı",0,false)
    //Okuma işlemi
    bmw.bilgiAl()

    bmw.hiz=10
    bmw.calisiyorMu=true
    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()

    val sahin=Araba("Beyaz",100,true)
   sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.hizlan(50)
    sahin.bilgiAl()
    sahin.yavasla(50)
    sahin.bilgiAl()
}