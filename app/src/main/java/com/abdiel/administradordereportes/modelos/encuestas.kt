package com.abdiel.administradordereportes.modelos

class encuestas(direccion: String, fehcha: String, pregunta1: String, pregunta2: String, pregunta3: String, pregunta4: String, pregunta5: String, pregunta6: String, pregunta7: String, pregunta8: String, latitud:String,longitud: String) {

    var direccion: String = direccion
    var fehcha: String = fehcha
    var pregunta1: String = pregunta1
    var pregunta2: String = pregunta2
    var pregunta3: String = pregunta3
    var pregunta4: String = pregunta4
    var pregunta5: String = pregunta5
    var pregunta6: String = pregunta6
    var pregunta7: String = pregunta7
    var pregunta8: String = pregunta8
    var latitud: String = latitud
    var longitud: String = longitud
    //Constructor
    constructor(): this ("", "", "", "", "", "", "", "", "", "","","")
}