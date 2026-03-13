package operacionsmatemàtiques;

import java.util.Scanner;

public class MCM {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER A: ");
        int a = input.nextInt();
        System.out.print("ENTER B: ");
        int b = input.nextInt();

        int n;
        if (a>b){
            n =a;
        }
        else{
            n=b;
        }
        if ((a%n==0)&&(b% n == 0)) {
            System.out.println(n);}
        else{
            n=n-1;
        }


    }
}
