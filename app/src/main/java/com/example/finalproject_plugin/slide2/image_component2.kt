package com.example.finalproject_plugin.slide2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun imagecomp2(id:Int,Big:Boolean) {
    if(Big){
        Image(modifier = Modifier.size(300.dp),
            painter = painterResource(id = id),
            contentDescription = "image deskripsi")
    }
    else {
        Image(painter = painterResource(id = id),
            contentDescription = "image deskripsi")
    }
}