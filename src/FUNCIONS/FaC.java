package FUNCIONS;

import java.util.Scanner;

public class FaC {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER TEMP IN F : ");
        float a = input.nextFloat();
        float resultat = conversio(a);
        System.out.println("TEMP IN ºC IS "+resultat);
    }
    public static float conversio (float a){
        return (a-32)*5/9;
    }
}
