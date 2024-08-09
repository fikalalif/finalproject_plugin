package com.example.finalproject_plugin.slide2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finalproject_plugin.R
import com.example.finalproject_plugin.slide1.imagecomp

@Composable
fun home () {
    Surface (modifier = Modifier.fillMaxSize()){
        Box (Modifier.size(400.dp)){
            Card (modifier = Modifier
                .align(Alignment.TopCenter)){
                imagecomp2(id = R.drawable.containerbox1, Big = true)
            }
        }
    }

}

@Preview (showBackground = true)
@Composable
private fun danang() {
    home()
}