package xyz.teamgravity.effecthandlers.effect.produce_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun produceStateDemo(
    countUpTo: Int
): State<Int> {
    return produceState(initialValue = 0) {
        while (value < countUpTo) {
            delay(1_000L)
            value++
        }
    }
}