package com.gonzalez.blanchard.sesion3ejemplojetpack.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalez.blanchard.sesion3ejemplojetpack.ui.theme.ColorFondo

@Composable
fun MainScreen(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = ColorFondo)
    ){

        Column(modifier = Modifier.fillMaxWidth()){

            Text(text = "TITULO", color = Color.White, modifier = Modifier.fillMaxWidth())

            DataInfoRow("Nombre", "Jorge")
            DataInfoRow("Apellido", "Moody")
            DataInfoRow("Edad", "25")
            DataInfoRow("Peso", "80")
            DataInfoRow("Altura", "1.80")
            DataInfoRow("Nacionalidad", "Argentina")
            DataInfoRow("DNI", "12345678")

        }
    }
}

@Preview
@Composable
fun PreviewMainScreen(){
    MainScreen()
}



