package ARRAYS;

public class MàximDinsArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 4, 2, -5, 4, -7};
        int resultat = maximArrays(array);
        System.out.println("EL MÀXIM D'AQUEST ARRAY ÉS "+resultat);
    }

    public static int maximArrays(int[] a) {
        int max = -9999999;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
}
