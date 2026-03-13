package sstatic;

public class Trasto {
    String nom; //propietat - atribut de la classe (no estàtic)
    static String nomEstatic; //propietat - atribut de la classe (estàtic)
    static int numTrastos =0;
    public Trasto(String n){
        this.nom = n;
        Trasto.nomEstatic = n;
        Trasto.numTrastos++;
    }

    public String getNom(){
        return this.nom;
    }

    //mètode de la classe (no estàtic)
    public void print(){
        System.out.println(this.nom);
    }


    public static void printEstatic(){
        System.out.println("TRASTO");
    }
}
