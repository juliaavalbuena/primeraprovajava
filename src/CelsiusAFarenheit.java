import java.util.Scanner;

public class CelsiusAFarenheit {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER A: ");
        float a = input.nextFloat();
        float b = 9f/5;
        float resultat = a*b + 32;
                System.out.println(resultat);
}
    }