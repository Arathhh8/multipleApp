package com.example.multipleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class PersonalAdministration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_administration)

        var tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        var etName = findViewById<EditText>(R.id.etName)
        var etSurname = findViewById<EditText>(R.id.etSurname)
        var etEmail = findViewById<EditText>(R.id.etEmail)
        var etCellphone = findViewById<EditText>(R.id.etCellphone)
        var btnRegistered = findViewById<Button>(R.id.btnRegistered)
        var npDateDay = findViewById<NumberPicker>(R.id.npDateDay)
        var npDateMonth = findViewById<NumberPicker>(R.id.npDateMonth)
        var npDateYear = findViewById<NumberPicker>(R.id.npDateYear)

        btnRegistered.setOnClickListener{
            missingDate()
        }

        npDateDay.minValue = 1
        npDateDay.maxValue = 31
        npDateDay.value = 10
        npDateDay.wrapSelectorWheel = true
        npDateDay.setFormatter { i -> String.format("%02d", i)}

        npDateMonth.minValue = 1
        npDateMonth.maxValue = 12
        npDateMonth.value = 3
        npDateMonth.wrapSelectorWheel = true
        npDateMonth.setFormatter { i -> String.format("%02d", i)}

        npDateYear.minValue = 1950
        npDateYear.maxValue = 2022
        npDateYear.value = 2005
        npDateYear.wrapSelectorWheel = true
        npDateYear.setFormatter { i -> String.format("%02d", i)}


    }

    private fun toastPerson(){
        var tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        var etName = findViewById<EditText>(R.id.etName)
        var etSurname = findViewById<EditText>(R.id.etSurname)
        var etEmail = findViewById<EditText>(R.id.etEmail)
        var etCellphone = findViewById<EditText>(R.id.etCellphone)
        var btnRegistered = findViewById<Button>(R.id.btnRegistered)
        var npDateDay = findViewById<NumberPicker>(R.id.npDateDay)
        var npDateMonth = findViewById<NumberPicker>(R.id.npDateMonth)
        var npDateYear = findViewById<NumberPicker>(R.id.npDateYear)
        var result = "User registered as: " +
                "Name: ${etName.text} ${etSurname.text} " +
                "Email: ${etEmail.text} " +
                "Cellphone: ${etCellphone.text}" +
                " Date of birthday: ${npDateDay.value}/${npDateMonth.value}/${npDateYear.value}"
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

    }
    fun MainBack(view: View) {
        var intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }

    private fun missingDate(){
        var tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        var etName = findViewById<EditText>(R.id.etName)
        var etSurname = findViewById<EditText>(R.id.etSurname)
        var etEmail = findViewById<EditText>(R.id.etEmail)
        var etCellphone = findViewById<EditText>(R.id.etCellphone)
        var btnRegistered = findViewById<Button>(R.id.btnRegistered)
        var npDateDay = findViewById<NumberPicker>(R.id.npDateDay)
        var npDateMonth = findViewById<NumberPicker>(R.id.npDateMonth)
        var npDateYear = findViewById<NumberPicker>(R.id.npDateYear)

        if(etName.text.isEmpty() ){
            Toast.makeText(this,"Missing name user",Toast.LENGTH_SHORT).show()
        }
        else if (etSurname.text.isEmpty()){
            Toast.makeText(this,"Missing surname user",Toast.LENGTH_SHORT).show()
        }
        else if (etEmail.text.isEmpty()){
            Toast.makeText(this,"Missing email",Toast.LENGTH_SHORT).show()
        }
        else if (etCellphone.text.isEmpty()){
            Toast.makeText(this,"Missing phone number",Toast.LENGTH_SHORT).show()
        }
        else toastPerson()
    }
}