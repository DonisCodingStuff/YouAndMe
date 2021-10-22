package com.ecoapp.youandme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Token: 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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Wähle ein Datum"

        button.setOnClickListener{
            button.text = "has clicked"
        }

        calendarView.setOnDateChangeListener { calendarView, i, i2, i3 -> button.text = i.toString() + " " + i2.toString() + " " + i3.toString()}
    }
}