package Recursividad;

import java.util.Scanner;

public class Ejercicio2 {

    public static int calcularSumatoria(int numero) {
        // Caso base
        if (numero == 0) {
            return 0;
        }

        // Caso recursivo
        return numero + calcularSumatoria(numero - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int resultado = calcularSumatoria(numero);

        System.out.println("La sumatoria hasta " + numero + " es: " + resultado);

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(n)