package com.example.multipleapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*

class BasicCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_calculator)

        var operat = 0
        var btnEqual = findViewById<Button>(R.id.btnEqual)
        var btnClear = findViewById<Button>(R.id.btnClear)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        var etNum1 = findViewById<EditText>(R.id.etNum1)
        var etNum2 = findViewById<EditText>(R.id.etNum2)
        var tvResult = findViewById<TextView>(R.id.tvResult)

        btnPlus.setOnClickListener{
            btnMultiply.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnDivide.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnMinus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnPlus.setBackgroundColor(Color.GREEN)
            operat = 1
            hideKeyboard()
        }

        btnMinus.setOnClickListener{
            btnMultiply.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnDivide.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnPlus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            var btnMinus = findViewById<Button>(R.id.btnMinus)
            btnMinus.setBackgroundColor(Color.GREEN)
            operat = 2
            hideKeyboard()
        }

        btnMultiply.setOnClickListener{
            btnPlus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnDivide.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnMinus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            var btnMultiply = findViewById<Button>(R.id.btnMultiply)
            btnMultiply.setBackgroundColor(Color.GREEN)
            operat = 3
            hideKeyboard()
        }

        btnDivide.setOnClickListener{
            btnMultiply.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnPlus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnMinus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            var btnDivide = findViewById<Button>(R.id.btnDivide)
            btnDivide.setBackgroundColor(Color.GREEN)
            operat = 4
            hideKeyboard()
        }

        btnClear.setOnClickListener{
            tvResult.text = ""
            etNum1.setText("")
            etNum2.setText("")
            operat = 0
            btnMultiply.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnPlus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnMinus.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btnDivide.setBackgroundColor(Color.parseColor("#FF6200EE"))
            hideKeyboard()
            etNum1.requestFocus()
        }

        btnEqual.setOnClickListener{
            when (operat) {
                1 -> {
                    add()
                    btnPlus.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    operat = 0
                    etNum1.requestFocus()
                }
                2 -> {
                    rest()
                    btnMinus.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    operat = 0
                    etNum1.requestFocus()
                }
                3 -> {
                    multiply()
                    btnMultiply.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    operat = 0
                    etNum1.requestFocus()
                }
                4 -> {
                    div()
                    btnDivide.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    operat = 0
                    etNum1.requestFocus()
                }
                else -> {
                    Toast.makeText(this,"Select an operation", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun deleteContent(){
        var btnPlus: Button = findViewById<Button>(R.id.btnPlus)
        var btnMinus: Button = findViewById<Button>(R.id.btnMinus)
        var btnMultiply: Button = findViewById<Button>(R.id.btnMultiply)
        var btnDivide: Button = findViewById<Button>(R.id.btnDivide)
        var btnEqual: Button = findViewById<Button>(R.id.btnEqual)
        var etNum1: EditText = findViewById<EditText>(R.id.etNum1)
        var etNum2: EditText = findViewById<EditText>(R.id.etNum2)
        etNum1.text.clear()
        etNum2.text.clear()
        btnPlus.background.clearColorFilter()

    }

    private fun add(){
        var etNum1 = findViewById<EditText>(R.id.etNum1)
        var etNum2 = findViewById<EditText>(R.id.etNum2)
        var tvResult: TextView = findViewById(R.id.tvResult)
        if(etNum1.text.isEmpty())
            Toast.makeText(this,"Missing number 1", Toast.LENGTH_SHORT).show()
        else if(etNum2.text.isEmpty())
            Toast.makeText(this,"Missing number 2", Toast.LENGTH_SHORT).show()
        else {
            var result = etNum1.text.toString().toDouble() + etNum2.text.toString().toDouble()
            tvResult.setText("$result")
            deleteContent()
        }
    }

    private fun rest(){
        var etNum1: EditText = findViewById<EditText>(R.id.etNum1)
        var etNum2: EditText = findViewById<EditText>(R.id.etNum2)
        var tvResult: TextView = findViewById(R.id.tvResult)
        if(etNum1.text.isEmpty())
            Toast.makeText(this,"Missing number 1", Toast.LENGTH_SHORT).show()
        else if(etNum2.text.isEmpty())
            Toast.makeText(this,"Missing number 2", Toast.LENGTH_SHORT).show()
        else {
            var result = etNum1.text.toString().toDouble() - etNum2.text.toString().toDouble()
            tvResult.setText("$result")
            deleteContent()
        }

    }

    private fun multiply(){
        var etNum1: EditText = findViewById<EditText>(R.id.etNum1)
        var etNum2: EditText = findViewById<EditText>(R.id.etNum2)
        var tvResult: TextView = findViewById(R.id.tvResult)
        if(etNum1.text.isEmpty())
            Toast.makeText(this,"Missing number 1", Toast.LENGTH_SHORT).show()
        else if(etNum2.text.isEmpty())
            Toast.makeText(this,"Missing number 2", Toast.LENGTH_SHORT).show()
        else {
            var result = etNum1.text.toString().toDouble() * etNum2.text.toString().toDouble()
            tvResult.setText("$result")
            deleteContent()
        }

    }

    private fun div() {
        var etNum1: EditText = findViewById<EditText>(R.id.etNum1)
        var etNum2: EditText = findViewById<EditText>(R.id.etNum2)
        var tvResult: TextView = findViewById(R.id.tvResult)
        if(etNum1.text.isEmpty())
            Toast.makeText(this,"Missing number 1", Toast.LENGTH_SHORT).show()
        else if(etNum2.text.isEmpty())
            Toast.makeText(this,"Missing number 2", Toast.LENGTH_SHORT).show()
        else {
            var result = etNum1.text.toString().toDouble() / etNum2.text.toString().toDouble()
            tvResult.setText("$result")
            deleteContent()
        }
    }

    private fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }


}