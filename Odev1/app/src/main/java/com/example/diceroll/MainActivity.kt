package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageViewDice)
        button = findViewById(R.id.buttonRol)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.ic_dice_1_svgrepo_com
            2 -> R.drawable.ic_dice_2_svgrepo_com
            3 -> R.drawable.ic_dice_3_svgrepo_com
            4 -> R.drawable.ic_dice_4_svgrepo_com
            5 -> R.drawable.ic_dice_5_svgrepo_com
            else -> R.drawable.ic_dice_6_svgrepo_com

        }
        imageView.setImageResource(drawableResource)
    }
}
