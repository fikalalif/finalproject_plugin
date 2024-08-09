package com.example.finalproject_plugin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.finalproject_plugin.slide1.Landing
import com.example.finalproject_plugin.slide1.imagecomp
import com.example.finalproject_plugin.ui.theme.Finalproject_pluginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Finalproject_pluginTheme {
                Landing()
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Finalproject_pluginTheme {

    }
}