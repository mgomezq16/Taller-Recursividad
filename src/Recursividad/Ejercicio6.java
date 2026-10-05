package Recursividad;

import java.util.Scanner;

public class Ejercicio6 {

    public static int calcularPotencia(int base, int exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }

        // Caso recursivo
        return base * calcularPotencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente debe ser mayor o igual a 0.");
        } else {
            int resultado = calcularPotencia(base, exponente);

            System.out.println(
                base + "^" + exponente + " = " + resultado
            );
        }

        scanner.close();
    }
}