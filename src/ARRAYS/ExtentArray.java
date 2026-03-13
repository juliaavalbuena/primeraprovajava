package ARRAYS;

public class ExtentArray {
    public static void main(String[] args) {
        int[] array = {3, 6, 5, 4, 2, -5, 4, -7};
        int maxim = maximArrays(array);
        int minim = minimArrays(array);
        int extent = maxim-minim;
        System.out.println("L'EXTENT D'AQUEST ARRAY ÉS DE "+extent);
    }

    public static int maximArrays(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
    public static int minimArrays(int[] aa) {
        int min = aa[0];
        for (int y = 0; y < aa.length; y++) {
            if (aa[y]<min) {
                min=aa[y];
            }
        }
        return min;
    }
}
