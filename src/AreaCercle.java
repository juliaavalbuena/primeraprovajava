import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCercle {

    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER A: ");
        float a = input.nextInt();
        double resultat = PI* a*a;
        System.out.println(resultat);

    }

}
