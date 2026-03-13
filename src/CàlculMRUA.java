import java.util.Scanner;
//NO ESTA ACABAT EL PROGRAMA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class CàlculMRUA {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER X0: ");
        float X0 = input.nextFloat();
        System.out.print("ENTER V: ");
        float V = input.nextFloat();
        System.out.print("ENTER t: ");
        float t = input.nextFloat();
       float resultat = X0+V*t;
                System.out.println("LA POSICIÓ FINAL ÉS: " +resultat);
}
    }