package com.tp1.app.criterios;

import java.util.HashMap;

import com.tp1.app.Peleador;
import com.tp1.app.rastreador.*;

public class Debil extends Criterio{
    @Override
    public String obtenerPeleadorSegunCriterio(HashMap<Peleador, Rastreador> peleadoresYRastreadores) {
        Peleador peleadorDebil = null;
        int nivelDePeleaMinimo = Integer.MAX_VALUE;
        for (Peleador peleador : peleadoresYRastreadores.keySet()) {
            int nivelDePelea = peleadoresYRastreadores.get(peleador).nivelDePeleaDe(peleador);
            if (nivelDePelea < nivelDePeleaMinimo) {
                nivelDePeleaMinimo = nivelDePelea;
                peleadorDebil = peleador;
            }
        }
        return peleadorDebil.getNombre();
    }
}
