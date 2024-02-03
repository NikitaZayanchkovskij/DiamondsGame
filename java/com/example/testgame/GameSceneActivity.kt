package com.example.testgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testgame.databinding.GameSceneBinding

const val COUNT_DOWN_TIME_1 = 3_600_000L   /* Это время час (60 минут) в миллисекундах. */
const val COUNT_DOWN_TIME_2 = 300L

class GameSceneActivity: AppCompatActivity() {
    private lateinit var binding: GameSceneBinding
    private lateinit var timer1: CountDownTimer
    private lateinit var timer2: CountDownTimer

    private var amountOfDiamondsPressed = 0
    private var amountOfTimePassed: Long = 0
    private var coinsLeft = 100

    private var firstDiamondWasPressed = false
    private var secondDiamondWasPressed = false
    private var thirdDiamondWasPressed = false
    private var fourthDiamondWasPressed = false
    private var fifthDiamondWasPressed = false
    private var sixthDiamondWasPressed = false
    private var seventhDiamondWasPressed = false
    private var eighthDiamondWasPressed = false
    private var ninthDiamondWasPressed = false
    private var tenthDiamondWasPressed = false
    private var eleventhDiamondWasPressed = false
    private var twelfthDiamondWasPressed = false
    private var thirteenthDiamondWasPressed = false
    private var fourteenthDiamondWasPressed = false
    private var fifteenthDiamondWasPressed = false
    private var sixteenthDiamondWasPressed = false
    private var seventeenthDiamondWasPressed = false
    private var eighteenthDiamondWasPressed = false
    private var nineteenthDiamondWasPressed = false
    private var twentiethDiamondWasPressed = false

    private var firstPairFound = false
    private var secondPairFound = false
    private var thirdPairFound = false
    private var fourthPairFound = false
    private var fifthPairFound = false
    private var sixthPairFound = false
    private var seventhPairFound = false
    private var eighthPairFound = false
    private var ninthPairFound = false
    private var tenthPairFound = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = GameSceneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startTimer1()
        startTimer2()
        diamondButtons()
    }


    private fun startTimer1() {

        timer1 = object: CountDownTimer(COUNT_DOWN_TIME_1, 1000) {

            override fun onTick(timeLeft: Long) {
                binding.tvTimer.text = TimeFormatter.convertTime(timeLeft)
                amountOfTimePassed = TimeFormatter.getPassedTime(timeLeft)
                checkHowManyCoinsLeft(amountOfTimePassed)
            }

            override fun onFinish() {
                Toast.makeText(this@GameSceneActivity,
                    "Time is over! Please, try again!", Toast.LENGTH_LONG).show()
            }
        }.start()
    }


    private fun checkHowManyCoinsLeft(amountOfTimePassed: Long) {
        if (amountOfTimePassed > 20000) {
            if (coinsLeft > 10) {
                coinsLeft = coinsLeft - 5
                binding.tvCoinsGameScreen.text = coinsLeft.toString()
            }
        }
    }


    private fun startTimer2() {

        timer2 = object: CountDownTimer(COUNT_DOWN_TIME_2, 1000) {

            override fun onTick(timeLeft: Long) {}

            override fun onFinish() {
                checkIfPairWasFound()
            }
        }.start()
    }


    private fun diamondButtons() = with(binding) {

        /* 1 пара. */
        cardView1.setOnClickListener {
            showImageView(im1)
            firstDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView11.setOnClickListener {
            showImageView(im11)
            eleventhDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 2 пара. */
        cardView2.setOnClickListener {
            showImageView(im2)
            secondDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView12.setOnClickListener {
            showImageView(im12)
            twelfthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 3 пара. */
        cardView3.setOnClickListener {
            showImageView(im3)
            thirdDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView13.setOnClickListener {
            showImageView(im13)
            thirteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 4 пара. */
        cardView4.setOnClickListener {
            showImageView(im4)
            fourthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView16.setOnClickListener {
            showImageView(im16)
            sixteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 5 пара. */
        cardView5.setOnClickListener {
            showImageView(im5)
            fifthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView20.setOnClickListener {
            showImageView(im20)
            twentiethDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 6 пара. */
        cardView6.setOnClickListener {
            showImageView(im6)
            sixthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView15.setOnClickListener {
            showImageView(im15)
            fifteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 7 пара. */
        cardView7.setOnClickListener {
            showImageView(im7)
            seventhDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView18.setOnClickListener {
            showImageView(im18)
            eighteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 8 пара. */
        cardView8.setOnClickListener {
            showImageView(im8)
            eighthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView14.setOnClickListener {
            showImageView(im14)
            fourteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 9 пара. */
        cardView9.setOnClickListener {
            showImageView(im9)
            ninthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView19.setOnClickListener {
            showImageView(im19)
            nineteenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }

        /* 10 пара. */
        cardView10.setOnClickListener {
            showImageView(im10)
            tenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
        cardView17.setOnClickListener {
            showImageView(im17)
            seventeenthDiamondWasPressed = true
            amountOfDiamondsPressed++
            startTimer2()
        }
    }


    private fun showImageView(imageView: ImageView) {
        imageView.visibility = View.VISIBLE
    }


    private fun checkIfPairWasFound() {

        if (amountOfDiamondsPressed == 2) {
            amountOfDiamondsPressed = 0

            /* 1 пара. */
            if (firstDiamondWasPressed == true && eleventhDiamondWasPressed == true) {
                firstPairFound = true
            } else {
                firstDiamondWasPressed = false
                eleventhDiamondWasPressed = false
                binding.im1.visibility = View.INVISIBLE
                binding.im11.visibility = View.INVISIBLE
            }

            /* 2 пара. */
            if (secondDiamondWasPressed == true && twelfthDiamondWasPressed == true) {
                secondPairFound = true
            } else {
                secondDiamondWasPressed = false
                twelfthDiamondWasPressed = false
                binding.im2.visibility = View.INVISIBLE
                binding.im12.visibility = View.INVISIBLE
            }

            /* 3 пара. */
            if (thirdDiamondWasPressed == true && thirteenthDiamondWasPressed == true) {
                thirdPairFound = true
            } else {
                thirdDiamondWasPressed = false
                thirteenthDiamondWasPressed = false
                binding.im3.visibility = View.INVISIBLE
                binding.im13.visibility = View.INVISIBLE
            }

            /* 4 пара. */
            if (fourthDiamondWasPressed == true && sixteenthDiamondWasPressed == true) {
                fourthPairFound = true
            } else {
                fourthDiamondWasPressed = false
                sixteenthDiamondWasPressed = false
                binding.im4.visibility = View.INVISIBLE
                binding.im16.visibility = View.INVISIBLE
            }

            /* 5 пара. */
            if (fifthDiamondWasPressed == true && twentiethDiamondWasPressed == true) {
                fifthPairFound = true
            } else {
                fifthDiamondWasPressed = false
                twentiethDiamondWasPressed = false
                binding.im5.visibility = View.INVISIBLE
                binding.im20.visibility = View.INVISIBLE
            }

            /* 6 пара. */
            if (sixthDiamondWasPressed == true && fifteenthDiamondWasPressed == true) {
                sixthPairFound = true
            } else {
                sixthDiamondWasPressed = false
                fifteenthDiamondWasPressed = false
                binding.im6.visibility = View.INVISIBLE
                binding.im15.visibility = View.INVISIBLE
            }

            /* 7 пара. */
            if (seventhDiamondWasPressed == true && eighteenthDiamondWasPressed == true) {
                seventhPairFound = true
            } else {
                seventhDiamondWasPressed = false
                eighteenthDiamondWasPressed = false
                binding.im7.visibility = View.INVISIBLE
                binding.im18.visibility = View.INVISIBLE
            }

            /* 8 пара. */
            if (eighthDiamondWasPressed == true && fourteenthDiamondWasPressed == true) {
                eighthPairFound = true
            } else {
                eighthDiamondWasPressed = false
                fourteenthDiamondWasPressed = false
                binding.im8.visibility = View.INVISIBLE
                binding.im14.visibility = View.INVISIBLE
            }

            /* 9 пара. */
            if (ninthDiamondWasPressed == true && nineteenthDiamondWasPressed == true) {
                ninthPairFound = true
            } else {
                ninthDiamondWasPressed = false
                nineteenthDiamondWasPressed = false
                binding.im9.visibility = View.INVISIBLE
                binding.im19.visibility = View.INVISIBLE
            }

            /* 10 пара. */
            if (tenthDiamondWasPressed == true && seventeenthDiamondWasPressed == true) {
                tenthPairFound = true
            } else {
                tenthDiamondWasPressed = false
                seventeenthDiamondWasPressed = false
                binding.im10.visibility = View.INVISIBLE
                binding.im17.visibility = View.INVISIBLE
            }
        }

        /* Если все пары найдены - открываем экран с поздравляшками. */
        if (firstPairFound == true && secondPairFound == true && thirdPairFound == true
            && fourthPairFound == true && fifthPairFound == true && sixthPairFound == true
            && seventhPairFound == true && eighthPairFound == true
            && ninthPairFound == true && tenthPairFound == true) {

            timer1.cancel()

            val intent = Intent(this, EndGameActivity::class.java)
            intent.putExtra("coins_left", coinsLeft.toString())

            startActivity(intent)
            finish()
        }
    }


    override fun onStop() {
        super.onStop()
        timer1.cancel()
        timer2.cancel()
    }


}