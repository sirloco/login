package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val Usuario = "usuario"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blogin.setOnClickListener { enviar() }
    }

    private fun enviar() {

        if(etPassword.text.toString() == "12345Abcde"){

            val envio = Intent(this,santimola::class.java)
            envio.putExtra("usuario", etNombre.text.toString())
            startActivity(envio)

        }else{
            Toast.makeText(this,"Contraseña incorrecta",Toast.LENGTH_LONG).show()
        }
    }
}