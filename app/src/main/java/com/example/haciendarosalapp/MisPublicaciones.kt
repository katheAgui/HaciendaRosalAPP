package com.example.haciendarosalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mis_publicaciones.*

class MisPublicaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        button.setOnClickListener {
            finish()

            fun Calc(view: View) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_mis_publicaciones)
                val publicar: Float
                val p = findViewById<EditText>(R.id.publi) as EditText
                val result: Float
                if (TextUtils.isEmpty(p.text.toString())) {
                    p.error = "Ingrese su queja sugerencia o peticion a publicar"
                    return
                } else {
                    publicar = p.text.toString().toFloat()
                }
                when (view.id) {
                    R.id.add -> {
                        result = publicar
                    }
                }
            }

        }
    }
}