package com.utility.companionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.utility.companionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.leapYearButton.setOnClickListener {
            if (!binding.yearField.text.isNullOrEmpty()) {
                binding.resultText.text = setResultText()
            } else {
                Toast.makeText(this, "Year field cannot be empty..", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun setResultText(): String {
        return "COMMON YEAR"
    }
}