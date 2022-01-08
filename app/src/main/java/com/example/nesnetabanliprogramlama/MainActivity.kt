package com.example.nesnetabanliprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var str:String
    //Lateinit her zaman var ile kullanılır val ile kullanılamaz
    //lateinit var sayi:Int lateiniti primitiv tip değişkenlerde kullanamayız
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}