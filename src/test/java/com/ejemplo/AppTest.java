package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para App.
 */
public class AppTest {

    @Test
    public void testContarVocales() {
        assertEquals(4, App.contarVocales("Hola Mundo"));
        assertEquals(0, App.contarVocales(""));
        assertEquals(0, App.contarVocales(null));
    }

    @Test
    public void testContieneA() {
        assertTrue(App.contieneA("banana"));
        assertFalse(App.contieneA("xyz"));
        assertFalse(App.contieneA(null));
    }

    @Test
    public void testBug() {
        assertEquals(-1, App.bug()); // Se espera -1 como valor seguro si la cadena es null
    }
}
