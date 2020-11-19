package com.example.haciendarosalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listView = findViewById<ListView>(R.id.list)
        val custom_list_data = ArrayList<Lista>()

        custom_list_data.add(Lista(R.drawable.nuevap, "nueva publicacion", "nueva publicacion"))
        custom_list_data.add(Lista(R.drawable.recordatorio, "Diccionario", "Diccionario"))
        custom_list_data.add(Lista(R.drawable.pagos, "calculadora", "Calculadora"))

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                Toast.makeText(this@HomeActivity, " elemento clikeado:- $id", Toast.LENGTH_SHORT)
                    .show()
                if (position == 0)
                {
                    val myIntent = Intent(this, MisPublicaciones::class.java)
                    startActivity(myIntent)
                }
                if (position == 1)
                {
                    val myIntent = Intent(this, RecordarActivity::class.java)
                    startActivity(myIntent)
                }
                if (position == 2)
                {
                    val myIntent = Intent(this, PagosActivity::class.java)
                    startActivity(myIntent)

                }
            }
    }

}