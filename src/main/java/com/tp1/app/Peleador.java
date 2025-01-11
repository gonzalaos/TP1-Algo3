package com.tp1.app;

import com.tp1.app.transformaciones.*;

public class Peleador {
    private final String nombre;
    private int kiBase;
    private Transformacion transformacion;

    public Peleador(int kiBase) {
        this.nombre = "";
        this.kiBase = kiBase;
        this.transformacion = new Base(this);
    }

    public Peleador(String nombre, int kiBase, String transformacion) {
        this.nombre = nombre;
        this.kiBase = kiBase;
        if (transformacion.equals("Kaio-Ken")) {
            this.transformacion = new KaioKen(this);
        } else if (transformacion.equals("Mono Gigante")) {
            this.transformacion = new MonoGigante(this);
        } else {
            this.transformacion = new Base(this);
        }
    }

    public int nivelDeKi() {
        return transformacion.cambiarKiBase();
    }

    public int mantenerKiBase() {
        return this.kiBase;
    }

    public int duplicarKiBase() {
        return this.kiBase * 2;
    }

    public int aumentarConsiderablementeKiBase() {
        return this.kiBase * 10;
    }
}
