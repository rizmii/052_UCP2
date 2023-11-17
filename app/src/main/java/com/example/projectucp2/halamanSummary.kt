package com.example.projectucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.projectucp2.data.FormUIState

@Composable
fun halamanSummary (
    formUiState: FormUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier

) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Text(text = "Nama")
            Text(text = formUiState.nama)
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "NIM")
            Text(text = formUiState.nim)
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Konsentrasi")
            Text(text = formUiState.konsentrasi)
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Judul Skripsi")
            Text(text = formUiState.judulSkripsi)
            Divider()
            Spacer(modifier = Modifier.padding(16.dp))
            Button(onClick = onCancelButtonClicked) {
                Text(text = stringResource(id = R.string.back_button))
            }

        }
    }
}