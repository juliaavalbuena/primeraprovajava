package ARRAYS;

public class ImprimirNombresParellsArrayFunció {
    static void main(String[] args) {
        int[] nombres = {6,7,3,8,4,7,5,0,4,3,8,6,9,5};
       imprimeixNombres(nombres);
    }

    public static void imprimeixNombres(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}


