package com.gonzalez.blanchard.sesion4listasjetpack.views.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.gonzalez.blanchard.sesion4listasjetpack.entity.Contact

@Composable
fun ElementoContacto(
    contacto: Contact
){

    Row (modifier = Modifier.padding(
        start = 5.dp,
        end = 5.dp,
        top = 10.dp,
        bottom = 10.dp
    ).fillMaxWidth().padding(5.dp)){


        AsyncImage(
            model = "https://cloudfront-us-east-1.images.arcpublishing.com/eluniverso/NUNM6L7XP26ZH2ZX2UUP7C5JIA.jpg",
            contentDescription = contacto.nombre,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )


        Column(modifier = Modifier.fillMaxWidth()){

            Row {
                Text(text = "Nombre:", modifier = Modifier.width(100.dp))
                Text(text = contacto.nombre + " " + contacto.apellido,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Red,
                        letterSpacing = 2.sp
                    )
                )
            }

            Row {
                Text(text = "Telefono:", modifier = Modifier.width(100.dp))
                Text(text = contacto.telefono, modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.Blue,
                        letterSpacing = 2.sp
                    )
                )
            }

        }



    }



}

@Preview
@Composable
fun PreviewElementoContacto(){
    ElementoContacto(
        Contact(
            id = 'a'.toString(),
            nombre = "Jorge",
            apellido = "Moody",
            telefono = "123456789",
            email = "contacto@gmail.com",
            direccion = "Calle falsa 123",
            empresa = "Empresa",
            puesto = "Puesto",
            notas = "Notas",
            foto = "https://cloudfront-us-east-1.images.arcpublishing.com/eluniverso/NUNM6L7XP26ZH2ZX2UUP7C5JIA.jpg"
        )
    )
}