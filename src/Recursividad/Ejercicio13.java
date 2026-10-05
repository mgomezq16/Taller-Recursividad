package Recursividad;

import java.util.Scanner;

public class Ejercicio13 {

    public static int ackermann(int m, int n) {

        // Caso base
        if (m == 0) {
            return n + 1;
        }

        // Segundo caso
        if (n == 0) {
            return ackermann(m - 1, 1);
        }

        // Caso recursivo
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los valores deben ser mayores o iguales a 0.");
        } else {
            int resultado = ackermann(m, n);

            System.out.println(
                "A(" + m + ", " + n + ") = " + resultado
            );
        }

        scanner.close();
    }
}
//Complejidad Algoritmica BigO(A(m,n))