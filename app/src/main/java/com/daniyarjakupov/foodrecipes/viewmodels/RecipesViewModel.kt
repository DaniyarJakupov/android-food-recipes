package com.daniyarjakupov.foodrecipes.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.API_KEY
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_API_KEY
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_DIET
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_FILL
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_INFO
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_NUMBER
import com.daniyarjakupov.foodrecipes.utils.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "20"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_DIET] = "vegan"
        queries[QUERY_INFO] = "true"
        queries[QUERY_FILL] = "true"
        queries[QUERY_TYPE] = "finger food"

        return queries
    }
}