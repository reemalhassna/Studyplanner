package com.example.lecture8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.lecture8.ui.theme.Lecture8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createReminderChannel(this)
        scheduleDailyReminder(this)
        enableEdgeToEdge()
        setContent {
            Lecture8Theme {
                TodayRoute()
            }
        }
    }
}