package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            rollDice()
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }


    }

    private fun rollDice() {
        val dice=Dice(6)
        val diceRoll= dice.roll()
          // Dice Roll with TextView
         // val resultTextView: TextView = findViewById(R.id.txtSide)
        // resultTextView.text = diceRoll.toString()
        // Dice Roll with ImageView
        val diceImg : ImageView = findViewById(R.id.imageView)
        // Using if statement
       /* if(diceRoll==1){
            diceImg.setImageResource(R.drawable.dice_1)
        }else if(diceRoll==2){
            diceImg.setImageResource(R.drawable.dice_2)
        }else if(diceRoll==3){
            diceImg.setImageResource(R.drawable.dice_3)
        }else if(diceRoll==4){
            diceImg.setImageResource(R.drawable.dice_4)
        }else if(diceRoll==5) {
            diceImg.setImageResource(R.drawable.dice_5)
        }else if(diceRoll==6){
            diceImg.setImageResource(R.drawable.dice_1)}*/
        // Using when
        when(diceRoll){
            1-> diceImg.setImageResource(R.drawable.dice_1)
            2-> diceImg.setImageResource(R.drawable.dice_2)
            3-> diceImg.setImageResource(R.drawable.dice_3)
            4-> diceImg.setImageResource(R.drawable.dice_4)
            5-> diceImg.setImageResource(R.drawable.dice_5)
            6-> diceImg.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice (val numSides :Int ){
    fun roll():Int{
        return (1..numSides).random()
    }
}