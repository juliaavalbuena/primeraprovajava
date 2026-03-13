package ARRAYS;

public class TempArray {
    public static void main(String []args){
        int [] a = {3,6,5,4,2};
        int [] b = copiaArray(a);
        printArray(b);
    }
    public static int [] copiaArray(int[]original){
        int[] array = new int [original.length];
        for(int i=0; i< array.length; i++){
            array [i] = original [i];
        }
        return array;
    }
    public static void printArray (int[]array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d\n", i, array[i]);
        }
    }
}
