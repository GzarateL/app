package com.weissoft.naveapp.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.weissoft.naveapp.MainActivity // Reemplaza por el nombre correcto si es necesario
import com.weissoft.naveapp.R

class SplashActivity : AppCompatActivity() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Observa cuando el ViewModel indique que es hora de navegar
        viewModel.navigateToMain.observe(this, Observer { navigate ->
            if (navigate) {
                startActivity(Intent(this, MainActivity::class.java)) // Usa tu MainActivity existente
                finish() // Finaliza la SplashActivity para que no vuelva a mostrarse
            }
        })
    }
}

