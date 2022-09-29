package com.example.multipleapp

import android.annotation.SuppressLint
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
    var operatDot = 0
    var num1 = 0
    var num2: Double = 0.0
    var countDot = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_calculator)

        operat = 0


        var tvResultAd = findViewById<TextView>(R.id.tvResultAd)
        var btnEqualAd = findViewById<Button>(R.id.btnEqualAd)
        var tvPrevResult = findViewById<TextView>(R.id.tvPrevResult)
        var btnDivideAd = findViewById<Button>(R.id.btnDivideAd)
        var btnMultiplyAd = findViewById<Button>(R.id.btnMultiplyAd)
        var btnMinusAd = findViewById<Button>(R.id.btnMinusAd)
        var btnPlusAd = findViewById<Button>(R.id.btnPlusAd)
        var tvNotVisibleAd = findViewById<TextView>(R.id.tvNot)

        tvResultAd.text = ""
        btnEqualAd.setOnClickListener{
            btnDivideAd.setBackgroundColor(Color.parseColor("#646D77"))
            btnMultiplyAd.setBackgroundColor(Color.parseColor("#646D77"))
            btnPlusAd.setBackgroundColor(Color.parseColor("#646D77"))
            btnMinusAd.setBackgroundColor(Color.parseColor("#646D77"))
            var tvNotVisibleAd = findViewById<TextView>(R.id.tvNot)
            countDot = 0
            operatDot = 1

            when(operat){
                1 -> {
                    if(tvResultAd.text != ""){
                        tvResultAd.text = (num2 / tvResultAd.text.toString().toDouble()).toString()
                        tvPrevResult.text = tvResultAd.text
                    }else{
                        Toast.makeText(this,"Missing numbers",Toast.LENGTH_SHORT).show()
                    }
                }
                2 -> {
                    if(tvResultAd.text != ""){
                        tvResultAd.text = (num2 * tvResultAd.text.toString().toDouble()).toString()
                        tvPrevResult.text = tvResultAd.text
                    }else{
                        Toast.makeText(this,"Missing numbers",Toast.LENGTH_SHORT).show()
                    }
                }
                3 -> {
                    if(tvResultAd.text != ""){
                        tvResultAd.text = (num2 - tvResultAd.text.toString().toDouble()).toString()
                        tvPrevResult.text = tvResultAd.text
                    }else{
                        Toast.makeText(this,"Missing numbers",Toast.LENGTH_SHORT).show()
                    }
                }
                4 -> {
                    if(tvResultAd.text != ""){
                        tvResultAd.text = (num2 + tvResultAd.text.toString().toDouble()).toString()
                        tvPrevResult.text = tvResultAd.text
                    }else{
                        Toast.makeText(this,"Missing numbers",Toast.LENGTH_SHORT).show()
                    }
                }
                else ->{
                    Toast.makeText(this,"Select an operation",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


    fun btnFuntion(view: View) {
        var tvPrevResult = findViewById<TextView>(R.id.tvPrevResult)
        var tvResultAd = findViewById<TextView>(R.id.tvResultAd)
        var btnDivideAd = findViewById<Button>(R.id.btnDivideAd)
        var btnMultiplyAd = findViewById<Button>(R.id.btnMultiplyAd)
        var btnMinusAd = findViewById<Button>(R.id.btnMinusAd)
        var btnPlusAd = findViewById<Button>(R.id.btnPlusAd)
        var tvNotVisibleAd = findViewById<TextView>(R.id.tvNot)
        var dot = "."
        var tag = view.tag


        when(tag){
            "btn1" ->{
                num1 = 1
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn2" ->{
                num1 = 2
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn3" ->{
                num1 = 3
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn4" ->{
                num1 = 4
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn5" ->{
                num1 = 5
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn6" ->{
                num1 = 6
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn7" ->{
                num1 = 7
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn8" ->{
                num1 = 8
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn9" ->{
                num1 = 9
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btn0" ->{
                num1 = 0
                tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + num1
                tvResultAd.text = tvResultAd.text.toString() + num1
            }
            "btnDivideAd" ->{
                operat = 1
                countDot = 0
                operatDot = 0
                btnDivideAd.setBackgroundColor(Color.parseColor("#FF6200EE"))
                btnMultiplyAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnPlusAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnMinusAd.setBackgroundColor(Color.parseColor("#646D77"))
                if(tvResultAd.text.isNotEmpty()){
                    tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + "/"
                    tvPrevResult.text = tvResultAd.text
                    num2 = tvResultAd.text.toString().toDouble()
                    tvResultAd.text = ""
                }
                else {
                    Toast.makeText(this,"Missing numbers to operate",Toast.LENGTH_SHORT).show()
                }

            }
            "btnMultiplyAd" ->{
                operatDot = 0
                operat = 2
                countDot = 0
                btnMultiplyAd.setBackgroundColor(Color.parseColor("#FF6200EE"))
                btnDivideAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnPlusAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnMinusAd.setBackgroundColor(Color.parseColor("#646D77"))
                if(tvResultAd.text.isNotEmpty()){
                    tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + "*"
                    tvPrevResult.text = tvResultAd.text
                    num2 = tvResultAd.text.toString().toDouble()
                    tvResultAd.text = ""
                }
                else{
                    Toast.makeText(this,"Missing numbers to operate",Toast.LENGTH_SHORT).show()
                }
            }
            "btnMinusAd" ->{
                operat = 3
                countDot = 0
                operatDot = 0
                btnMinusAd.setBackgroundColor(Color.parseColor("#FF6200EE"))
                btnMultiplyAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnPlusAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnDivideAd.setBackgroundColor(Color.parseColor("#646D77"))
                if(tvResultAd.text.isNotEmpty()){
                    tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + "-"
                    tvPrevResult.text = tvResultAd.text
                    num2 = tvResultAd.text.toString().toDouble()
                    tvResultAd.text = ""
                }
                else{
                    Toast.makeText(this,"Missing numbers to operate",Toast.LENGTH_SHORT).show()
                }

            }
            "btnPlusAd" -> {
                operat = 4
                countDot = 0
                operatDot = 0
                btnPlusAd.setBackgroundColor(Color.parseColor("#FF6200EE"))
                btnMultiplyAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnDivideAd.setBackgroundColor(Color.parseColor("#646D77"))
                btnMinusAd.setBackgroundColor(Color.parseColor("#646D77"))
                if(tvResultAd.text.isNotEmpty()){
                    tvNotVisibleAd.text = tvNotVisibleAd.text.toString() + "+"
                    tvPrevResult.text = tvResultAd.text
                    num2 = tvResultAd.text.toString().toDouble()
                    tvResultAd.text = ""
                }
                else{
                    Toast.makeText(this,"Missing numbers to operate",Toast.LENGTH_SHORT).show()
                }
            }
            "btnDotAd" ->{
                if (countDot == 0 && operatDot == 0){
                    countDot = 1
                    tvResultAd.text = tvResultAd.text.toString() + dot
                    operatDot = 1
                }else{
                    Toast.makeText(this,"invalid", Toast.LENGTH_SHORT).show()
                }

            }
            "btnCE" -> {
                operatDot = 0
                tvResultAd.text = ""
                tvPrevResult.text = ""
                tvResultAd.hint= "0"
                tvPrevResult.hint= "0"
                tvNotVisibleAd.hint = "0"
                tvNotVisibleAd.text = ""
                num1 = 0
                num2 = 0.0
                operat = 0
                countDot = 0


            }
        }
    }
}