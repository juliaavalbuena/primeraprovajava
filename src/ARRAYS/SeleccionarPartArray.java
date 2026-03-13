package ARRAYS;

import java.util.Scanner;

public class SeleccionarPartArray {
    static void main(String[] args) {
        int []original= {3,5,7,9,7,5};
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A: ");
        int a = input.nextInt();
        System.out.print("ENTER B: ");
        int b = input.nextInt();
        int min;
        int max;
        if(a<b){
            min=a;
            max=b;
        }
        else{
            max=a;
            min=b;
        }
        printArray(subArray(min, max, original));
    }

    public static int[] subArray(int min, int max, int[]original) {
        int[] array = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = original[i+min];
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d\n", i, array[i]);
        }

    }
}
