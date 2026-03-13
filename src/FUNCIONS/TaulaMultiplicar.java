package FUNCIONS;

import java.util.Scanner;

public class TaulaMultiplicar {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("DE QUIN NOMBRE VOLS SABER LA TAULA DE MULTIPLICAR? ");
        int a = input.nextInt();
        taulaMultiplicar(a);
    }
    public static void taulaMultiplicar(int a){
        int nombre=a;
        for(int multiplicador=1; multiplicador<=10;multiplicador++){
            int resultat=multiplicador*nombre;
            System.out.println(nombre+" x "+multiplicador+" = "+resultat);
        }
    }
}
