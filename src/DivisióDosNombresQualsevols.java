import java.util.Scanner;

public class DivisióDosNombresQualsevols {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in);
        System.out.print("Enter A: ");
       float x = input.nextFloat();

       System.out.print("Enter B: ");
        float y = input.nextFloat();

        float resultat = x/y;
        System.out.println("EL RESULTAT DE LA DIVISIÓ DE " +x+ " ENTRE " +y+ " ÉS " +resultat);

    }
}