package Recursividad;

public class Factorial {

    public long calcular(int numero) {
        // Caso base
        if (numero == 0) {
            return 1;
        }

        // Caso recursivo
        return numero * calcular(numero - 1);
    }
}