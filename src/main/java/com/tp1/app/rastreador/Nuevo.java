package com.tp1.app.rastreador;

import com.tp1.app.Peleador;

public class Nuevo implements Modelo {
    @Override
    public int nivelDePeleaDe(Peleador peleador) {
        return peleador.nivelDeKi();
    }

}
