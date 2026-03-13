package ARRAYS;

import java.util.Scanner;

public class ArrayDesdeUnNombreAUnAltre {
    static void main(String[] args) {
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
        printArray(intervalArray(min, max));
    }

    public static int[] intervalArray(int min, int max) {
        int[] array = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = min + i;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d\n", i, array[i]);
        }

    }
}
