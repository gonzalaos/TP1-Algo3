package com.tp1.app.transformaciones;

import com.tp1.app.Peleador;

public class KaioKen extends Transformacion {
    public KaioKen(Peleador peleador) {
        super(peleador);
    }

    @Override
    public int cambiarKiBase() {
        return this.peleador.duplicarKiBase();
    }
}
