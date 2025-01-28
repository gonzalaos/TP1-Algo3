package com.tp1.app.criterios;

import java.util.HashMap;

import com.tp1.app.Peleador;
import com.tp1.app.rastreador.*;

public class Debil extends Criterio{
    @Override
    public String obtenerPeleadorSegunCriterio(HashMap<Peleador, Rastreador> peleadoresYRastreadores) {
        Peleador peleadorDebil = peleadoresYRastreadores.keySet().stream()
            .min((peleador1, peleador2) -> 
                { int diferencia = peleadoresYRastreadores.get(peleador1).nivelDePeleaDe(peleador1) - peleadoresYRastreadores.get(peleador2).nivelDePeleaDe(peleador2);
                return (diferencia != 0) ? diferencia : -1; }) . orElse(null);
        if (peleadorDebil != null) {
            return peleadorDebil.getNombre();
        } else {
            return "";
        }
    }
}
