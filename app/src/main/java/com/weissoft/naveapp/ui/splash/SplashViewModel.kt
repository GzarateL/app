package com.weissoft.naveapp.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    private val _navigateToMain = MutableLiveData<Boolean>()
    val navigateToMain: LiveData<Boolean> get() = _navigateToMain

    init {
        // Inicia un temporizador de 3 segundos para pasar a la siguiente pantalla
        viewModelScope.launch {
            delay(3000) // Espera 3 segundos
            _navigateToMain.value = true
        }
    }
}
