package com.wordline.quiz

import androidx.compose.material.DrawerState
import androidx.compose.material.DrawerValue
import androidx.compose.material.ModalDrawer
import androidx.compose.runtime.Composable

@Composable
fun Sidebar() {
    ModalDrawer(
        drawerContent = {},
        drawerState = DrawerState(DrawerValue.Open)
    ) {
        // Screen content
    }
}