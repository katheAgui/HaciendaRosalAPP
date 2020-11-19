package com.example.haciendarosalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PagosActivity : AppCompatActivity() {

    lateinit var parqueadero : EditText
    lateinit var admin : EditText
    lateinit var abonar : EditText
    lateinit var resul : EditText
    lateinit var resultado : TextView
    lateinit var btnCalc : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagos)


        parqueadero = findViewById(R.id.parqueadero)
        admin = findViewById(R.id.admin)
        abonar = findViewById(R.id.abonar)
        resul = findViewById(R.id.resul)
        resultado = findViewById(R.id.resultado)
        btnCalc = findViewById(R.id.calcular)

        btnCalc.setOnClickListener {
            calcularPagos()
        }

    }

    private fun calcularPagos(){

        if (TextUtils.isEmpty(parqueadero.text.toString()))
        {
            parqueadero.error="tiene que ingrasar valor"
            return
        }
        if (TextUtils.isEmpty(admin.text.toString()))
        {
            admin.error="tiene que ingrasar valor"
            return
        }
        if (TextUtils.isEmpty(abonar.text.toString()))
        {
            abonar.error="tiene que ingrasar valor"
            return
        }
        if (TextUtils.isEmpty(resul.text.toString()))
        {
            resul.error="resultado"
            return
        }


        val p = parqueadero.text.toString().toDouble()
        val a = abonar.text.toString().toDouble()
        val r = resul.text.toString().toDouble()
        val valh = resultado

        val calc = p+a+r
        resultado.text = "resultado de pagos a la adiministracion: "+calc.toInt().toString()+" pesos"
    }
}