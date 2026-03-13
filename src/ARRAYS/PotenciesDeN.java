package ARRAYS;

public class PotenciesDeN {
    static void main(String[] args) {
        int b = 2;
        int n = 5;
        printArray(trobaPotencies(b, n));
    }

    public static int[] trobaPotencies(int base, int caselles) {
        int[] array = new int[caselles];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(base, i);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }

}
