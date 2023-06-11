package com.gonzalez.blanchard.sesion4listasjetpack.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalez.blanchard.sesion4listasjetpack.entity.Contact
import com.gonzalez.blanchard.sesion4listasjetpack.views.components.ElementoContacto

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaListaContactos(
    listaContactos: List<Contact>
){


    Scaffold(
        topBar = {

            TopAppBar(title = { Text(text = "Lista de contactos") })

            }
        ) { it ->

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            items(listaContactos) { contacto ->
                ElementoContacto(
                    contacto = contacto
                )
            }
        }

    }

}


@Preview
@Composable
fun PreviewPantallaListaContactos(){

    val listaContactos = mutableListOf<Contact>()

    for (i in 1..1000) {
        val contact = Contact(
            id = i.toString(),
            nombre = "Jorge ${i}",
            apellido = "Moody",
            telefono = "123456789",
            email = "contacto@gmail.com",
            direccion = "Calle falsa 123",
            empresa = "Empresa",
            puesto = "Puesto",
            notas = "Notas",
            foto = "https://cloudfront-us-east-1.images.arcpublishing.com/eluniverso/NUNM6L7XP26ZH2ZX2UUP7C5JIA.jpg"
        )
        listaContactos.add(contact)
    }

    PantallaListaContactos(listaContactos)
}
