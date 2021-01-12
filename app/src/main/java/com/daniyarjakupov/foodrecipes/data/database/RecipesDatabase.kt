package com.daniyarjakupov.foodrecipes.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.daniyarjakupov.foodrecipes.data.database.entities.RecipesEntity

@Database(
    entities = [RecipesEntity::class],
    version = 1,
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {
    abstract fun recipesDao(): RecipesDao
}