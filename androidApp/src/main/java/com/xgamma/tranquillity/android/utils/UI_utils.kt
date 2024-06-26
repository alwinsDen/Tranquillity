package com.xgamma.tranquillity.android.utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.xgamma.tranquillity.android.R

//add the urbanist font
var urbanistFont = FontFamily(
    Font(R.font.urbanist_thin, FontWeight.Thin),
    Font(R.font.urbanist_light, FontWeight.Light),
    Font(R.font.urbanist_regular, FontWeight.Normal),
    Font(R.font.urbanist_medium, FontWeight.Medium),
    Font(R.font.urbanist_semibold, FontWeight.SemiBold),
    Font(R.font.urbanist_bold, FontWeight.Bold),
    Font(R.font.urbanist_extrabold, FontWeight.ExtraBold)
)

//added the sevillana font
var sevillanaFont = FontFamily(
    Font(R.font.sevillana_regular, FontWeight.Normal)
)


//added Garamond font
var garamondFont = FontFamily(
    Font(R.font.ebgaramond_bold, FontWeight.Bold),
    Font(R.font.ebgaramond_regular, FontWeight.Normal),
    Font(R.font.ebgaramond_extrabold, FontWeight.ExtraBold),
    Font(R.font.ebgaramond_medium, FontWeight.Medium),
    Font(R.font.ebgaramond_semibold, FontWeight.SemiBold),
)

//added Castoro Titling font.
var castoroFont = FontFamily(
    Font(R.font.castorotitling_regular, FontWeight.Normal)
)