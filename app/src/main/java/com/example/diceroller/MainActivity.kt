package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var rolbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        rolbtn.setOnClickListener { rollDice() }
    }
    fun init(){
        rolbtn =findViewById(R.id.button);
        diceImage = findViewById(R.id.imageView);
    }
    private fun rollDice(){
        val randomInt= Random().nextInt(6)+1
        val drawableResource=when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource);

    }
}
