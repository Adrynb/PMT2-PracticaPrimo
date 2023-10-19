package com.example.pmt2_practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pmt2_practica1.R.id.buttonPrimo

class numPrimo : AppCompatActivity() {

    lateinit var botonVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num_primo)

        botonVolver = findViewById(R.id.buttonVolver)
        botonVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

     fun cal_primos(n:Int):ArrayList<Int>{
        var elementos = ArrayList<Int>()

        for(i in 1  ..  n){
            if(esPrimo(i, i-1)){
                elementos.add(i)
            }
        }

        return elementos
    }

    private fun esPrimo(n: Int, divisor: Int): Boolean {
        if (divisor <= 1) {
            return true
        } else if (n % divisor == 0) {
            return false
        } else {
            return esPrimo(n, divisor - 1)
        }
    }

}