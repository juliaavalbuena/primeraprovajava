package ARRAYS;

public class SumaMitjanaCaselles {
    static void main(String[]args) {
        int[]nombres={7,8,5,6,8,9,10,4,5,8};
        int resultat = 0;
        for(int i=0; i<nombres.length; i++){
            resultat = resultat+nombres[i];
        }
        System.out.println("EL RESULTAT DE LA SUMA ÉS: "+resultat);
        System.out.println("LA MITJANA ÉS DE : "+resultat/ nombres.length);
    }
}
