package ARRAYS;

public class PositiusDinsArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 4, 2, -5, 4, -7};
        int resultat = trobaPositiusArrays(array);
        System.out.println("DINS L'ARRAY HI HA "+resultat+" NOMBRES POSITIUS");
    }

    public static int trobaPositiusArrays(int[] a) {
        int total= 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                total++;
            }
        }
        return total;
    }
}
