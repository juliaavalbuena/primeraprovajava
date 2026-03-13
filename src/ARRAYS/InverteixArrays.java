package ARRAYS;

public class InverteixArrays {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 4, 2};
        int[] junta = invertArrays(a);
        printArray(junta);
    }

    public static int[] invertArrays(int[] array) {
        int[] b = new int[array.length];
        for (int i = array.length-1; i >=0; i--) {
            b[array.length - i-1] = array[i];

        }
        return b;
    }

    public static void printArray( int[]llista){
            for (int i = 0; i < llista.length; i++) {
                System.out.printf("%d : %d\n", i, llista[i]);
            }
    }
}

