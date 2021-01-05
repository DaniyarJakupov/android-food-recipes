package com.daniyarjakupov.foodrecipes.ui.fragments.favs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daniyarjakupov.foodrecipes.R

/**
 * A simple [Fragment] subclass.
 * Use the [FavRecipesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavRecipesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fav_recipes, container, false)
    }
}