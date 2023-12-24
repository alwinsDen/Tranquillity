package com.xgamma.tranquillity.android.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xgamma.tranquillity.android.utils.urbanistFont

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

//Tranquility stylized
@Composable
fun TrnqStylized() {
    Text(
        text = "tranqulity",
        fontFamily = urbanistFont,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 15.sp,
        modifier = Modifier.padding(5.dp)
    )
}

//heading styled component
@Composable
fun HeaderStylized(text: String) {
    Text(
        text = text,
        fontFamily = urbanistFont,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

}