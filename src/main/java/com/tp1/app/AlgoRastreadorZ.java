package com.tp1.app;

import java.util.HashMap;

import com.tp1.app.rastreador.*;

public class AlgoRastreadorZ {
    private String criterio;

    private HashMap<Peleador, Rastreador> peleadoresYRastreadores = new HashMap<>();
    private HashMap<String, Rastreador> modelosDeRastreadores = new HashMap<>();
    
    AlgoRastreadorZ(String criterio) {
        this.criterio = criterio;
    }

    public void registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion(String modelo, String nombre, int kiBase, String transformacion) {
        modelosDeRastreadores.put("Nuevo", new RastreadorNuevo());
        modelosDeRastreadores.put("Viejo", new RastreadorViejo());
        if(modelosDeRastreadores.containsKey(modelo)) {
            peleadoresYRastreadores.put(new Peleador(nombre, kiBase, transformacion), modelosDeRastreadores.get(modelo));
        }        
    }

    public int nivelDePeleaDe(String nombre) {
        Peleador peleadorEncontrado = peleadoresYRastreadores.keySet().stream()
            .filter(peleador -> peleador.mismoNombre(nombre))
            .findFirst()
            .orElse(null);
        if (peleadorEncontrado != null) {
            return peleadoresYRastreadores.get(peleadorEncontrado).nivelDePeleaDe(peleadorEncontrado);
        }
        return 0;
    }

    public String obtenerPeleadorSegunCriterio() {
        return "";
    }
}
