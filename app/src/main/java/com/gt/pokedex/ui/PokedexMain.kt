package com.gt.pokedex.ui

import androidx.compose.runtime.Composable
import com.gt.pokedex.core.designsystem.theme.PokedexTheme
import com.skydoves.compose.stability.runtime.TraceRecomposition

@Composable
@TraceRecomposition
fun PokedexMain(darkTheme: Boolean) {
    PokedexTheme(darkTheme = darkTheme) {
    }
}