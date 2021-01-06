package com.daniyarjakupov.foodrecipes.data

import com.daniyarjakupov.foodrecipes.data.network.FoodRecipesApi
import com.daniyarjakupov.foodrecipes.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }
}