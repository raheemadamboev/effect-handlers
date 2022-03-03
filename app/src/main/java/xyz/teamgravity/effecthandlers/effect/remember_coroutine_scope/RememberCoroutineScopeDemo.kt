package xyz.teamgravity.effecthandlers.effect.remember_coroutine_scope

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineScopeDemo() {
    val scope = rememberCoroutineScope()
    Button(onClick = {
        scope.launch {
            delay(1_000L)
            println("Hello Raheem!")
        }
    }) {
        Text(text = "Click me")
    }
}