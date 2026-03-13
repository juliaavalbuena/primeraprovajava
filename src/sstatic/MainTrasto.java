package sstatic;

public class MainTrasto {
    public static void main() {
        Trasto t = new Trasto("cosa 1");
        String nom = t.nom; //Accés a la propietat (no estàtica)
        t.print(); // Accés al mètode (no estàtic)

        String nomE = Trasto.nomEstatic;
        Trasto.printEstatic();

        Trasto t2 = new Trasto("cosa 2");
        Trasto t3 = new Trasto("cosa 3");

        System.out.println(Trasto.nomEstatic);
        System.out.println(Trasto.numTrastos);
    }
}
