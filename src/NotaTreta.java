import java.util.Scanner;

public class NotaTreta {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quina nota has tret?");
        int nota = input.nextInt();
        switch (nota) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 : System.out.println("HAS SUSPÈS");break;
            case 5 : System.out.println("APROVAT");break;
            case 6 : System.out.println("BÉ");break;
            case 7 : System.out.println("NOTABLE");break;
            case 8 : System.out.println("NOTABLE");break;
            case 9 : System.out.println("EXCEL·LENT");break;
            case 10 : System.out.println("EXCEL·LENT"); break;
            default: System.out.println("VALOR INCORRECTE");
        }



        }
    }

