package com.tp1.app.rastreador;

public class RastreadorViejo extends Rastreador {
    @Override
    public Modelo crearModelo() {
        return new Viejo();
    }
}
