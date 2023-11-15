/*
4. (2,00p) Crea un programa con al menos tres funciones. Una función será la principal.
función. Otra será una función para llenar una matriz entera con números aleatorios.
dentro de un rango solicitado (el límite inferior y superior serán solicitados al usuario). El
La dimensión de la matriz (número de filas y columnas) también se solicitará al usuario.
Y finalmente, una función para llenar un vector con todos los números pares de la matriz sin
repetición.

    Dame el numero de filas:
    5
    Dame el número de columnas:
    4
    Dame el límite aleatorio inferior:
    0
    Dame el límite aleatorio superior:
    73

    Ejemplo de la matriz esperada:
    [{25,13,11,73},
    {10,11,12,12},
    {15,4,10,30},
    {30,55,69,33},
    {40,41,49,40}]

    La matriz devuelta contendrá: [10, 12, 4, 30, 40]
 */

package exercises;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Dame el numero de filas: ");
        int filas = sc.nextInt();

        System.out.print("Dame el numero de columnas: ");
        int columnas = sc.nextInt();

        System.out.print("Dame el límite aleatorio inferior: ");
        int limiteInferior = sc.nextInt();

        System.out.print("Dame el límite aleatorio superior: ");
        int limiteSuperior = sc.nextInt();

        int[][] enteros = new int[filas][columnas];

        rellenarMatriz(enteros, limiteInferior, limiteSuperior);
        Ejercicio2.verMatriz(enteros);
    }

    public static void rellenarMatriz(int[][] enteros, int limiteInferior, int limiteSuperior) {
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[0].length; j++) {
                enteros[i][j] = (int) (Math.random() * (limiteSuperior - 1) + limiteInferior);
            }
        }
    }
}
