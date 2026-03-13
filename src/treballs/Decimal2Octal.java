package treballs;

import java.util.Scanner;

public class Decimal2Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el nombre en decimal: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        int nb = 0;
        int pot = 1;

        while (nd != 0) {
            int r = nd % 8;
            nd = nd / 8;
            nb = nb+r * pot ;
            pot = 10* pot;
        }
        System.out.println("El nombre " + nd2 + " en octal és: " + nb);
    }
}
