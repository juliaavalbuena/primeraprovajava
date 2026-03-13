package FUNCIONS;

import java.util.Scanner;

public class PerímetreRectangle {
    static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("ENTER A (m): ");
        float x = input.nextFloat();

        System.out.println("ENTER B (m): ");
        float y = input.nextFloat();

        float perimetre= perimetreRectangle(x,y);
        System.out.println("El perímetre del rectangle en metres és de "+perimetre+"m");
    }
    public static float perimetreRectangle(float a,float b){
        float peri=2*a+2*b;
        return peri;
    }
}
