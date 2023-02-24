package com.moody.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.moody.peliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cambiarPantalla(view: View) {

        val intent = Intent(this, MainActivity2::class.java);
        startActivity(intent)
    }

    fun cambiarPantalla2(view: View) {

        val intent = Intent(this, MainActivity3::class.java);
        startActivity(intent)

    }
    fun cambiarpantalla3(view: View) {

        val intent = Intent(this, MainActivity4::class.java);
        startActivity(intent)
    }
    fun cambiarpantalla4(view: View) {

        val intent = Intent(this, MainActivity5::class.java);
        startActivity(intent)
    }
    fun cambiarpantalla5(view: View) {

        val intent = Intent(this, MainActivity6::class.java);
        startActivity(intent)
    }
}