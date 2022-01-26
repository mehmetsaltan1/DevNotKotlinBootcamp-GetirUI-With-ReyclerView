package com.example.getiruiwithrecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getiruiwithrecyclerview.databinding.ActivityMainBinding
import com.example.getiruiwithrecyclerview.entity.Categories

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        val categoriesList = ArrayList<Categories>()
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Su & İçecek","icecek"))
        categoriesList.add(Categories("Meyve & Sebze","meyvesebze"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        categoriesList.add(Categories("Yeni Ürünler","yeniurunler"))
        categoriesList.add(Categories("İndirimler","indirimler"))
        val adapter = CategoriesAdapter(this,categoriesList)
        tasarim.rv.adapter = adapter
        setContentView(tasarim.root)

    }


}