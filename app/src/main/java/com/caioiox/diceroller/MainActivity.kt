package com.caioiox.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caioiox.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice(){
        val drawableResource = when (Dice(6).dice){
            1-> binding.rollImage.setImageResource(R.drawable.dice_1)
            2-> binding.rollImage.setImageResource(R.drawable.dice_2)
            3-> binding.rollImage.setImageResource(R.drawable.dice_3)
            4-> binding.rollImage.setImageResource(R.drawable.dice_4)
            5-> binding.rollImage.setImageResource(R.drawable.dice_5)
            else-> binding.rollImage.setImageResource(R.drawable.dice_6)
        }
        return drawableResource
    }
}