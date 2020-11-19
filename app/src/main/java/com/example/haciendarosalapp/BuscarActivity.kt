package com.example.haciendarosalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView

class BuscarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val search = findViewById<SearchView>(R.id.searchView) as SearchView

        val list = findViewById<ListView>(R.id.listView) as ListView

        val palabras = arrayOf("Mis Publicaciones", "Mis recordatorios", "Mis Pagos")

        val palabrasAdapter  : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,palabras)

        list.adapter = palabrasAdapter

        search.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                palabrasAdapter.filter.filter(newText)
                return false
            }
        })
    }
}