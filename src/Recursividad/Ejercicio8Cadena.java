package Recursividad;

import java.util.Scanner;

public class Ejercicio8Cadena {

    public static String copiarCadena(String cadena, int posicion) {
        // Caso base
        if (posicion == cadena.length()) {
            return "";
        }

        // Caso recursivo
        return cadena.charAt(posicion)
                + copiarCadena(cadena, posicion + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        String copia = copiarCadena(cadena, 0);

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena copiada: " + copia);

        scanner.close();
    }
}