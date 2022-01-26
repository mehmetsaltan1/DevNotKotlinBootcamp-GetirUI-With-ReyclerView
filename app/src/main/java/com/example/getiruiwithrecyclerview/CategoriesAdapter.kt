package com.example.getiruiwithrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.getiruiwithrecyclerview.entity.Categories

class CategoriesAdapter(var mContext:Context,var categoriesList: List<Categories>) :RecyclerView.Adapter<CategoriesAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(view: View):RecyclerView.ViewHolder(view){
        var cardViewCategori: CardView
        var imageViewCategoriImage: ImageView
        var textViewCategoriName: TextView

        init {
            cardViewCategori = view.findViewById(R.id.cardViewCategori)
            imageViewCategoriImage = view.findViewById(R.id.imageViewCategoriImage)
            textViewCategoriName = view.findViewById(R.id.textViewCategoriName)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.categories_card_design,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val categori = categoriesList.get(position)
        holder.imageViewCategoriImage.setImageResource(
            mContext.resources.getIdentifier(categori.categoriImage,"drawable",mContext.packageName))
        holder.textViewCategoriName.text = categori.categoriName
    }

    override fun getItemCount(): Int {
      return  categoriesList.size
    }
}