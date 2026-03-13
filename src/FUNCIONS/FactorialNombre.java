package FUNCIONS;

import java.util.Scanner;

public class FactorialNombre {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER NUMBER: ");
        int a = input.nextInt();
        int resultat = factorial(a);
        System.out.println("FACTORIAL DEL NOMBRE "+a+" ÉS "+resultat);
    }
    public static int factorial(int a){
       int x = a;
        int f =1;
       while (x>1){
           f=f*x;
           x=x-1;
       }
        return f;
    }
}
