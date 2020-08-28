package com.example.whichnumberisbigger

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var game = BiggerNumberGame(0,10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generate()
    }
    fun generate(){
        game.generateRandomNumbers()
        button_main_left.setText(game.leftNumber.toString())
        button_main_right.setText(game.rightNumber.toString())
        textView_main_score.setText(game.score.toString())
    }
    fun onLeftClick(view: View){
        game.checkAnswer(button_main_left.text.toString().toInt())
        Toast.makeText(this, game.checkAnswer(button_main_left.text.toString().toInt()) , Toast.LENGTH_SHORT).show()
        generate()
    }

    fun onRightClick(view: View){
        game.checkAnswer(button_main_right.text.toString().toInt())
        Toast.makeText(this, game.checkAnswer(button_main_right.text.toString().toInt()) , Toast.LENGTH_SHORT).show()
        generate()
    }
}