package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeTutorialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Column(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            GreetingImage() // Image on top
                            Spacer(modifier = Modifier.height(16.dp))
                            GreetingText("Jetpack Compose tutorial") // Title
                            Spacer(modifier = Modifier.height(8.dp))
                            GreetingText2() // First paragraph
                            Spacer(modifier = Modifier.height(8.dp))
                            GreetingText3() // Second paragraph
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = message,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            // Center-align the title
        )
    }
}

@Composable
fun GreetingText2() {
    val text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingText3() {
    val text3 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = text3,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingImage() {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp), // Adjust image height as necessary
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                GreetingImage()
                Spacer(modifier = Modifier.height(16.dp))
                GreetingText(message = "Jetpack Compose tutorial")
                Spacer(modifier = Modifier.height(8.dp))
                GreetingText2()
                Spacer(modifier = Modifier.height(8.dp))
                GreetingText3()
            }
        }
    }
}
