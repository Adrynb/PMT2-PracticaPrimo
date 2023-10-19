package com.example.pmt2_practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var ANB: Int = 0;
    lateinit var buttonPrimo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ANB = 0

        Log.i("Estados", "Creando la actividad: " + ANB)
        Log.i("Estados", "Evento onCreate: " + ANB)
        setContentView(R.layout.activity_main)

        buttonPrimo = findViewById(R.id.buttonPrimo)

        buttonPrimo.setOnClickListener {
            val numPrimoActivity = numPrimo()
            val numero = 9
            val resultados = numPrimoActivity.cal_primos(numero)

            Log.d("MainActivity", "Números primos: $resultados")
        }


    }

    override fun onStart() {
        super.onStart()
        ANB++
        Log.i("Estados", "Evento onStart: " + ANB)
    }

    override fun onResume() {
        super.onResume()
        ANB++
        Log.i("Estados", "Evento onResume: " + ANB)
    }

    override fun onStop() {
        super.onStop()
        ANB++
        Log.i("Estados", "Evento onStop: " + ANB)
    }

    override fun onDestroy() {
        super.onDestroy()
        ANB++
        Log.i("Estados", "Evento onDestroy: " + ANB)
    }

}