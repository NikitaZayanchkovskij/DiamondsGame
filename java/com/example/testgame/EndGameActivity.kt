package com.example.testgame

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testgame.databinding.EndGameScreenBinding


class EndGameActivity: AppCompatActivity() {
    private lateinit var binding: EndGameScreenBinding
    private var coinsLeft = ""
    private var rewardWasDoubled = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EndGameScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons()
        receiveDataFromGameScreenActivity()
    }


    private fun receiveDataFromGameScreenActivity() {
        coinsLeft = intent.getStringExtra("coins_left")!!
        binding.tvCoinsEndGame.text = coinsLeft
    }


    private fun buttons() = with(binding) {

        btDoubleReward.setOnClickListener {

            if (rewardWasDoubled == false) {
                coinsLeft = (coinsLeft.toInt() * 2).toString()
                binding.tvCoinsEndGame.text = coinsLeft
                rewardWasDoubled = true
            } else {
                Toast.makeText(this@EndGameActivity,
                    "You have already doubled your reward!", Toast.LENGTH_SHORT).show()
            }
        }

        cardViewHome.setOnClickListener {
            startActivity(Intent(this@EndGameActivity, MainActivity::class.java))
            finish()
        }
    }


}