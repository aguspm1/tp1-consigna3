package com.tp1.consigna3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.tp1.congigna3.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.nombre)
        val etTelefono = findViewById<EditText>(R.id.telefono)
        val tvMensaje = findViewById<TextView>(R.id.mensaje)
        val Boton = findViewById<Button>(R.id.enviar)

        Boton.setOnClickListener {
            val nombre = etNombre.text.toString()
            val telefono = etTelefono.text.toString()



            if (nombre.isEmpty()) {
                Toast.makeText(this, "Ingrese un bnombre", Toast.LENGTH_SHORT).show()
            } else if (telefono.length<10 || telefono.length>10){
                Toast.makeText(this, "El telefono debe tener  ${telefono.length}", Toast.LENGTH_SHORT).show()


                } else {
                    tvMensaje.text = "Hola, $nombre, su telefono es $telefono"
                }


            }
        }
    }
