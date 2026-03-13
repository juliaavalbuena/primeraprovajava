package FUNCIONS;

import java.util.Scanner;

public class ValorAbsolut {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("ENTER NUMBER : ");
        int x = input.nextInt();

        int resultat = valorabsolut(x);
        System.out.println("EL VALOR ABSOLUT DE "+x+" ÉS "+resultat);
    }
    public static int valorabsolut(int x){
       int sol;
        if (x>=0) {
            sol = x;
        }
        else{
            sol = x*-1;
        }
        return sol;
    }
}
