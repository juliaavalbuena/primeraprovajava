package operacionsmatemàtiques;

public class Basics {
    static void main(String[] args) {

        //Potencia (2 (base) elevat a 4 (exponent))
        double x = Math.pow(2, 4);
        int z = (int) Math.pow(2, 4);
        System.out.println(x + "," + z);

        //Arrel quadrada
        double y = Math.sqrt(16);
        System.out.println(y);

        //Constant PI
        int r = 3;
        double ac = Math.PI * Math.pow(r, r);
        System.out.println(ac);

        //Nombre arrodonit
        int nota = (int) Math.round(4.5);
        System.out.println(nota);

        //Nombre Aleatori entre 10 i 50
        int j = (int) (10 + Math.random() * 40);
        System.out.println(j);
    }
}
