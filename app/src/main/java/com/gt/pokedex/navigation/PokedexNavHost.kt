package com.gt.pokedex.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.rememberNavBackStack
import com.skydoves.compose.stability.runtime.TraceRecomposition

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
@TraceRecomposition
fun PokedexNavHost() {
    val backStack = rememberNavBackStack(PokedexScreen.Home)

}