package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryProductsActivity : AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_products)

        products = (intent.getSerializableExtra(EXTRA_MESSAGE) as? ArrayList<Product>)!!

        val category_products_list = findViewById<RecyclerView>(R.id.category_products_list)
        category_products_list.layoutManager = LinearLayoutManager(this)

        val adapter = CategoryProductsAdapter(products, this)
        category_products_list.adapter = adapter
    }

}