package ARRAYS;

public class SumaMitjanaCasellesFunció {
    static void main(String[] args) {
        int[] nombres = {7, 8, 5, 6, 8, 9, 10, 4, 5, 8,6};
        int resultat2 = sumaAarray(nombres);
        float resultat3 = mitjanaAarray(nombres);
        System.out.println("EL RESULTAT DE LA SUMA ÉS: " + resultat2);
        System.out.println("LA MITJANA ÉS DE : " + resultat3);
    }

    public static int sumaAarray(int[] array) {
        int resultat = 0;
        for (int i = 0; i < array.length; i++) {
            resultat = resultat + array[i];
        }
        return resultat;
    }

    public static float mitjanaAarray(int[] array) {
        float resultat1 = 0;
        for (int i = 0; i < array.length; i++) {
            resultat1 = resultat1 + array[i];
        }
        return resultat1 / array.length;
    }
}
