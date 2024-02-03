package com.example.testgame

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Calendar


object TimeFormatter {

    @SuppressLint("SimpleDateFormat")
    val formatter = SimpleDateFormat("mm:ss")


    fun convertTime(time: Long): String {
        val timeToShow = 3_600_000 - time
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timeToShow
        return formatter.format(calendar.time)
    }

    fun getPassedTime(time: Long): Long {
        val timePassed = 3_600_000 - time
        return timePassed
    }


}