package ARRAYS;

public class ContarNombresParellsArrayFunció {
    static void main(String[] args) {
        int[] nombres = {6,7,3,8,4,7,5,0,4,3,8,6,9,5};
       int r=ContarNombres(nombres);
       System.out.println("L'ARRAY TÉ "+r+" NOMBRES PARELLS");
    }

    public static int ContarNombres(int[] array) {
        int cont=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
               cont++;
            }
        }
        return cont;
    }
}


