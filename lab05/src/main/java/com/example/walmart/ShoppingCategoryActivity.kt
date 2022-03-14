package com.example.walmart

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShoppingCategoryActivity: AppCompatActivity() {

    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_category_activity)

        val args: (HashMap<String, Any>) = intent.getSerializableExtra(EXTRA_MESSAGE) as HashMap<String, Any>
        products = args.get("products") as ArrayList<Product>

        findViewById<TextView>(R.id.welcome).setText("Welcome " + args.get("email"))
    }

    fun showListing(view: View) {
        val intent = Intent(this, CategoryProductsActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, products)
        }
        startActivity(intent)
        Toast.makeText(this, "You have chosen the " + view.contentDescription + " category of shopping!", Toast.LENGTH_LONG).show()
    }
}

