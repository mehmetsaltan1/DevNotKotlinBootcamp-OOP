package com.example.nesnetabanliprogramlama.interfacex

class ClassA : Interface1 {
    override var degisken: Int = 10

    override fun metod1() {
        println("Metod1 Çalıştı")
    }

    override fun metod2(): String {
        return  "Metod2 Çalıştı"
    }
}