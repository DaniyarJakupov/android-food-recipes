package com.daniyarjakupov.foodrecipes

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.daniyarjakupov.foodrecipes.models.FoodRecipe
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(var foodRecipe: FoodRecipe) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}