package com.tp1.app.rastreador;

public class RastreadorNuevo extends Rastreador {
    @Override
    public Modelo crearModelo() {
        return new Nuevo();
    }
}
