package com.example.fruitsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val fruitDetail = intent.getParcelableExtra<Fruit>("Fruit")

            val fruitText : TextView = findViewById(R.id.text_detail)
            val fruitImageDetail : ImageView = findViewById(R.id.image2)

            if (fruitDetail != null) {
                fruitText.text = fruitDetail.shortDescription.toString()
                fruitImageDetail.setImageResource(fruitDetail.fruitImages)
            }
        }
    }