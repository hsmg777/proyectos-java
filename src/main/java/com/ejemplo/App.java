package com.ejemplo;

/**
 * Hello world!
 */
public class App {
    public static int contarVocales(String texto) {
        if (texto == null) return 0; // ❌ Checkstyle: no usa llaves
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método sin test para que JaCoCo lo marque como no cubierto
    public static boolean contieneA(String texto) {
        return texto != null && texto.contains("a");
    }

    // Método con bug forzado para que SpotBugs lo detecte
    public static int bug() {
        String s = null;
        return s.length(); // ❌ SpotBugs: posible NullPointerException
    }

    public static void main(String[] args) {
        System.out.println("Vocales en 'Hola Mundo': " + contarVocales("Hola Mundo"));
    }
}
