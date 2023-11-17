package com.example.projectucp2.ui.theme

import androidx.lifecycle.ViewModel
import com.example.projectucp2.data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FormViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()

    fun setMahasiswa (listData : MutableList<String>){
        _stateUI.update {stateSaatIni->stateSaatIni.copy(
            nama =listData[0],
            nim =listData[1],
            konsentrasi = listData[2],
            judulSkripsi = listData[3]
        )
        }
    }
    fun setDospem (pilihDosen:String){
        _stateUI.update { currentState -> currentState.copy(dosen = pilihDosen) }
    }
}