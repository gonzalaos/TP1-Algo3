package com.tp1.app.transformaciones;

import com.tp1.app.Peleador;

public class Base extends Transformacion {
    public Base(Peleador peleador) {
        super(peleador);
    }

    @Override
    public int cambiarKiBase() {
        return this.peleador.mantenerKiBase();
    }
}
