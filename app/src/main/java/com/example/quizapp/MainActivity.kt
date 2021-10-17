package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnStart.setOnClickListener {
            if (binding.EditName.text.toString().isEmpty()) {
                Toast.makeText(this,
                    "Please enter your name",Toast.LENGTH_SHORT).show()
                //checks if the name box is empty
            } else {
                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,binding.EditName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}