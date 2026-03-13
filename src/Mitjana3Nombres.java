import java.util.Scanner;

public class Mitjana3Nombres {
        public static void main (String[] args){
            Scanner input = new Scanner (System.in);
            System.out.print("ENTER A: ");
            int a = input.nextInt();
            System.out.print("ENTER B: ");
            int b = input.nextInt();
            System.out.print("ENTER C: ");
            int c = input.nextInt();
            float resultat = (a+b+c)/3f;
                    System. out.println(resultat);

        }

}
