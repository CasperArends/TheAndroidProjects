package com.example.logicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var correctAnswers: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();
    }

    fun initViews(){
        confirmBtn.setOnClickListener{
            checkAnswere()
        }
    }

    fun checkAnswere() {
        var answer1: String = input1.text.toString()
        var answer2: String = input2.text.toString()
        var answer3: String = input3.text.toString()
        var answer4: String = input4.text.toString()

        if (answer1 == "T"){
            correctAnswers++
        }

        if (answer2 == "F"){
            correctAnswers++
        }


        if (answer3 == "F"){
            correctAnswers++
        }


        if (answer4 == "F"){
            correctAnswers++
        }

        Toast.makeText(this, "The correct number of answers is: " + correctAnswers, Toast.LENGTH_LONG).show()
    }
}
