package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray),
    horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        ComposableInfoCard(
            name = "Carl W. W. Sverstad",
            description = "Android Developer Extraordinare",
            backgroundColor = Color.DarkGray,
            number = "+47 932857888",
            social = "@carlwws",
            email = "@carlwws@hotmail.com"
        )
    }
}

@Composable
private fun ComposableInfoCard(
    name: String,
    description: String,
    backgroundColor: Color,
    number: String,
    social: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(backgroundColor)
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .padding()
                .size(200.dp)
        )
        Text(
            text = name,
            fontFamily = FontFamily.Default,
            fontSize = 36.sp,
            color = Color.White,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(bottom = 10.dp)


        )
        Text(
            text = description,
            fontFamily = FontFamily.Default,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            color = Color(61, 220, 132),
            fontWeight = FontWeight.Bold
        )
    }

    //TODO Split Column and row to two different Composables

    Row(
        modifier = modifier
            .padding(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center

    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_phone_24),
            contentDescription = null,
            modifier = Modifier
                .padding(),
            tint = Color(61, 220, 132),



        )
        Text(
            text = number,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            fontFamily = FontFamily.Serif,
            color = Color.White,
            modifier = Modifier
                .padding(start = 10.dp, top = 2.dp, bottom = 2.dp),

        )
    }
    Row(modifier = Modifier
    ) {
         Icon(
             painter =,
             contentDescription = null
         )
         Text(text =
         )

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}