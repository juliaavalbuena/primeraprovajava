import java.util.Scanner;
public class SumaDosNombresQualsevols {
    public static void main (String[] args){
       Scanner input = new Scanner (System.in);
        System.out.print("Enter A: ");
       int x = input.nextInt();

       System.out.print("Enter B: ");
        int y = input.nextInt();

        int resultat = x + y;
        System.out.println("LA SUMA DE " + x + " I " + y + " ÉS " + resultat);

    }
}