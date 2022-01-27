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
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        tasarim.rv.layoutManager =
            StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        val categoriesList = ArrayList<Categories>()
        val categoriNameList = arrayOf(
            "Yeni Ürünler",
            "İndirimler",
            "Su & İçecek",
            "Meyve & Sebze",
            "Fırından",
            "Temel Gıda",
            "Atıştırmalık",
            "Dondurma",
            "Süt Ürünleri",
            "Kahvaltılık",
            "Yiyecek",
            "Fit & Form",
            "Kişisel Bakım",
            "Ev Bakım",
            "Ev & Yaşam",
            "Teknoloji"
        )
        val categoriImageList = arrayOf(
            "yeniurunler",
            "indirimler",
            "icecek",
            "meyvesebze",
            "firindan",
            "temelgida",
            "atistirmalik",
            "dondurma",
            "suturunleri",
            "kahvaltilik",
            "yiyecek",
            "fitform",
            "kisiselbakim",
            "evbakim",
            "evyasam",
            "teknoloji"
        )
        for (i in categoriNameList.indices) {
            categoriesList.add(Categories(categoriNameList[i], categoriImageList[i]))
        }

        val adapter = CategoriesAdapter(this, categoriesList)
        tasarim.rv.adapter = adapter
        setContentView(tasarim.root)

    }


}