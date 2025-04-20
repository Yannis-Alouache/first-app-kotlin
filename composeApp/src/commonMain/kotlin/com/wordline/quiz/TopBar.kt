package com.wordline.quiz

import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TopBar() {
    TopAppBar(
        windowInsets = AppBarDefaults.topAppBarWindowInsets,
        title = { Text("CV") },
        backgroundColor = Color.Black,
        contentColor = Color.White,
    )
}