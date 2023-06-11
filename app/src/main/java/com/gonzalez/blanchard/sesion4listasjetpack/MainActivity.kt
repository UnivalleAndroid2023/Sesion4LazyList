package com.gonzalez.blanchard.sesion4listasjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalez.blanchard.sesion4listasjetpack.entity.Contact
import com.gonzalez.blanchard.sesion4listasjetpack.ui.theme.Sesion3EjemploJetpackTheme
import com.gonzalez.blanchard.sesion4listasjetpack.views.PantallaListaContactos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sesion3EjemploJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


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
                            foto = "Foto"
                        )
                        listaContactos.add(contact)
                    }

                    PantallaListaContactos(listaContactos)

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sesion3EjemploJetpackTheme {

    }
}