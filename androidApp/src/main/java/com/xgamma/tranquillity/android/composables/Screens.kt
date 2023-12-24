package com.xgamma.tranquillity.android.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xgamma.tranquillity.android.utils.urbanistFont

@Composable
fun Main() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(10.dp)) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More Options")
        }
    }
    TrnqOptions()
}

//Here is the user welcomed message screen
@Composable
fun TrnqOptions() {
    Row(
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Text(
            text = "Tranquility",
            fontFamily = urbanistFont,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
    }
}