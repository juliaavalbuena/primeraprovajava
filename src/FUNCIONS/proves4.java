package FUNCIONS;

public class proves4 {
    public static void main(String[] args) {
        int x= sumaDosNombres(5,10);
        int y= sumaDosNombres(x,15);
        System.out.println (y);

    }

    static int sumaDosNombres(int a,int b){
        int suma=a+b;
        return suma;
    }
}
