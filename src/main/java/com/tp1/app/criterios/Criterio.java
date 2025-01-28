package com.tp1.app.criterios;

import java.util.HashMap;

import com.tp1.app.Peleador;
import com.tp1.app.rastreador.*;

public abstract class Criterio {
    public abstract String obtenerPeleadorSegunCriterio(HashMap<Peleador, Rastreador> peleadoresYRastreadores);
}
