package Recursividad;

import java.util.Scanner;

public class Ejercicio1 {

    public static long calcularFactorial(int numero) {
        // Caso base
        if (numero == 0) {
            return 1;
        }

        // Caso recursivo
        return numero * calcularFactorial(numero - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        long resultado = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(n)