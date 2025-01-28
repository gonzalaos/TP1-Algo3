package com.tp1.app.criterios;

import java.util.HashMap;

import com.tp1.app.Peleador;
import com.tp1.app.rastreador.*;

public class Fuerte extends Criterio {
    @Override
    public String obtenerPeleadorSegunCriterio(HashMap<Peleador, Rastreador> peleadoresYRastreadores) {
        Peleador peleadorFuerte = peleadoresYRastreadores.keySet().stream()
            .max((peleador1, peleador2) -> 
                { int diferencia = peleadoresYRastreadores.get(peleador1).nivelDePeleaDe(peleador1) - peleadoresYRastreadores.get(peleador2).nivelDePeleaDe(peleador2);
                return (diferencia != 0) ? diferencia : -1; }) . orElse(null);
        if (peleadorFuerte != null) {
            return peleadorFuerte.getNombre();
        } else {
            return "";
        }
    }
}
