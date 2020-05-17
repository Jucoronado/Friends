package com.gicogu.friends

class FrienDato {
    var nombre: String? = null
    var imagen: Int? = null
    var rankeo: Float? = null

    constructor(nombre: String?, imagen: Int?, rankeo: Float) {
        this.nombre = nombre
        this.imagen = imagen
        this.rankeo = rankeo
    }
}