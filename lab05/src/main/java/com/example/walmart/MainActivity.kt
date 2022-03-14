package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var users = ArrayList<User>()
    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addUsers()
        addProducts()
        setContentView(R.layout.activity_main)

        val user = intent.getSerializableExtra(EXTRA_MESSAGE) as? User
        if (user != null) {
            users.add(user)
            Toast.makeText(this, "Account create for ${user._firstName} ${user._lastName}", Toast.LENGTH_LONG).show()
        }
    }

    fun login(view: View) {
        var email: String = findViewById<EditText>(R.id.emailAddress).text.toString()
        var password: String = findViewById<EditText>(R.id.password).text.toString()
        var userFound: Boolean = false

        for(user in users) {
            if(user._username.equals(email) && user._password.equals(password)) {
                userFound = true
            }
        }

        if(userFound) {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_LONG).show()

            val params = HashMap<String, Any>()
            params.put("email", email)
            params.put("products", products)

            val intent = Intent(this, ShoppingCategoryActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, params)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Invalid credentials!", Toast.LENGTH_LONG).show()
        }
    }

    fun addUsers() {
        users.add(User("FName1", "LName1", "user1@gmail.com", "password1"))
        users.add(User("FName2", "LName2", "user2@gmail.com", "password2"))
        users.add(User("FName3", "LName3", "user3@gmail.com", "password3"))
        users.add(User("FName4", "LName4", "user4@gmail.com", "password4"))
        users.add(User("FName5", "LName5", "user5@gmail.com", "password5"))
    }

    fun register(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun resetPassword(view: View) {
        val intent = Intent(this, ActivityForgotPassword::class.java).apply {
            putExtra(EXTRA_MESSAGE, users)
        }
        startActivity(intent)
    }

    fun addProducts() {
        products.add(Product("Name1", 10.5f, "red, green", "clothing", "id1", "Description1"))
        products.add(Product("Name2", 15.00f, "red, black", "electronics","id2", "Description1"))
        products.add(Product("Name3", 13.3f, "white, green, pink", "fashion", "id3", "Description1",
        ))
        products.add(Product("Name4", 20.99f, "red, brown", "electronics","id4", "Description1",))
        products.add(Product("Name5", 25f, "green, blue", "food","id5", "Description1",))
    }

}