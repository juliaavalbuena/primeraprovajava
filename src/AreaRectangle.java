import java.util.Scanner;

public class AreaRectangle {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in);
        System.out.print("Enter A (cm): ");
       float x = input.nextFloat();

       System.out.print("Enter B (cm): ");
        float y = input.nextFloat();

        float resultat = x*y;
        System.out.println("L'ÀREA D'AQUEST RECTANGLE DE COSTAT A: " +x+ "cm ,I COSTAT B: " +y+ "cm ÉS DE " +resultat+ "cm");



    }
}