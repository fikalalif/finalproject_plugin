package com.example.finalproject_plugin.slide1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComp(text: String, color: Color, fontWeight: FontWeight, fontsize: TextUnit) {
    Text(text = text, style = TextStyle(
        fontFamily = FontFamily.Default,
        color = color,
        fontWeight = fontWeight,
        fontSize = fontsize,
        textAlign = TextAlign.Center
    )
    )
}