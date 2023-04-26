package com.example.textfield1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfield1.ui.theme.Textfield1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Minhatela()

        }
    }
}

@Composable
fun Minhatela(){
    var textState by remember { mutableStateOf(TextFieldValue()) }

    Column(Modifier.padding(16.dp)) {
        Text(text = "digita v1")
        TextField(
            value = textState,
            onValueChange = { textState = it },
            label = { Text("textos") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Minhatela()

}