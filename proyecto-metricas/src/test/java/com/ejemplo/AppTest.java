package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
     @Test
    public void testContarVocales() {
        assertEquals(4, App.contarVocales("Hola Mundo"));
        assertEquals(0, App.contarVocales(""));
        assertEquals(0, App.contarVocales(null));
    }
}
