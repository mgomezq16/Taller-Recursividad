package Recursividad;

import java.util.Scanner;

public class Ejercicio3 {

    public static double calcularSumatoria(int numero) {
        // Caso base
        if (numero == 1) {
            return 1;
        }

        // Caso recursivo
        return (1.0 / numero) + calcularSumatoria(numero - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            double resultado = calcularSumatoria(numero);

            System.out.println(
                "La sumatoria hasta " + numero + " es: " + resultado
            );
        }

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(n)