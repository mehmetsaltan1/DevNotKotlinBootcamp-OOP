package com.example.nesnetabanliprogramlama.collections

fun main() {
    val iller = HashMap<Int,String>()
    iller.put(34,"istanbul")
    iller.put(56,"Siirt")
    iller[21] = "Diyarbakır"
    println(iller.toString())
    println(iller.get(21))

    for ((anahtar,deger)in iller){
        println("Key : $anahtar , Deger : $deger")
    }

}