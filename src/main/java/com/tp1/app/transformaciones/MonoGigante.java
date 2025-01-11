package com.tp1.app.transformaciones;

import com.tp1.app.Peleador;

public class MonoGigante extends Transformacion {
    public MonoGigante(Peleador peleador) {
        super(peleador);
    }

    @Override
    public int cambiarKiBase() {
        return this.peleador.aumentarConsiderablementeKiBase();
    }
}
