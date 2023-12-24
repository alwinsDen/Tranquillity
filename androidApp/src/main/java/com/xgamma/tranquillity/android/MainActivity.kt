package com.xgamma.tranquillity.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.xgamma.tranquillity.android.components.FullLengthBck
import com.xgamma.tranquillity.android.composables.Main

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Root()
        }
    }
}

@Composable
fun Root() {
    FullLengthBck(color = Color.White) {
        Main()
    }
}