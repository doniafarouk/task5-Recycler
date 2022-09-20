package com.example.fruitsapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter( private val fruitList: List<Fruit>)
: RecyclerView.Adapter<FruitAdapter.FruitViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter.FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitView)    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.bindCharacter(fruit)    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private var fruitName: TextView
        private var fruitImage: ImageView

        init {
            fruitName = itemView.findViewById(R.id.fruitText)
            fruitImage = itemView.findViewById(R.id.fruitImage)
            itemView.setOnClickListener {
                val currentFruit = fruitList[layoutPosition]
                val intent = Intent(itemView.context, FruitDetails::class.java)
                intent.putExtra("Fruit", currentFruit)
                itemView.context.startActivity(intent)
                Toast.makeText(itemView.context, currentFruit.fruitNames, Toast.LENGTH_SHORT).show()
            }}

            fun bindCharacter(character: Fruit) {
                fruitName.text = character.fruitNames
                fruitImage.setImageResource(character.fruitImages)

            }
    }}