package treballs;

import java.util.Scanner;

public class Decimal2Hexagesimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el nombre en decimal: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        String nb = "";
        int pot = 1;

        while (nd != 0) {
            int r = nd % 16;
            nd = nd / 16;
            String c = "";
            if (r<10) {
               c = String.valueOf(r);
            }
            else if (r==10){
                c = "A";
            } else if (r==11){
                c = "B";
            } else if (r==12){
                c = "C";
            } else if (r==13){
                c = "D";
            } else if (r==14) {
                c = "E ";
            } else if (r==15) {
                c = "F ";
            }
            nb = nb + c;
        }
        System.out.println("El nombre " + nd2 + " en octal és: " + nb);
    }
}
