package Recursividad;

import java.util.Scanner;

public class Ejercicio10 {

    public static int sumarVector(int[] vector, int posicion) {
        // Caso base
        if (posicion == vector.length) {
            return 0;
        }

        // Caso recursivo
        return vector[posicion] + sumarVector(vector, posicion + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int resultado = sumarVector(vector, 0);

        System.out.println("La suma de los elementos es: " + resultado);

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(n)