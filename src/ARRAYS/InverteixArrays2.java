package ARRAYS;
//instruccions
public class InverteixArrays2 {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 4, 2};
        invertArrays(a);
        printArray(a);
    }
//invertir
    public static void invertArrays(int[] array) {
        for(int i=0; i<array.length/2;i++){
            int x = array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=x;
        }
    }
//imprimir
    public static void printArray( int[]llista){
        for (int i = 0; i < llista.length; i++){
                System.out.printf("%d : %d\n", i, llista[i]);
        }
    }
}

