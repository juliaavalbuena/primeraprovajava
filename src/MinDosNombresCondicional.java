import java.util.Scanner;

public class MinDosNombresCondicional {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT A: ");
        int a = input.nextInt();

        System.out.print("INPUT B: ");
        int b = input.nextInt();

        int min = (a<b)? a : b;
System.out.println("EL MÍNIM ENTRE "+a+" I "+b+ " ÉS "+min );
    }
}
