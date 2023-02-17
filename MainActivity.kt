package com.example.dice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button =findViewById(R.id.button)
        rollbutton.setOnClickListener { rolldice() }
    }
    private fun rolldice(){
        var m=(1..6).random()
        val n=(1..6).random()
        // cnat rep class directly
       // var n:EditText=findViewById(R.id.editTextNumber)
        val dices=dice(6)
        //dice class rep ass dices which rep with fun
        val diceRoll=dices.roll()
        val diceImage: ImageView =findViewById(R.id.imageView)
        when (m+0.0) {
            1.0 -> diceImage.setImageResource(R.drawable.dice_1)
            2.0 -> diceImage.setImageResource(R.drawable.dice_2)
            3.0 -> diceImage.setImageResource(R.drawable.dice_3)
            4.0 -> diceImage.setImageResource(R.drawable.dice_4)
            5.0 -> diceImage.setImageResource(R.drawable.dice_5)
            6.0 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        var luckyno=findViewById<EditText>(R.id.ed).text
        val e= luckyno.toString()
        var k=e.toDoubleOrNull()
      if(k==null){
            Toast.makeText(this,"en",Toast.LENGTH_LONG).show()
        }

        when(m+0.0 ){
           k-> Toast.makeText(this, "YOU WON !", Toast.LENGTH_SHORT).show()
        }


        //val res:TextView=findViewById(R.id.textView)
        //res.text=rollbtn.toString()

    }
}
class dice(private val num:Int){
    fun roll():Int{
        return(1..num).random()

    }
}
