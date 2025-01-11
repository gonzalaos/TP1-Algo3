package com.tp1.app.transformaciones;

import com.tp1.app.Peleador;

public abstract class Transformacion {
    Peleador peleador;

    public Transformacion(Peleador peleador) {
        this.peleador = peleador;
    }

    public abstract int cambiarKiBase();
}
