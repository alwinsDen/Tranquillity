package com.xgamma.tranquillity.android.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

//Full-Screen Background cover
@Composable
fun FullLengthBck(color: Color, content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = color)
    ) {
        LazyColumn {
            item { content() }
        }
    }
}