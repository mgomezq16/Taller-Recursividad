package Recursividad;

import java.util.Scanner;

public class Ejercicio4 {

    public static int invertir(int numero, int invertido) {
        // Caso base
        if (numero == 0) {
            return invertido;
        }

        // Obtener el último dígito
        int digito = numero % 10;

        // Construir el número invertido
        invertido = invertido * 10 + digito;

        // Llamada recursiva
        return invertir(numero / 10, invertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int resultado = invertir(numero, 0);

        System.out.println("El número invertido es: " + resultado);

        scanner.close();
    }
}
