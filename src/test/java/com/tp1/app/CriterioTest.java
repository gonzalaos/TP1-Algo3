package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

import com.tp1.app.criterios.*;
import com.tp1.app.rastreador.*;

public class CriterioTest {
    @Test
    public void test01ElCriterioDebilDevuelveAlPeleadorConMenorKi() {
        // Arrange
        String peleadorEsperado = "Napa";
        Criterio criterio = new Debil();
        HashMap<Peleador, Rastreador> peleadoresYRastreadores = new HashMap<>();
        peleadoresYRastreadores.put(new Peleador("Goku", 5000, "Base"), new RastreadorViejo());
        peleadoresYRastreadores.put(new Peleador("Napa", 4000, "Base"), new RastreadorViejo());

        // Act
        String peleadorObtenido = criterio.obtenerPeleadorSegunCriterio(peleadoresYRastreadores);

        // Assert
        assertEquals(peleadorEsperado, peleadorObtenido);
    }

    @Test
    public void test02ElCriterioDebilDevuelveAlPrimerPeleadorSiHayDosConElMismoKi() {
        // Arrange
        String peleadorEsperado = "Goku";
        Criterio criterio = new Debil();
        HashMap<Peleador, Rastreador> peleadoresYRastreadores = new LinkedHashMap<>();
        peleadoresYRastreadores.put(new Peleador("Goku", 5000, "Base"), new RastreadorNuevo());
        peleadoresYRastreadores.put(new Peleador("Napa", 5000, "Base"), new RastreadorNuevo());

        // Act
        String peleadorObtenido = criterio.obtenerPeleadorSegunCriterio(peleadoresYRastreadores);

        // Assert
        assertEquals(peleadorEsperado, peleadorObtenido);
    }

    @Test
    public void test03ElCriterioFuerteDevuelveAlPeleadorConMayorKi() {
        // Arrange
        String peleadorEsperado = "Goku";
        Criterio criterio = new Fuerte();
        HashMap<Peleador, Rastreador> peleadoresYRastreadores = new HashMap<>();
        peleadoresYRastreadores.put(new Peleador("Goku", 5000, "Base"), new RastreadorViejo());
        peleadoresYRastreadores.put(new Peleador("Napa", 4000, "Base"), new RastreadorViejo());

        // Act
        String peleadorObtenido = criterio.obtenerPeleadorSegunCriterio(peleadoresYRastreadores);

        // Assert
        assertEquals(peleadorEsperado, peleadorObtenido);
    }

    @Test
    public void test04ElCriterioFuerteDevuelveAlPrimerPeleadorSiHayDosConElMismoKi() {
        // Arrange
        String peleadorEsperado = "Goku";
        Criterio criterio = new Fuerte();
        HashMap<Peleador, Rastreador> peleadoresYRastreadores = new LinkedHashMap<>();
        peleadoresYRastreadores.put(new Peleador("Goku", 5000, "Base"), new RastreadorNuevo());
        peleadoresYRastreadores.put(new Peleador("Napa", 5000, "Base"), new RastreadorNuevo());

        // Act
        String peleadorObtenido = criterio.obtenerPeleadorSegunCriterio(peleadoresYRastreadores);

        // Assert
        assertEquals(peleadorEsperado, peleadorObtenido);
    }
}
