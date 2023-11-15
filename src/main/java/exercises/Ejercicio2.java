/*
2. Para este ejercicio se utiliza una matriz de números enteros (matriz
bidimensional).

a. (0,75p) Crea una función para contar todos los elementos pares de la matriz.

b. (0,75p) Crea una función para devolver el número par y la posición de todos
los elementos pares.

c. (0,50p) Crea la clase y la función principal para mostrar una salida como la
mostrado a continuación.

1 3 0
5 3 5
4 9 6
8 7 4
El recuento de todos los elementos pares es: 5
Hay un numero par 0 en la fila 0 col 2
Hay un numero par 4 en la fila 2 col 0
Incluso el número 6 está en la fila 2, columna 2.
Hay un numero par 8 en la fila 3 col 0
Allí incluso el número 4 está en la fila 3 col 2
 */

package exercises;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] enteros = {{1, 3, 0}, {5, 3, 5}, {4, 9, 6}, {8, 7, 4}};

        verMatriz(enteros);
        System.out.println();

        int contador = contarPares(enteros);
        System.out.println("El recuento de todos los elementos pares es: " + contador);

        System.out.println();
        mostrarPares(enteros);

    }

    public static void verMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int contarPares(int[][] matriz) {
        int contador = 0;

        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (ints[j] % 2 == 0) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void mostrarPares(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] % 2 == 0) {
                    System.out.println("Hay un numero par " + matriz[i][j] + " en la fila " + i + " col " + j);
                }
            }
        }

    }
}
