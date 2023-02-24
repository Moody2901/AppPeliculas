package com.moody.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.moody.peliculas.databinding.ActivityMain5Binding
import com.moody.peliculas.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun Regresaralmenu(view: View) {

        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent)
    }
}