package com.example.project1wordle
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        while () {
            var fourL = FourLetterWordList.getRandomFourLetterWord()
            val button = findViewById<Button>(R.id.button)
            var counter = 0
            val textView = findViewById<TextView>(R.id.textView)
            val textView2 = findViewById<TextView>(R.id.textView2)
            val editTextText = findViewById<TextView>(R.id.editTextText)
            var c = 0
            var text = ""
            var rt = ""
            val arr = intArrayOf(10, 10, 10, 10)
            var f = 0
            var y = 0
            val upgradeButton = findViewById<Button>(R.id.button2)
            upgradeButton.visibility = View.INVISIBLE
            textView2.text = fourL.toString()
            button.setOnClickListener {
                var comparT = editTextText.text
                var ct = comparT.toString().lowercase()
                var fl = fourL.toString().lowercase()
                c = 0
                for (i in 0..3) {
                    if (fl[i] == ct[i]) {
                        text += "O"
                    } else {
                        for (l in 0..3) {
                            if (fl[l] == ct[i]) {
                                text += "+"
                                f = 1

                            }

                        }
                        if (f == 0) {
                            text += "X"
                        }
                    }
                    f = 0
                }
                rt += text + "\n"
                textView2.text = rt
                counter++
                if (counter <= 3) {

                    var tries = 3 - counter
                    Toast.makeText(
                        it.context,
                        "Clicked Button! you have $tries left",
                        Toast.LENGTH_SHORT
                    ).show()
                    textView.text = "you have $tries left 😁 Try again"

                } else {
                    upgradeButton.visibility = View.VISIBLE
                    Toast.makeText(
                        it.context,
                        "Clicked Button! NO MORE GUESSES!!!",
                        Toast.LENGTH_SHORT
                    ).show()
                    textView.text = "No more Tries 😡 better luck next time"
                    textView2.text = fl
                }
                text = ""
            }


        }
    }



}



