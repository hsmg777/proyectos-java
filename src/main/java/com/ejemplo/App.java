package com.ejemplo;

/**
 * Hello world!
 */
public class App {
public static int contarVocales(String texto) {
        if (texto == null) return 0;
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("Vocales en 'Hola Mundo': " + contarVocales("Hola Mundo"));
    }
}
