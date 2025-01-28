package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tp1.app.transformaciones.*;

public class TransformacionTest {
    @Test
    public void test01LaTransformacionBaseRetornaElMismoKi() {
        // Arrange
        int kiBase = 5000;
        int kiEsperado = 5000;
        Transformacion transformacion = new Base();

        // Act
        int kiObtenido = transformacion.cambiarKiBase(kiBase);

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test02LaTransformacionKaioKenAumentaElKi() {
        // Arrange
        int kiBase = 5000;
        int kiEsperado = 10000;
        Transformacion transformacion = new KaioKen();

        // Act
        int kiObtenido = transformacion.cambiarKiBase(kiBase);

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test03LaTransformacionMonoGiganteAumentaConsiderablementeElKi() {
        // Arrange
        int kiBase = 6000;
        int kiEsperado = 60000;
        Transformacion transformacion = new MonoGigante();

        // Act
        int kiObtenido = transformacion.cambiarKiBase(kiBase);

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }
}
