package FUNCIONS;

import java.util.Scanner;

public class CaF {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER TEMP IN ºC : ");
        float a = input.nextFloat();
        float resultat = conversio(a);
        System.out.println("TEMP IN F IS "+resultat);
    }
    public static float conversio (float a){
        return (a*9/5)+32;
    }
}
