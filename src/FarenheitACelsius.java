import java.util.Scanner;

public class FarenheitACelsius {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER A: ");
        float a = input.nextFloat();
        float b = 5f/9;
        float resultat = b * (a-32);
                System.out.println(resultat);
}
    }