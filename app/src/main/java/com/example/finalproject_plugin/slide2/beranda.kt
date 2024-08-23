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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalproject_plugin.R
import com.example.finalproject_plugin.R.string.lokasi
import com.example.finalproject_plugin.slide1.TextComp
import com.example.finalproject_plugin.slide1.imagecomp

@Composable
fun home () {
    Surface (modifier = Modifier.fillMaxSize()){
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)){
            Column (modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .height(290.dp)){
                imagecomp2(id = R.drawable.containerbox1, Big = true)
            }
            Column (
                Modifier
                    .padding(45.dp)
                    .align(Alignment.TopStart)){
                TextComp2(text = "Location", color = Color.White,
                    fontWeight = FontWeight.SemiBold, fontsize = 18.sp)
                TextComp2(text = "Bilzen, Tanjungbalai", color = Color.White,
                    fontWeight = FontWeight.Bold, fontsize = 18.sp)
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(240.dp)
                        .height(60.dp)
                    ,
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF2A2A2A))
                ) {

                    TextComp(
                        text = "Search Coffe",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontsize = 15.sp,
                        )
                    imagecomp(id = R.drawable.iconsearch, Big = true)
                }



            }


            }
        }
    }

@Preview (showBackground = true)
@Composable
private fun danang() {
    home()
}