package com.summerbreeze11.gpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.summerbreeze11.gpstracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottonNavClick()
    }

    private fun onBottonNavClick() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()
                }
                R.id.id_tracks -> {

                }
                R.id.id_settings -> {

                }
            }
            true
        }
    }
}