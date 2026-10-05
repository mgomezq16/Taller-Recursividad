package Recursividad;

import java.util.Scanner;

public class Ejercicio8 {

    public static int calcularCociente(int dividendo, int divisor) {
        // Caso base
        if (dividendo < divisor) {
            return 0;
        }

        // Caso recursivo
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        if (dividendo < 0 || divisor <= 0) {
            System.out.println("Ingrese valores positivos. El divisor debe ser mayor que 0.");
        } else {
            int resultado = calcularCociente(dividendo, divisor);

            System.out.println(
                "El cociente de " + dividendo + " / " + divisor + " es: " + resultado
            );
        }

        scanner.close();
    }
}