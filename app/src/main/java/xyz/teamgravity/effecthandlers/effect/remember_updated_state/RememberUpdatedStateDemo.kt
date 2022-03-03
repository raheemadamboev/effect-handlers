package xyz.teamgravity.effecthandlers.effect.remember_updated_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

@Composable
fun RememberUpdatedStateDemo(
    onTimeOut: () -> Unit
) {

    val updatedOnTimeOut by rememberUpdatedState(newValue = onTimeOut)

    LaunchedEffect(key1 = true) { // we don't wanna pass the onTimeOut lambda, because every time it changes it adds new delay
        delay(3_000L)
        updatedOnTimeOut()
    }
}