package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testContarVocales() {
        assertEquals(4, App.contarVocales("Hola Mundo"));
        assertEquals(0, App.contarVocales(""));
        assertEquals(0, App.contarVocales(null));
    }

    // No se agrega test para contieneA ni bug() para forzar errores
}
