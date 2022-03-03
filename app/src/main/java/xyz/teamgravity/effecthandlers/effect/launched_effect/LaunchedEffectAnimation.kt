package xyz.teamgravity.effecthandlers.effect.launched_effect

import androidx.compose.animation.core.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

@Composable
fun LaunchedEffectAnimation(
    counter: Int
) {
    val animatable = remember { Animatable(initialValue = 0F) }

    LaunchedEffect(key1 = counter) {
        animatable.animateTo(counter.toFloat())
    }
}