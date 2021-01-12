package com.daniyarjakupov.foodrecipes.utils

class Constants {

    companion object {
        const val API_KEY = "6fc3158cde064686866e3425f3b36301"
        const val BASE_URL = "https://api.spoonacular.com"

        // API Queries
        const val QUERY_NUMBER = "number"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "diet"
        const val QUERY_INFO = "addRecipeInformation"
        const val QUERY_FILL = "fillIngredients"
        const val QUERY_API_KEY = "apiKey"

        // ROOM DB
        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"

    }
}