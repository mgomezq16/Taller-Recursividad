package Recursividad;

import java.util.Scanner;

public class Ejercicio9 {

    public static int multiplicar(int numero1, int numero2) {
        // Caso base
        if (numero2 == 0) {
            return 0;
        }

        // Caso recursivo
        return numero1 + multiplicar(numero1, numero2 - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            System.out.println("Ingrese números positivos o cero.");
        } else {
            int resultado = multiplicar(numero1, numero2);

            System.out.println(
                "El resultado de " + numero1 + " x " + numero2 + " es: " + resultado
            );
        }

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(n)