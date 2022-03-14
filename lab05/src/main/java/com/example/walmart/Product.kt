package com.example.walmart

import java.io.Serializable

class Product(
    val _name: String,
    val _price: Float,
    val _color: String,
    val _image: String,
    val _id: String,
    val _description: String
) :
    Serializable {

    var name: String = _name
    var price: Float = _price
    var color: String = _color
    var image: String = _image
    var id: String = _id
    var description: String = _description

}