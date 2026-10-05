package Recursividad;

import java.util.Scanner;

public class Ejercicio12 {

    public static int fibonacci(int numero) {
        // Casos base
        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }

        // Caso recursivo
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite de la serie: ");
        int limite = scanner.nextInt();

        if (limite < 0) {
            System.out.println("El límite debe ser mayor o igual a 0.");
        } else {
            System.out.println("Serie de Fibonacci:");

            for (int i = 0; i <= limite; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        scanner.close();
    }
}