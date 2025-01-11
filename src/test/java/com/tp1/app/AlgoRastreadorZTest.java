package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoRastreadorZTest {
    @Test
    public void test01UnPeleadorConCiertoKiYTransformacionPoseeElSiguienteNivelDePelea() {
        // Arrange
        int kiEsperado = 5000;
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Goku", 5000, "Base");
        
        // Act
        int kiObtenido = algoRastreadorZ.nivelDePeleaDe("Goku");

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test02UnPeleadorConUnKiMayorA9000RompeElRastreadorViejo() {
        // Arrange
        int kiEsperado = 9000;
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Goku", 5000, "Kaio-Ken");
        
        // Act
        int kiObtenido = algoRastreadorZ.nivelDePeleaDe("Goku");

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test03UnPeleadorConUnKiMayorA9000EsLeidoCorrectamentePorElRastreadorNuevo() {
        // Arrange
        int kiEsperado = 10000;
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Goku", 5000, "Kaio-Ken");
        
        // Act
        int kiObtenido = algoRastreadorZ.nivelDePeleaDe("Goku");

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test04EntreUnPeleadorYOtroElRastreadorDetectaAlMasFuerte() {
        // Arrange
        String peleadorMasFuerteEsperado = "Goku";
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Goku", 5000, "Base");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Napa", 4000, "Base");
        
        // Act
        String peleadorMasFuerte = algoRastreadorZ.obtenerPeleadorSegunCriterio();

        // Assert
        assertEquals(peleadorMasFuerteEsperado, peleadorMasFuerte);
    }

    @Test
    public void test05UnPeleadorQueSeTransformaEnMonoGiganteAumentaConsiderablementeSuNivelDePelea() {
        // Arrange
        int kiEsperado = 60000;
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Vegeta", 6000, "Mono Gigante");
        
        // Act
        int kiObtenido = algoRastreadorZ.nivelDePeleaDe("Vegeta");

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test06EntreDosPeleadoresQueSuperan9000DePoderDePeleaElRastreadorViejoNoDetectaCorrectamente() {
        // Arrange
        String peleadorMasFuerteEsperado = "Goku";
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Goku", 5000, "Kaio-Ken");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Vegeta", 6000, "Mono Gigante");
        
        // Act
        String peleadorMasFuerte = algoRastreadorZ.obtenerPeleadorSegunCriterio();

        // Assert
        assertEquals(peleadorMasFuerteEsperado, peleadorMasFuerte);
    }

    @Test
    public void test07EntreDosPeleadoresQueSuperan9000DePoderDePeleaElRastreadorNuevoDetectaCorrectamenteAlMasFuerte() {
        // Arrange
        String peleadorMasFuerteEsperado = "Vegeta";
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Goku", 5000, "Kaio-Ken");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Vegeta", 6000, "Mono Gigante");
        
        // Act
        String peleadorMasFuerte = algoRastreadorZ.obtenerPeleadorSegunCriterio();

        // Assert
        assertEquals(peleadorMasFuerteEsperado, peleadorMasFuerte);
    }

    @Test
    public void test08EntreLosSiguientesPeleadoresElMasDebilEsElSiguiente() {
        // Arrange
        String peleadorMasFuerteEsperado = "Napa";
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Debil");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Goku", 5000, "Kaio-Ken");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Vegeta", 6000, "Mono Gigante");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Napa", 4000, "Base");
        
        // Act
        String peleadorMasFuerte = algoRastreadorZ.obtenerPeleadorSegunCriterio();

        // Assert
        assertEquals(peleadorMasFuerteEsperado, peleadorMasFuerte);
    }

    @Test
    public void test09EntreLosSiguientesPeleadoresElMasFuerteEsElSiguiente() {
        // Arrange
        String peleadorMasFuerteEsperado = "Goku";
        AlgoRastreadorZ algoRastreadorZ = new AlgoRastreadorZ("Fuerte");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Nuevo", "Goku", 5000, "Kaio-Ken");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Vegeta", 6000, "Mono Gigante");
        algoRastreadorZ.registrarRastreoConModeloDelPeleadorConNombreKiBaseYTransformacion("Viejo", "Napa", 4000, "Base");
        
        // Act
        String peleadorMasFuerte = algoRastreadorZ.obtenerPeleadorSegunCriterio();

        // Assert
        assertEquals(peleadorMasFuerteEsperado, peleadorMasFuerte);
    }
}
