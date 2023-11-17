package com.example.projectucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.projectucp2.data.DataSource.dospem
import com.example.projectucp2.data.FormUIState
import com.example.projectucp2.ui.theme.FormViewModel
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun halamanForm(
    onSubmitButtonClick:(MutableList<String>) -> Unit
){
    var namaTxt by rememberSaveable{
        mutableStateOf("")
    }
    var nimTxt by rememberSaveable {
        mutableStateOf("")
    }
    var konsentrasiTxt by rememberSaveable {
        mutableStateOf("")
    }
    var judulTxt by remember{
        mutableStateOf("")
    }
    var listDataTxt:MutableList<String> = mutableListOf(namaTxt,nimTxt,konsentrasiTxt,judulTxt)

//    val context = LocalContext.current
//    val dataForm: FormUIState
//    val uiState by FormViewModel.uiState.collectAsState()
//    dataForm=uiState;

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        OutlinedTextField(value = namaTxt, onValueChange ={
            namaTxt = it
        }, label = {
            Text(text = "Nama")
        } )
        OutlinedTextField(value = nimTxt, onValueChange ={
            nimTxt = it
        }, label={
            Text(text = "NIM")
        } )
        OutlinedTextField(value = konsentrasiTxt, onValueChange ={
            konsentrasiTxt = it
        }, label={
            Text(text = "Konsentrasi")
        } )
        OutlinedTextField(value = judulTxt, onValueChange ={
            judulTxt = it
        }, label = {
            Text(text = "Judul Skripsi")
        } )
        Spacer(modifier= Modifier.padding(16.dp))

//        SelectDosen(options = dospem.map { id-> context.resources.getString(id)},
//            onSelectionChanged = {FormViewModel.setDospem(it)})

        Spacer(modifier= Modifier.padding(16.dp))
        Button(onClick = {onSubmitButtonClick(listDataTxt)}) {
        }

    }
}
//@Composable
//fun SelectDosen(
//    options: List<String>,
//    onSelectionChanged: (String) -> Unit ={}
//){
//    var selectedValue by rememberSaveable{ mutableStateOf("") }
//
//    Column(modifier = Modifier.padding(10.dp)) {
//        options.forEach{ item ->
//            Row(
//                modifier = Modifier.selectable(
//                    selected = selectedValue== item,
//                    onClick = {
//                        selectedValue = item
//                        onSelectionChanged(item)
//                    }
//                ),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                RadioButton(
//                    selected = selectedValue == item,
//                    onClick={
//                        selectedValue = item
//                        onSelectionChanged(item)
//                    }
//                )
//                Text(item)
//            }
//
//        }
//    }
//}
