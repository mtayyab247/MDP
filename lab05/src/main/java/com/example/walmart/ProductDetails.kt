package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.ImageView
import android.widget.TextView

class ProductDetails : AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val args: (HashMap<String, Any>) = intent.getSerializableExtra(AlarmClock.EXTRA_MESSAGE) as HashMap<String, Any>
        products = args.get("products") as ArrayList<Product>

        val id: Int = args.get("id") as Int

        setContentView(R.layout.activity_product_details)

        findViewById<TextView>(R.id.prod_title).text = products[id]._name
        findViewById<TextView>(R.id.prod_color).setText("Color: " + products[id]._color)
        findViewById<TextView>(R.id.prod_id).setText("Walmart#: " + products[id]._id)
        findViewById<TextView>(R.id.prod_description).setText("Item Description: " + products[id]._description)
        findViewById<ImageView>(R.id.product_image).setImageResource(this.getResources().getIdentifier(products[id]._image, "drawable", this.packageName))
    }
}