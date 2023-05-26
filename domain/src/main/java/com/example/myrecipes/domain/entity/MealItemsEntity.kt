package com.example.myrecipes.domain.entity

data class MealItemsEntity(

    var id:Int,
    val idMeal: String,
    val categoryName: String,
    val strMeal: String,
    val strMealThumb: String

)