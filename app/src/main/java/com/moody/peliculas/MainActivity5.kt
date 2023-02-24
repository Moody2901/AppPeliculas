package com.moody.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.moody.peliculas.databinding.ActivityMain4Binding
import com.moody.peliculas.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun Regresaralmenu(view: View) {

        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent)
    }
}