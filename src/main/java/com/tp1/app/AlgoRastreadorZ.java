package com.tp1.app;

import java.util.*;

import com.tp1.app.rastreador.*;
import com.tp1.app.criterios.*;

public class AlgoRastreadorZ {
    private Criterio criterio;

    private HashMap<String, Criterio> criterios = new HashMap<>();
    private HashMap<Peleador, Rastreador> peleadoresYRastreadores = new LinkedHashMap<>();
    
    AlgoRastreadorZ(String criterio) {
        this.criterios.put("Fuerte", new Fuerte());
        this.criterios.put("Debil", new Debil());
        if(criterios.containsKey(criterio)) {
            this.criterio = criterios.get(criterio);
        }
    }

    public void registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion(String modelo, String nombre, int kiBase, String transformacion) {
        Rastreador rastreador = null;
        if (modelo.equals("Nuevo")) {
            rastreador = new RastreadorNuevo();
        } else if (modelo.equals("Viejo")) {
            rastreador = new RastreadorViejo();
        }        
        peleadoresYRastreadores.put(new Peleador(nombre, kiBase, transformacion), rastreador);
    }

    public int nivelDePeleaDe(String nombre) {
        Peleador peleadorEncontrado = peleadoresYRastreadores.keySet().stream()
            .filter(peleador -> peleador.mismoNombre(nombre))
            .findFirst()
            .orElse(null);
        if (peleadorEncontrado != null) {
            return peleadoresYRastreadores.get(peleadorEncontrado).nivelDePeleaDe(peleadorEncontrado);
        } else {
            return 0;
        }
    }

    public String obtenerPeleadorSegunCriterio() {
        return criterio.obtenerPeleadorSegunCriterio(peleadoresYRastreadores);
    }
}
