package com.codelabs.state

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codelabs.state.data.WellnessTask
import com.codelabs.state.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
//    WaterCounter(modifier = modifier)
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTasksList(list = wellnessViewModel.tasks, onCheckedTask = { task, checked -> wellnessViewModel.changeTaskChecked(task, checked)} , onCloseTask = { task -> wellnessViewModel.remove(task) })
    }
}
