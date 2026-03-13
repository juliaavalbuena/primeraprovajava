import java.util.Scanner;

public class PorterDiscoteca {
   public static void main (String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("Quants d'anys tens?");
       int edat = input.nextInt();

       if (edat >= 18) {
           System.out.println("Benvingut a la discoteca!");
       }
       else {
           System.out.println ("Els menors no poden entrar a la discoteca");
       }
   }
}