package com.tp1.app;

import java.util.HashMap;

import com.tp1.app.transformaciones.*;

public class Peleador {
    private final String nombre;
    private int kiBase;
    private Transformacion transformacion;
    private HashMap<String, Transformacion> transformaciones = new HashMap<>();

    public Peleador(int kiBase) {
        this.nombre = "";
        this.kiBase = kiBase;
        this.transformacion = new Base(this);
    }

    public Peleador(String nombre, int kiBase, String transformacion) {
        this.nombre = nombre;
        this.kiBase = kiBase;
        transformaciones.put("Base", new Base(this));
        transformaciones.put("Kaio-Ken", new KaioKen(this));
        transformaciones.put("Mono Gigante", new MonoGigante(this));
        if(transformaciones.containsKey(transformacion)) {
            this.transformacion = transformaciones.get(transformacion);
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

    public boolean mismoNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
}
