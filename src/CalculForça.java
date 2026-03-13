import java.util.Scanner;

public class CalculForça {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER m: ");
        float m = input.nextFloat();
        System.out.print("ENTER a: ");
        float a = input.nextFloat();
       float resultat = m*a;
                System.out.println("LA FORÇA ÉS DE " +resultat+ "N");
}
    }