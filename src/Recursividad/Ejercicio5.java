package Recursividad;

import java.util.Scanner;

public class Ejercicio5 {

    public static int sumarDigitos(int numero) {
        // Caso base
        if (numero == 0) {
            return 0;
        }

        // Obtener el último dígito
        int digito = numero % 10;

        // Caso recursivo
        return digito + sumarDigitos(numero / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int resultado = sumarDigitos(numero);

        System.out.println("La suma de los dígitos es: " + resultado);

        scanner.close();
    }
}
