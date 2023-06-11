package com.gonzalez.blanchard.sesion4listasjetpack.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DataInfoRow (
    titulo: String,
    valor: String
){
    Row (
        modifier = Modifier.fillMaxWidth()
            ){

        Text(text = titulo)

        Text(text = valor, modifier = Modifier.fillMaxWidth(), color = Color.White)

    }
}

@Preview
@Composable
fun PreviewDataInfoRow(){
    DataInfoRow("Nombre", "Juan")
}