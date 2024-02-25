package com.example.a30dias_infomovil.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30dias_infomovil.R

data class Cantante(
    val dia: String,
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val descrp: Int,
)

val cantantes = listOf(
    Cantante("Dia 1", R.drawable.myke_towers,R.string.nombre1,R.string.descripcionGeneral),
    Cantante("Dia 2", R.drawable.jhayco,R.string.nombre2,R.string.descripcionGeneral),
    Cantante("Dia 3", R.drawable.tainy,R.string.nombre3,R.string.descripcionGeneral),
    Cantante("Dia 4", R.drawable.bryant_myers,R.string.nombre4,R.string.descripcionGeneral),
    Cantante("Dia 5", R.drawable.tainy,R.string.nombre5,R.string.descripcionGeneral),
    Cantante("Dia 6", R.drawable.tainy,R.string.nombre6,R.string.descripcionGeneral),
    Cantante("Dia 7", R.drawable.tainy,R.string.nombre7,R.string.descripcionGeneral),
    Cantante("Dia 8", R.drawable.ic_launcher_foreground,R.string.nombre8,R.string.descripcionGeneral),
    Cantante("Dia 9", R.drawable.ic_launcher_foreground,R.string.nombre9,R.string.descripcionGeneral),
    Cantante("Dia 10", R.drawable.ic_launcher_foreground,R.string.nombre10,R.string.descripcionGeneral),
    Cantante("Dia 11", R.drawable.ic_launcher_foreground,R.string.nombre11,R.string.descripcionGeneral),
    Cantante("Dia 12", R.drawable.ic_launcher_foreground,R.string.nombre12,R.string.descripcionGeneral),
    Cantante("Dia 13", R.drawable.ic_launcher_foreground,R.string.nombre13,R.string.descripcionGeneral),
    Cantante("Dia 14", R.drawable.ic_launcher_foreground,R.string.nombre14,R.string.descripcionGeneral),
    Cantante("Dia 15", R.drawable.ic_launcher_foreground,R.string.nombre15,R.string.descripcionGeneral),
    Cantante("Dia 16", R.drawable.ic_launcher_foreground,R.string.nombre16,R.string.descripcionGeneral),
    Cantante("Dia 17", R.drawable.ic_launcher_foreground,R.string.nombre17,R.string.descripcionGeneral),
    Cantante("Dia 18", R.drawable.ic_launcher_foreground,R.string.nombre18,R.string.descripcionGeneral),
    Cantante("Dia 19", R.drawable.ic_launcher_foreground,R.string.nombre19,R.string.descripcionGeneral),
    Cantante("Dia 20", R.drawable.ic_launcher_foreground,R.string.nombre20,R.string.descripcionGeneral),
    Cantante("Dia 21", R.drawable.ic_launcher_foreground,R.string.nombre21,R.string.descripcionGeneral),
    Cantante("Dia 22", R.drawable.ic_launcher_foreground,R.string.nombre22,R.string.descripcionGeneral),
    Cantante("Dia 23", R.drawable.ic_launcher_foreground,R.string.nombre23,R.string.descripcionGeneral),
    Cantante("Dia 24", R.drawable.ic_launcher_foreground,R.string.nombre24,R.string.descripcionGeneral),
    Cantante("Dia 25", R.drawable.ic_launcher_foreground,R.string.nombre25,R.string.descripcionGeneral),
    Cantante("Dia 26", R.drawable.ic_launcher_foreground,R.string.nombre26,R.string.descripcionGeneral),
    Cantante("Dia 27", R.drawable.ic_launcher_foreground,R.string.nombre27,R.string.descripcionGeneral),
    Cantante("Dia 28", R.drawable.ic_launcher_foreground,R.string.nombre28,R.string.descripcionGeneral),
    Cantante("Dia 29", R.drawable.ic_launcher_foreground,R.string.nombre29,R.string.descripcionGeneral),
    Cantante("Dia 30", R.drawable.ic_launcher_foreground,R.string.nombre30,R.string.descripcionGeneral),

)
