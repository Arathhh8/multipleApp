package com.example.multipleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AdvancedCalculator : AppCompatActivity() {

    var operat = 0
    var num1 = 0
    var num2: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_calculator)


        var tvResultAd = findViewById<TextView>(R.id.tvResultAd)
        var btnClearAd = findViewById<Button>(R.id.btnClearAd)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btn0 = findViewById<Button>(R.id.btn0)
        var btnDivideAd = findViewById<Button>(R.id.btnDivideAd)
        var btnMultiplyAd = findViewById<Button>(R.id.btnMultiplyAd)
        var btnMinusAd = findViewById<Button>(R.id.btnMinusAd)
        var btnPlusAd = findViewById<Button>(R.id.btnPlusAd)
        var btnEqualAd = findViewById<Button>(R.id.btnEqualAd)
        var btnDotAd = findViewById<Button>(R.id.btnDotAd)

        btnEqualAd.setOnClickListener{
            when(operat){
                1 -> {
                    tvResultAd.text = (num1 / num2).toString()
                }
                2 -> {
                    tvResultAd.text = (num1 * num2).toString()
                }
                3 -> {
                    tvResultAd.text = (num1 - num2).toString()
                }
                4 -> {
                    tvResultAd.text = (num1 + num2).toString()
                }
                else ->{
                    Toast.makeText(this,"Select an operation",Toast.LENGTH_SHORT).show()
                }
            }
        }


    }


    fun btnFuntion(view: View) {

        var tvResultAd = findViewById<TextView>(R.id.tvResultAd)
        var btnClearAd = findViewById<Button>(R.id.btnClearAd)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btn0 = findViewById<Button>(R.id.btn0)
        var btnDivideAd = findViewById<Button>(R.id.btnDivideAd)
        var btnMultiplyAd = findViewById<Button>(R.id.btnMultiplyAd)
        var btnMinusAd = findViewById<Button>(R.id.btnMinusAd)
        var btnPlusAd = findViewById<Button>(R.id.btnPlusAd)
        var btnEqualAd = findViewById<Button>(R.id.btnEqualAd)
        var btnDotAd = findViewById<Button>(R.id.btnDotAd)

        var dot = ""
        var tag = view.tag

        when(tag){
            "btn1" ->{
                num1 = 1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn2" ->{
                num1 = 2
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn3" ->{
                num1 = 3
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn4" ->{
                num1 = 4
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn5" ->{
                num1 = 5
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn6" ->{
                num1 = 6
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn7" ->{
                num1 = 7
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn8" ->{
                num1 = 8
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn9" ->{
                num1 = 9
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn0" ->{
                num1 = 0
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btnDivideAd" ->{
                operat = 1
                num2 = tvResultAd.text.toString().toDouble()
                tvResultAd.text = ""
            }
            "btnMultiplyAd" ->{
                operat = 2
                num2 = tvResultAd.text.toString().toDouble()
                tvResultAd.text = ""

            }
            "btnMinusAd" ->{
                operat = 3
                num2 = tvResultAd.text.toString().toDouble()
                tvResultAd.text = ""

            }
            "btnPlusAd" -> {
                operat = 4
                num2 = tvResultAd.text.toString().toDouble()
                tvResultAd.text = ""

            }
            "btnDotAd" ->{
                dot = "."
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
        }
    }
}