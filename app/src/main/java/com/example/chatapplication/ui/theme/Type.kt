package com.example.chatapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.chatapplication.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
val bold: FontFamily = FontFamily(Font(R.font.poppins_bold, weight = FontWeight.W600))
val light: FontFamily = FontFamily(Font(R.font.poppins_light, weight = FontWeight.Light))
val medium: FontFamily = FontFamily(Font(R.font.poppins_medium, weight = FontWeight.W400))
val semibold: FontFamily = FontFamily(Font(R.font.poppins_semibold, weight = FontWeight.Bold))
val regular: FontFamily = FontFamily(Font(R.font.poppins_regular, weight = FontWeight.Normal))

fun itemText(color: Color = Color.Black, fontFamily: FontFamily = medium, fontSize: TextUnit) =
    TextStyle(color = color, fontFamily = fontFamily, fontSize = fontSize)