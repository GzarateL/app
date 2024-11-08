package com.weissoft.naveapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_dashboard)

        // Obtener el TextView para mostrar la hora
        val textViewGreeting = findViewById<TextView>(R.id.textViewGreeting)

        // Obtener la hora actual
        val currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())

        // Asignar la hora actual al TextView
        textViewGreeting.text = "Hora actual: $currentTime"

        // Botón de la cámara de día
        val buttonDayCamera = findViewById<ImageButton>(R.id.buttonDayCamera)
        buttonDayCamera.setOnClickListener {
            Toast.makeText(this, "Cámara de Día Activada", Toast.LENGTH_SHORT).show()
        }

        // Botón de la cámara de noche
        val buttonNightCamera = findViewById<ImageButton>(R.id.buttonNightCamera)
        buttonNightCamera.setOnClickListener {
            Toast.makeText(this, "Cámara de Noche Activada", Toast.LENGTH_SHORT).show()
        }
    }
}


