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
        if (texto == null) { // ✅ Checkstyle requiere llaves
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
     * Método con bug forzado (NullPointerException).
     *
     * @return Longitud de una cadena nula.
     */
    public static int bug() {
        String s = null;
        return s.length(); // ❌ SpotBugs debe detectar posible NullPointerException
    }

    public static void main(String[] args) {
        System.out.println("Vocales en 'Hola Mundo': " + contarVocales("Hola Mundo"));
        contieneA("banana");

        // Forzamos análisis del método bug()
        if (System.currentTimeMillis() < 0) {
            bug(); // Nunca se ejecuta, pero se asegura que SpotBugs lo analice
        }
    }
}
