package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    //oncreate is akin to a main in android, it's derived from a large superclass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //why is this where the greeting is modified, and is it something the composable inherits somehow? questions
        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {
                    Greeting("Slims Shady")
                }
            }
        }
    }
}

@Composable //composable doesn't return anything, are capitalized, annotated before. seems to take input and generate
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Green) {
        Text( //text attributes within the surface container
            text = "Hi, my name is $name!",
            modifier = modifier.padding(54.dp)
            )

    }
}

@Preview(showBackground = true) //PREVIEW allows you to see without building app
//if show background is true, go figure, background is shown. can be modified
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        //surface is a container that represents a section of UI that has an alterable appearance
        Greeting("Slims Shady")
    }
}

//notes:
//To see how your app looks, use the Preview pane.
//Composable functions are like regular functions with a few differences: functions names are capitalized, you add the @Composable annotation before the function, @Composable functions can't return anything.
//A Modifier is used to augment or decorate your composable.