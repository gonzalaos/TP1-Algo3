package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tp1.app.rastreador.*;

public class RastreadorTest {
    @Test
    public void test01DetectaMalElKiDeUnPeleadorSiEsteEsMayorA9000YEsRastreadorViejo() {
        // Arrange
        int kiEsperado = 9000;
        Rastreador rastreador = new RastreadorViejo();

        // Act
        int kiObtenido = rastreador.nivelDePeleaDe(new Peleador("Goku", 5000, "Kaio-Ken"));

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test02DetectaBienElKiDeUnPeleadorSiEsteEsMayorA9000YEsRastreadorNuevo() {
        // Arrange
        int kiEsperado = 10000;
        Rastreador rastreador = new RastreadorNuevo();

        // Act
        int kiObtenido = rastreador.nivelDePeleaDe(new Peleador("Goku", 5000, "Kaio-Ken"));

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }
}
