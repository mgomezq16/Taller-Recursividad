package Recursividad;

import java.util.Scanner;

public class Ejercicio11 {

    public static int sumarMatriz(int[][] matriz, int fila, int columna) {
        // Caso base
        if (fila == matriz.length) {
            return 0;
        }

        if (columna == matriz[0].length) {
            return sumarMatriz(matriz, fila + 1, 0);
        }

        // Caso recursivo
        return matriz[fila][columna]
                + sumarMatriz(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(
                    "Ingrese el elemento [" + i + "][" + j + "]: "
                );
                matriz[i][j] = scanner.nextInt();
            }
        }

        int resultado = sumarMatriz(matriz, 0, 0);

        System.out.println("La suma de los elementos es: " + resultado);

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(mn)