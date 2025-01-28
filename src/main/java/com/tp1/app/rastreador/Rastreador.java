package com.tp1.app.rastreador;

import com.tp1.app.Peleador;

public abstract class Rastreador {
    public Modelo modelo;

    public abstract Modelo crearModelo();

    public int nivelDePeleaDe(Peleador peleador) {
        this.modelo = crearModelo();
        return modelo.nivelDePeleaDe(peleador);
    }
}
