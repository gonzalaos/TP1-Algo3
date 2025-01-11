package com.tp1.app.rastreador;

import com.tp1.app.Peleador;

public class Viejo implements Modelo {
    @Override
    public int nivelDePeleaDe(Peleador peleador) {
        return Math.min(peleador.nivelDeKi(), 9000);
    }
}
