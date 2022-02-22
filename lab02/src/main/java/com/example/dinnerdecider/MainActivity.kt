package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val foods = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foods.add("Hamburger")
        foods.add("Pizza")
        foods.add("Mexican")
        foods.add("Mexican")
        foods.add("Chinese")

        val decide: Button = findViewById(R.id.decide) as Button
        val addfood: TextView = findViewById(R.id.addfood) as TextView
        decide.setOnClickListener {
            addfood.setText(foods.get(rand(0, foods.size)))
        }

        addfood.setText(foods[0])
    }

    fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }

    fun addfood(v: View){
        val newfood : EditText = findViewById(R.id.newfoodentry);
        foods.add(newfood.text.toString())
    }


}