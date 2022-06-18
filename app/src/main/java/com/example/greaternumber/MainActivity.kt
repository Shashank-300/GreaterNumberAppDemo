package com.example.greaternumber

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnLeft: Button = findViewById(R.id.btnLeft)
        val btnRight: Button = findViewById(R.id.btnRight)
        findViewById<View>(R.id.backgroundView)
        assignRandomNum()
        btnLeft.setOnClickListener{

            checkAnswer(true)
            assignRandomNum()
        }
            btnRight.setOnClickListener {
                checkAnswer(false)
                assignRandomNum()
            }

        }
    private fun checkAnswer(LeftBSelect: Boolean) {
        val btnLeft: Button = findViewById(R.id.btnLeft)
        val btnRight: Button = findViewById(R.id.btnRight)
        val background = findViewById<View>(R.id.backgroundView)
        val lNum: Int = btnLeft.text.toString().toInt()
        val rNum: Int = btnRight.text.toString().toInt()
        val isAnswerCorrect = if(LeftBSelect) lNum>rNum else rNum>lNum
        if (isAnswerCorrect) {
            val text = "Correct!"
            background.setBackgroundColor(Color.GREEN)
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
        } else {
            background.setBackgroundColor(Color.RED)
            Toast.makeText(applicationContext, "Wrong!", Toast.LENGTH_SHORT).show()

        }
    }

        private fun assignRandomNum() {
            val btnLeft: Button = findViewById(R.id.btnLeft)
            val btnRight: Button = findViewById(R.id.btnRight)

            val r= java.util.Random()
            val lRan = r.nextInt(10)
            var rRan = r.nextInt(10)
            if(lRan==rRan)
                rRan=r.nextInt(10)
            btnLeft.text = lRan.toString()
            btnRight.text = rRan.toString()
        }
    }





