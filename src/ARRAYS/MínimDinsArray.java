package ARRAYS;

public class MínimDinsArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 4, 2, -5, 4, -7};
        int resultat = minimArrays(array);
        System.out.println("EL MÍNIM D'AQUEST ARRAY ÉS "+resultat);
    }

    public static int minimArrays(int[] a) {
        int min = 9999999;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        return min;
    }
}
