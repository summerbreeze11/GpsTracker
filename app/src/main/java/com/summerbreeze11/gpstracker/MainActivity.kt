package com.summerbreeze11.gpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.summerbreeze11.gpstracker.databinding.ActivityMainBinding
import com.summerbreeze11.gpstracker.fragments.MainFragment
import com.summerbreeze11.gpstracker.fragments.SettingsFragment
import com.summerbreeze11.gpstracker.fragments.TracksFragment
import com.summerbreeze11.gpstracker.utils.openFragment
import com.summerbreeze11.gpstracker.utils.showToast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottonNavClick()
        openFragment(MainFragment.newInstance())
    }

    private fun onBottonNavClick() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home -> {
                    openFragment(MainFragment.newInstance())
                }
                R.id.id_tracks -> {
                    openFragment(TracksFragment.newInstance())
                }
                R.id.id_settings -> {
                    openFragment(SettingsFragment.newInstance())
                }
            }
            true
        }
    }
}