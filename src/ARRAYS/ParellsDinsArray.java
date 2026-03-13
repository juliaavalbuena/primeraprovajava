package ARRAYS;

public class ParellsDinsArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 4, 2, -5, 4, -7};
        int resultat = trobaParellsArrays(array);
        System.out.println("DINS L'ARRAY HI HA "+resultat+" NOMBRES PARELLS");
    }

    public static int trobaParellsArrays(int[] a) {
        int total= 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                total++;
            }
        }
        return total;
    }
}
