package com.xgamma.tranquillity.android.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xgamma.tranquillity.android.R
import com.xgamma.tranquillity.android.components.ThemeGrey
import com.xgamma.tranquillity.android.components.TrnqStylized
import com.xgamma.tranquillity.android.utils.HoriOptionHandle
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
    Column(
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Text(
            text = "Tranquility",
            fontFamily = urbanistFont,
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Divider(modifier = Modifier.padding(top = 6.dp), color = ThemeGrey)
        OptionSlider()
    }
}


@Composable
fun OptionSlider() {
    var scrollState = rememberScrollState()
    //define the wallpaper images
    var imageData = arrayOf(
        HoriOptionHandle(
            header = "Continue reading John",
            resId = R.drawable.wlp_valley,
            title = "Holy Bible"
        ),
        HoriOptionHandle(
            header = "Listen to godly music",
            resId = R.drawable.wlp_music,
            title = "Heavenly Sounds"
        ),
        HoriOptionHandle(
            header = "Pray with the community",
            resId = R.drawable.wlp_dove,
            title = "Power of People"
        ),
    )
    Column(
        modifier = Modifier.padding(top = 10.dp)
    ) {
        Text(
            text = "What today?",
            fontFamily = urbanistFont,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier.horizontalScroll(scrollState),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            imageData.forEach { option ->
                Column {
                    Text(
                        text = option.title,
                        fontFamily = urbanistFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 17.sp,
                        color = Color(0xFF999696),
                    )
                    Spacer(modifier = Modifier.padding(bottom = 10.dp))
                    Box(
                        modifier = Modifier.clip(RoundedCornerShape(8))
                    ) {
                        Image(
                            painter = painterResource(id = option.resId),
                            contentDescription = "Lords Valley",
                            modifier = Modifier
                                .height(337.dp)
                                .width(250.dp)
                                .clipToBounds()
                        )
                        Column(
                            modifier = Modifier
                                .width(250.dp)
                                .height(337.dp),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.End
                        ) {
                            TrnqStylized()
                            Column(
                                modifier = Modifier
                                    .background(color = Color(0x9C686868))
                                    .fillMaxWidth()
                                    .height(90.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = option.header,
                                    color = Color.White,
                                    fontFamily = urbanistFont,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}