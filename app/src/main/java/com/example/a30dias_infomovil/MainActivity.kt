package com.example.a30dias_infomovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30dias_infomovil.data.Cantante
import com.example.a30dias_infomovil.data.cantantes
import com.example.a30dias_infomovil.ui.theme._30Dias_INFOMOVILTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30Dias_INFOMOVILTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    CantantesApp()
                }
            }
        }
    }
}

//APP PRINCIPAL

@Composable
fun AgregaBorde(content: @Composable () -> Unit) {
    Surface(
        modifier = Modifier
            .padding(40.dp)
            .background(color = Color.White, shape = RoundedCornerShape(4.dp))
            .shadow(elevation = 12.dp, shape = RectangleShape),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        content()
    }
}

@Composable
fun CantantesApp(){
    Scaffold(
        topBar = {
            CantantesTopBar()
        }
    ){ it ->
        LazyColumn(
            contentPadding = it
        ){
            items(cantantes){
                AgregaBorde {
                    CantanteItem(
                        cantante = it,
                        modifier = Modifier.padding(0.dp)
                    )
                }
            }
        }
    }
}

//PARTES

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CantantesTopBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(64.dp)
                        .padding(8.dp),
                    painter = painterResource(R.drawable.bryant_myers),
                    contentDescription = null
                )
                Text(
                    text = "30 DIAS",
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun CantanteItem(
    cantante: Cantante,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        CantanteDia(cantante.dia)
        CantanteFoto(cantante.imageResourceId)
        CantanteInfo(cantante.name,cantante.descrp)
    }
}

@Composable
fun CantanteDia(
    diaa: String,
    modifier: Modifier = Modifier
){
    Text(
        text = diaa,
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier
            .padding(8.dp)
            .padding(top = 0.dp)
    )
}

@Composable
fun CantanteFoto(
    @DrawableRes cantanteIcon: Int,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier
            .size(280.dp)
            .padding(8.dp)
            .clip(MaterialTheme.shapes.large),
        contentScale = ContentScale.Crop,
        painter = painterResource(cantanteIcon),
        contentDescription = null
    )
}

@Composable
fun CantanteInfo(
    @StringRes namee:Int,
    @StringRes descrip:Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = stringResource(namee),
            modifier = Modifier.padding(24.dp),
            style = MaterialTheme.typography.displaySmall,
        )
        Text(
            text = stringResource(descrip),
            modifier = Modifier.padding(24.dp)
        )
    }
}

//VISUALIZACIÓN EN PANTALLA (tema claro y oscuro)
@Preview()
@Composable
fun CantantesPreview() {
    _30Dias_INFOMOVILTheme {
        CantantesApp()
    }
}

@Preview()
@Composable
fun CantantesDarkThemePreview() {
    _30Dias_INFOMOVILTheme (darkTheme = true){
        CantantesApp()
    }
}