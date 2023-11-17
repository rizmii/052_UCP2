@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class)
package com.example.projectucp2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectucp2.ui.theme.FormViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
enum class PengelolaHalaman {
    Home,
    Form,
    Summary
}

@Composable
fun FormSkripsi(
    viewModel: FormViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold() {innerPadding ->
        val uiState by viewModel.stateUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PengelolaHalaman.Home.name) {
                halamanHome(
                    onNextButtonClicked = {
                        navController.navigate(PengelolaHalaman.Form.name)
                    }
                )
            }
            composable(route = PengelolaHalaman.Form.name){
                halamanForm(onSubmitButtonClick = {
                    viewModel.setMahasiswa(it)
                    navController.navigate(PengelolaHalaman.Summary.name)
                } )
            }
            composable(route = PengelolaHalaman.Summary.name) {
                halamanSummary(
                    formUiState = uiState,
                    onCancelButtonClicked = {
                        navController.navigate(PengelolaHalaman.Form.name)
                    }
                )
            }
        }
    }
}