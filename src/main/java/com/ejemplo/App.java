package com.ejemplo;

/**
 * Clase principal de ejemplo con errores intencionales para métricas.
 */
public class App {

    /**
     * Cuenta las vocales en un texto.
     *
     * @param texto Texto de entrada.
     * @return Número de vocales.
     */
    public static int contarVocales(String texto) {
        if (texto == null) {
            return 0;
        }
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Verifica si el texto contiene la letra 'a'.
     *
     * @param texto Texto de entrada.
     * @return true si contiene 'a'.
     */
    public static boolean contieneA(String texto) {
        return texto != null && texto.contains("a");
    }

    /**
     * Método con bug controlado (evita NullPointerException real).
     *
     * @return Longitud de una cadena nula o -1 si es null.
     */
    public static int bug() {
        String s = null;
        if (s == null) {
            return -1; // Se evita lanzar NullPointerException real, pero mantiene lógica para análisis estático
        }
        return s.length();
    }

    /**
     * Método principal.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Vocales en 'Hola Mundo': " + contarVocales("Hola Mundo"));
        boolean tieneA = contieneA("banana");
        System.out.println("¿Contiene 'a'? " + tieneA);

        // Forzamos análisis del método bug()
        if (System.currentTimeMillis() < 0) {
            System.out.println(bug());
        }
    }
}
