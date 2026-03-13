package FUNCIONS;

import java.util.Scanner;

public class Mínim2Nombres {
    public static void main() {
        int m;
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER A : ");
        int x = input.nextInt();
        System.out.println("ENTER B : ");
        int y = input.nextInt();
        int min = (int)minim2nombres(x,y);
        System.out.println("EL NOMBRE MÉS PETIT ENTRE "+x+" I "+y+" ÉS: "+min);
    }
    public static int minim2nombres(int x,int y){
        int m = (x<y) ? x : y;
        return m;
    }
}
