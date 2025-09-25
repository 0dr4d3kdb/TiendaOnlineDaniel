package com.example.tiendaonlinedaniel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendaonlinedaniel.model.Mensaje
import com.example.tiendaonlinedaniel.ui.theme.TiendaOnlineDanielTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //TiendaOnlineDanielTheme
            TarjetaConMensaje(
                Mensaje("Daniel", "Bienvenido a la primera clase")
            )

        }
    }
}
@Composable
fun TarjetaConMensaje(mensaje: Mensaje){
    Row(modifier = Modifier.padding(all = 10.dp)) {

        Image(painter = painterResource(R.drawable.fotoperfil),
            contentDescription = "Imagen de perfil",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape))
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(mensaje.autor)
            Spacer(modifier = Modifier.height(7.dp))
            Text(mensaje.cuerpo)
        }

    }
}

@Preview
@Composable
fun VistaPreviaTarjetaConMensaje(){
    TarjetaConMensaje(
        Mensaje("Daniel", "Bienvenido a la primera clase")
    )
}
