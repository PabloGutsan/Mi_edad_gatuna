package com.example.miedadgatuna

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.miedadgatuna.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val ageString : String = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt : Int = ageString.toInt()
                val result : Int = (ageInt - 2) * 4 + 24
                binding.resultText.text = getString(R.string.result_text, result)
            } else {

                Log.d("MainActivity", "Age string is empty")
                Toast.makeText(this,R.string.you_must_insert_you_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
