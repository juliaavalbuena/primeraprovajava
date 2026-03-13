package ARRAYS;

public class Suma2Arrays {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 4, 2};
        int[] b = {3, 6, 5, 4, 2};
        int []suma;
        suma=sumaArray(a,b);
        printArray(suma);
    }

    public static int[] sumaArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
    public static void printArray (int[]array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }
}
