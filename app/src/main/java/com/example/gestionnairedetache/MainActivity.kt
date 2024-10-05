package com.example.gestionnairedetache

import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestionnairedetache.ui.theme.GestionnairedetacheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnairedetacheTheme {
                GreetingContent()

            }
        }
    }
}


@Composable
fun GreetingContent(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            image1()
            Spacer(modifier = Modifier.height(24.dp))
            Text1()
            Spacer(modifier = Modifier.height(8.dp))
            Text2()
        }


    }
}




@Composable
fun image1(){
    val image= painterResource(R.drawable.ic_task_completed)
Box{
    Image(
        painter =image,
        contentDescription = null,


    )
}


}

@Composable
fun Text1(){
    val text1 ="All tasks completed"
    Column(
        modifier=Modifier.padding(top=24.dp, bottom=8.dp)

    ){
        Text(
            text=text1,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            //textAlign = TextAlign.Justify




        )
    }

}


@Composable
fun Text2(){
    val text2 ="Nice work!"
    Column(
    ){
        Text(
            text=text2,
            fontSize = 16.sp,

            //textAlign = TextAlign.Justify

        )
    }

}










@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GestionnairedetacheTheme {
        GreetingContent()

    }
}