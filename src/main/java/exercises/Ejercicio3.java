/*
3. Búsqueda binaria.

    a. (1,00p) Crea una función para ordenar una matriz bidimensional de personas
    con su altura (ver anexo) y ordenarlo por nombre. Recuerde implementar
    también la función de intercambio. Utilice este encabezado:

        public static void bubble(String[][] array)

    b. (1,00p) Crea una función eficiente para encontrar una persona por su
    nombre, solo el primero persona encontrada, en una matriz ordenada. Puedes
    resolver este ejercicio de forma recursiva (puedes usar una función auxiliar)
    o de forma iterativa:

        private static String search(String[][] array, float height)

    Resultado Esperado:
        Nombre de la persona: Carl
        Altura encontrada: 1,62
 */

package exercises;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[][] personas = {{"RAMON", "1,81"}, {"LUCIA", "1,67"}, {"ALEX", "1,98"},
                {"PEDRO", "1,29"}, {"MIRIAM", "1,71"}};

        bubble(personas);
        Ejercicio1.verMatriz(personas);

        System.out.println();
        System.out.print("Nombre de la persona: ");
        String persona = search(personas,);
        System.out.println(persona);

    }

    public static void bubble(String[][] array) {
        int i, j;
        for (i = 1; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j][0].compareTo(array[j + 1][0]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(String[][] matriz, int x, int y) {
        String aux = matriz[x][0];
        matriz[x][0] = matriz[y][0];
        matriz[y][0] = aux;

        String aux2 = matriz[x][1];
        matriz[x][1] = matriz[y][1];
        matriz[y][1] = aux2;
    }

    private static String search(String[][] array, float height) {
        int i = 0;
        String result = null;

        while (result == null && i < array.length) {
            // Supongamos que la altura está representada en la posición 0 de cada subarray
            float currentHeight = Float.parseFloat(array[i][0]);
            if (currentHeight == height)
                result = array[i][1]; // Supongamos que la cadena que deseas devolver está en la posición 1
            i++;
        }

        return result;
    }



    /*
    public static void bubble(int[] array) {
        int i, j;
        for (i = 1; i < array.length; i++)
            for(j = 0; j < array.length - 1; j++)
                if(array[j]>array[j+1])
                    swap(array, j, j + 1);
}

     */

    /*
    public static void swap(String[] array, int i, int j){
        String aux = array[j];
        array[j] = array[i];
        array[i] = aux;
    }
     */

    /*
    public static int search(int[] array, int num){
        int i = 0,position=-1;
        while(position==-1 && i<array.length){
            if(array[i]==num)
                position=i;
            i++;
        }
        return position;
    }
     */

}
