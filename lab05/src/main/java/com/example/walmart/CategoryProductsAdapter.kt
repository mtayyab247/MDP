package com.example.walmart

import android.content.Context
import android.content.Intent
import android.provider.AlarmClock
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

class CategoryProductsAdapter(var productsList: ArrayList<Product>, context: Context):
    RecyclerView.Adapter<CategoryProductsAdapter.CategoryProductsViewHolder>() {

    val c: Context = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryProductsViewHolder {
        val view = LayoutInflater.from(c).inflate(R.layout.category_list_product,parent,false)
        return CategoryProductsViewHolder(view, c, productsList)
    }

    override fun onBindViewHolder(holder: CategoryProductsViewHolder, position: Int) {
        holder.productTitle.text = productsList[position]._name
        holder.productPrice.text = productsList[position]._price.toString()
        holder.productColors.text = productsList[position]._color
        holder.productImage.setImageResource(c.getResources().getIdentifier(productsList[position]._image, "drawable", c.packageName))

    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    class CategoryProductsViewHolder(itemView: View, context: Context, productsList: ArrayList<Product>): RecyclerView.ViewHolder(itemView) {

        val productTitle: TextView
        val productPrice: TextView
        val productColors: TextView
        val productImage: ImageView
        val c: Context = context

        init {
            productTitle = itemView.findViewById(R.id.product_title)
            productPrice = itemView.findViewById(R.id.price)
            productColors = itemView.findViewById(R.id.color)
            productImage = itemView.findViewById(R.id.product_image)

            productImage.setOnClickListener() {

                val params = HashMap<String, Any>()
                params.put("id", this.getLayoutPosition())
                params.put("products", productsList)
                val intent = Intent(context, ProductDetails::class.java).apply {
                    putExtra(EXTRA_MESSAGE, params)
                }
                context.startActivity(intent)
            }

        }

    }
}


