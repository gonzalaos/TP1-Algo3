package com.tp1.app.transformaciones;

public class Transformacion {
    int multiplicador;

    public Transformacion() {
        this.multiplicador = 1;
    }

    public int cambiarKiBase(int kiBase) {
        return kiBase * this.multiplicador;
    }
}
