package xyz.teamgravity.effecthandlers.effect.launched_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.flow.collectLatest

@Composable
fun LaunchedEffectFlowDemo(
    viewmodel: LaunchedEffectViewModel
) {
    LaunchedEffect(key1 = true) {
        viewmodel.sharedFlow.collectLatest { event ->
            when (event) {
                is LaunchedEffectViewModel.ScreenEvents.ShowSnackbar -> {

                }
                is LaunchedEffectViewModel.ScreenEvents.Navigate -> {

                }
            }
        }
    }
}