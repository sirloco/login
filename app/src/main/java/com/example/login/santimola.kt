package com.example.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.MainActivity.Companion.Usuario
import kotlinx.android.synthetic.main.activity_santimola.*

class santimola : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_santimola)

        val nombre = try {intent.getStringExtra(Usuario)}catch (E:Exception){"error"}
        tvBienbenida.text="Hola " + nombre
    }
}
