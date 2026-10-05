package Recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        Factorial factorial = new Factorial();
        long resultado = factorial.calcular(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        scanner.close();
    }
}