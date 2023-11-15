/*
1. El objetivo de este ejercicio es gestionar una matriz de Strings (String[][]).

    a. (0,40p) Cree una clase java que tenga una función para llenar una matriz
    bidimensional de cadenas. El tamaño de fila y columna se solicitará al
    usuario. El contenido de cada elemento será el número de fila seguido del
    número de columna.

    b. (0,40p) Agregue una función para imprimir la matriz como se muestra en la
    parte a de este ejercicio.

    c. (0,40p) Agregue una función para devolver la suma de todos los números en
    el vector.

    d. (0,40p) Agrega una función para devolver el promedio.

    e. (0,40p) Crea la función principal para mostrar el resultado que debería
    ser como:

Dame el numero de filas:
5
Dame el número de columnas:
4
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
40 41 42 43
La suma es: 430
La media es: 21,50

 */

package exercises;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int filas, columnas;

        System.out.print("Dame el numero de filas: ");
        filas = sc.nextInt();
        System.out.print("Dame el numero de columnas: ");
        columnas = sc.nextInt();

        String[][] cadenas = new String[filas][columnas];
        System.out.println();

        rellenarMatriz(cadenas);
        verMatriz(cadenas);
        System.out.println();

        int suma = sumaVector(cadenas);
        System.out.println("La suma es: " + suma);

        double media = mediaVector(cadenas);
        System.out.println("La media es: " + media);
    }

    public static void rellenarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = String.valueOf(i) + j;
            }
        }
    }

    public static void verMatriz(String[][] matriz) {
        for (String[] strings : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumaVector(String[][] matriz) {

        int suma = 0;

        for (String[] strings : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += Integer.parseInt(strings[j]);
            }
        }

        return suma;
    }

    public static double mediaVector(String[][] matriz) {
        return (double) sumaVector(matriz) / (matriz.length * matriz[0].length);
    }
}
