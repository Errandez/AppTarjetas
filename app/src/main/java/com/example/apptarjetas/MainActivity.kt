package com.example.apptarjetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.apptarjetas.ui.theme.AppTarjetasTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTarjetasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    AppTarjetas()
                }
            }
        }
    }
}

@Composable
fun AppTarjetas() {
    Column(){
        Row(){
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val imagen = painterResource(R.drawable.carta1)
                Image(
                    painter = imagen,
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp),
                )
                Text(
                    text = "Full Name",
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Title",
                    textAlign = TextAlign.Center
                )
            }

        }
        Row(
            modifier = Modifier .padding(start = 20.dp,top = 40.dp)
        ){
            Row(
                horizontalArrangement = Arrangement.Center,

            ) {
                Column() {
                    val imagen = painterResource(R.drawable.carta1)
                    Image(
                        painter = imagen,
                        contentDescription = null,
                        modifier = Modifier
                            .height(5.dp)
                            .width(5.dp),
                    )
                }
                Column {
                    Text(
                        text = "+00(00) 000 000",
                        fontSize = 5.sp,
                        modifier = Modifier.padding(start = 40.dp)
                    )
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center ,
            modifier = Modifier .padding(start = 20.dp)
        ){
            Column() {
                val imagen = painterResource(R.drawable.carta1)
                Image(
                    painter = imagen,
                    contentDescription = null,
                    modifier = Modifier
                        .height(5.dp)
                        .width(5.dp),
                )
            }
            Column {
                Text(
                    text = "@socialmediahandle",
                    fontSize = 5.sp,
                    modifier = Modifier.padding(start = 40.dp)
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier .padding(start = 20.dp)
        ){
            Column() {
                val imagen = painterResource(R.drawable.carta1)
                Image(
                    painter = imagen,
                    contentDescription = null,
                    modifier = Modifier
                        .height(5.dp)
                        .width(5.dp),
                )
            }
            Column {
                Text(
                    text = "email@domain.com",
                    fontSize = 5.sp,
                    modifier = Modifier.padding(start = 40.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppTarjetastPreview() {
    AppTarjetasTheme {
        AppTarjetas()
    }
}