package FUNCIONS;

import java.util.Scanner;

public class AreaCercle {
    //A = PI * d2 / 4
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("QUIN ÉS EL DIÀMETRE? ");
        float a = input.nextFloat();
      float resultat=  areaCalcular(a);
      System.out.println("L'ÀREA DEL CERCLE AMB DIÀMETRE "+a+" ÉS DE "+resultat);
    }
    public static float areaCalcular(float x) {
       return (float) (Math.PI * (x * x) / 4);
    }
}
