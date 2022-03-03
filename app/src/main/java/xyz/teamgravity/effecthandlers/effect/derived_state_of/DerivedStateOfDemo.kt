package xyz.teamgravity.effecthandlers.effect.derived_state_of

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun DerivedStateOfDemo() {
    var counter by remember { mutableStateOf(0) }
    val counterText by derivedStateOf { "The counter text is: $counter" } // caches the calculated string until the state changes

    Button(
        onClick = {
            counter++
        }
    ) {
        Text(text = counterText)
    }
}