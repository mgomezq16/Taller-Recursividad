package Recursividad;

import java.util.Scanner;

public class Ejercicio7 {

    public static int calcularMCD(int m, int n) {
        // Caso base
        if (n == 0) {
            return m;
        }

        // Caso recursivo
        return calcularMCD(n, m % n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n = scanner.nextInt();

        int resultado = calcularMCD(m, n);

        System.out.println("El M.C.D. de " + m + " y " + n + " es: " + resultado);

        scanner.close();
    }
}
