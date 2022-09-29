package com.example.multipleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.NumberPicker

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun PersonalAdministration(view: View) {
        var intent = Intent(applicationContext,PersonalAdministration::class.java)
        startActivity(intent)
    }
    fun BasicCalculator(view: View) {
        var intent = Intent(applicationContext,BasicCalculator::class.java)
        startActivity(intent)
    }
    fun AdvancedCalculator(view: View) {
        var intent = Intent(applicationContext,AdvancedCalculator::class.java)
        startActivity(intent)
    }


}