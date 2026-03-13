package treballs;

import java.util.Scanner;

public class BinariADecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el nombre en binari: ");
        int nb2 = input.nextInt();
        int nb = nb2;
        int nd = 0;
        int pot = 1;

        while (nb != 0) {
            int r = nb % 10;
            nb = nb / 10;
            nd = r * pot + nd;
            pot = 2 * pot;
        }
        System.out.println("El nombre " + nb2 + " en decimal és: " + nd);
    }
}
