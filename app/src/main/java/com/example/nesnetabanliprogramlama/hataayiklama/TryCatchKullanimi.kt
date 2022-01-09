package com.example.nesnetabanliprogramlama.hataayiklama

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val x = 10
    val y = 5
    val dizi = Array<Int>(2){0}

    try {
        println("Sonuç : ${x/y}")
        println("İşlem Tamam")
        dizi[3]=9
    }catch (e:Exception){
        if (e is ArrayIndexOutOfBoundsException)
        println("Dizinin Boyutunu Aştınız")
        else{
            println("Aritmetik işlemde hata var")
        }
    }
/*
    catch (e:ArithmeticException){
        println("Hata : $e")
    }*/

}