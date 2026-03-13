import java.util.Scanner;

public class MaxDosNombresIfElse {
    public static void main(String[] args) {

        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT A");
        int a = input.nextInt();

        System.out.print("INPUT B");
        int b = input.nextInt();

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("El nombre més gran entre " + a + " i " + b + " és " + max);
    }
}
