package bucles;

import java.util.Scanner;

public class SumaFinsA0 {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float suma=0;
        do{
            System.out.println("NÚMERO: ");
            float n = input.nextFloat();
            if(n==0){break;}
            suma+=n;
        }while (true);
        System.out.println("EL RESULTAT DE LA SUMA ÉS: "+suma);
    }
}
