package com.example.finalproject_plugin.slide1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject_plugin.R

@Composable
fun Landing() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ){
        Column{
            imagecomp(id = com.example.finalproject_plugin.R.drawable.background1, Big = true)
            Column (
                modifier = Modifier.padding(15.dp),
            ){
                TextComp(
                    text = stringResource(id = R.string.deksripsi1),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontsize = 40.sp,)
            }
            Column {
                TextComp(text = stringResource(id = R.string.deksripsi2), color = Color.Gray,
                    fontWeight = FontWeight.SemiBold, fontsize = 20.sp)
                Spacer(modifier = Modifier.height(20.dp))
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
                ) {
                TextComp(
                    text = stringResource(id = R.string.button1),
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontsize = 15.sp)
            }

        }
    }
}

@Preview (showBackground = true)
@Composable
private fun preview() {
    Landing()
}