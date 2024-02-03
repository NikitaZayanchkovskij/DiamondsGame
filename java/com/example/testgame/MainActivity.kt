package com.example.testgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testgame.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonOpenGameSceneActivity()
        buttonsSettingsAndPrivacyPolicy()
    }


    private fun buttonOpenGameSceneActivity() = with(binding) {

        btPlay.setOnClickListener {
            startActivity(Intent(this@MainActivity, GameSceneActivity::class.java))
            finish()
        }
    }


    private fun buttonsSettingsAndPrivacyPolicy() = with(binding) {

        imSettings.setOnClickListener {
            Toast.makeText(
                this@MainActivity, "Settings button pressed", Toast.LENGTH_SHORT).show()
        }

        imPrivacyPolicyLock.setOnClickListener {
            Toast.makeText(
                this@MainActivity, "Privacy policy button pressed", Toast.LENGTH_SHORT).show()
        }
    }


}