package com.example.picturequizcasperarends2020
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun checkAnswer() {
        val answer = inputCheck.text.toString()

        // When the answer equals "giraffe" then display a correct message using a toast message.
        // Otherwise display an incorrect message.
        if (answer == getString(R.string.giraffe)) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }
}

