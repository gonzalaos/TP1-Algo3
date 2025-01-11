package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PeleadorTest {
    @Test
    public void test01UnPeleadorConTransformacionBaseMantieneElMismoKi() {
        // Arrange
        int kiEsperado = 5000;
        Peleador peleador = new Peleador("Goku", 5000, "Base");
        
        // Act
        int kiObtenido = peleador.nivelDeKi();
        
        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test02UnPeleadorConTransformacionKaioKenDuplicaSuKi() {
        // Arrange
        int kiEsperado = 10000;
        Peleador peleador = new Peleador("Goku", 5000, "Kaio-Ken");
        
        // Act
        int kiObtenido = peleador.nivelDeKi();

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test03UnPeleadorConTransformacionMonoGiganteAumentaConsiderablementeSuKi() {
        // Arrange
        int kiEsperado = 5000 * 10;
        Peleador peleador = new Peleador("Goku", 5000, "Mono Gigante");
        
        // Act
        int kiObtenido = peleador.nivelDeKi();

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }
}
