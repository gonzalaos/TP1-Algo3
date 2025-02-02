package com.tp1.app.criterios;

import java.util.HashMap;

import com.tp1.app.Peleador;
import com.tp1.app.rastreador.*;

public class Fuerte extends Criterio {
    @Override
    public String obtenerPeleadorSegunCriterio(HashMap<Peleador, Rastreador> peleadoresYRastreadores) {
        Peleador peleadorFuerte = null;
        int nivelDePeleaMaximo = 0;
        for (Peleador peleador : peleadoresYRastreadores.keySet()) {
            int nivelDePelea = peleadoresYRastreadores.get(peleador).nivelDePeleaDe(peleador);
            if (nivelDePelea > nivelDePeleaMaximo) {
                nivelDePeleaMaximo = nivelDePelea;
                peleadorFuerte = peleador;
            }
        }
        return peleadorFuerte.getNombre();
    }
}
