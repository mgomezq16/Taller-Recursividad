# Taller de Recursividad

**Nombre del estudiante:** María de los Ángeles Gómez  

## Descripción

Este repositorio contiene el taller de recursividad, compuesto por 14 ejercicios en total desarrollados en Java.

Los ejercicios aplican funciones recursivas para resolver problemas como factorial, sumatorias, inversión de números, suma de dígitos, potencia, máximo común divisor, división y multiplicación mediante operaciones sucesivas, operaciones con arreglos y matrices, serie de Fibonacci y función de Ackermann.

## Estructura del proyecto

Taller-Recursividad/
│
├── src/
│   └── Recursividad/
│       ├── Ejercicio1.java
│       ├── Ejercicio2.java
│       ├── Ejercicio3.java
│       ├── Ejercicio4.java
│       ├── Ejercicio5.java
│       ├── Ejercicio6.java
│       ├── Ejercicio7.java
│       ├── Ejercicio8.java
│       ├── Ejercicio8Cadena.java
│       ├── Ejercicio9.java
│       ├── Ejercicio10.java
│       ├── Ejercicio11.java
│       ├── Ejercicio12.java
│       └── Ejercicio13.java
│
├── .gitignore
└── README.md

## Requisitos

- Java JDK instalado.
- Visual Studio Code

## Instrucciones para ejecutar

1. Clonar o descargar este repositorio.
2. Abrir una terminal en la carpeta principal `Taller-Recursividad`.
3. Crear la carpeta para los archivos compilados:

mkdir bin
4. Compilar todos los ejercicios:

javac -d bin src/Recursividad/*.java

5. Ejecutar el ejercicio que se necesite. Por ejemplo, para ejecutar el ejercicio 7:

java -cp bin Recursividad.Ejercicio7

Para ejecutar otro ejercicio, se cambia el número de la clase. Por ejemplo:

java -cp bin Recursividad.Ejercicio1
java -cp bin Recursividad.Ejercicio2
java -cp bin Recursividad.Ejercicio3


## Ejercicios

1. Factorial de un número.
2. Sumatoria hasta un número.
3. Sumatoria de la serie `1 + 1/2 + 1/3 + ... + 1/n`.
4. Inversión de un número.
5. Suma de los dígitos de un número.
6. Potencia mediante recursividad.
7. Máximo común divisor mediante el algoritmo de Euclides.
8. Cociente de una división mediante restas sucesivas.
8. Acerca de copiar una cadena. (Este lo coloque en este espacio porque me estaba guiando con los ejercicios del comentario de Classroom y no con el documento, al ingresar al documento me encontré que en el ejercicio 8 que en el comentario estaba enumerado con otro problema estaba este ejercicio, por ende solo lo agregué con el mismo número porque tenía ya realizado todos los ejercicios)
9. Multiplicación mediante sumas sucesivas.
10. Suma de los elementos de un arreglo.
11. Suma de los elementos de una matriz.
12. Serie de Fibonacci.
13. Función de Ackermann.
