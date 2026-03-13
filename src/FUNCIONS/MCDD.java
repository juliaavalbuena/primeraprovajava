package FUNCIONS;

import java.util.Scanner;

public class MCDD {
    public static void main() {
        int m;
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER A : ");
        int x = input.nextInt();
        System.out.println("ENTER B : ");
        int y = input.nextInt();
        int maximcd = (int)mcd(x,y);
        System.out.println("MCD OF "+x+" AND "+y+" IS "+maximcd);
    }
    public static int mcd(int x,int y){
        int m = (x<y) ? x : y;
        while(x%m!=0 || y%m!=0){
            m--;
        }
        return m;

    }
}
