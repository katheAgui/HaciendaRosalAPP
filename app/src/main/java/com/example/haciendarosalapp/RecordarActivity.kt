package com.example.haciendarosalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class RecordarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recordar)

        val date = findViewById<DatePicker>(R.id.datePick) as DatePicker

        val calender : Calendar = Calendar.getInstance()

        date.init(calender.get(Calendar.YEAR), calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH), { view, year, monthOfYear, dayOfMonth ->
            Toast.makeText(applicationContext,"#"+date.dayOfMonth +"-"+date.month+"-"+date.year+" #",
                Toast.LENGTH_SHORT).show()
        })
    }
}