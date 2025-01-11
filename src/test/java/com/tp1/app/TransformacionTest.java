package com.tp1.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tp1.app.transformaciones.*;

public class TransformacionTest {
    @Test
    public void test01LaTransformacionBaseRetornaElMismoKi() {
        // Arrange
        int kiEsperado = 5000;
        Transformacion transformacion = new Base(new Peleador(5000));

        // Act
        int kiObtenido = transformacion.cambiarKiBase();

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test02LaTransformacionKaioKenAumentaElKi() {
        // Arrange
        int kiEsperado = 10000;
        Transformacion transformacion = new KaioKen(new Peleador(5000));

        // Act
        int kiObtenido = transformacion.cambiarKiBase();

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }

    @Test
    public void test03LaTransformacionMonoGiganteAumentaConsiderablementeElKi() {
        // Arrange
        int kiEsperado = 60000;
        Transformacion transformacion = new MonoGigante(new Peleador(6000));

        // Act
        int kiObtenido = transformacion.cambiarKiBase();

        // Assert
        assertEquals(kiEsperado, kiObtenido);
    }
}
