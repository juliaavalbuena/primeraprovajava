package poo;

public class alumne {

    // 1- Atributs o propietats (variables)

    String nom;
    int curs;
    char grup;

    // 2- Mètode(s) constructor(s)

    alumne(String n, int c, char g){
        nom = n;
        curs = c;
        grup = g;
    }

    alumne (String n){
        nom = n;
        curs = 1;
        grup = 'A';
    }

    // 3- Getters (accesores)

    public String getNom() {
        return nom;
    }

    public int getCurs() {
        return curs;
    }

    public char getGrup() {
        return grup;
    }

    // 4- Mètodes Setters (mutadores)

    public void setNom (String nom){this.nom = nom;}
    public void setCurs (int curs){this.curs = curs;}
    public void setGrup (char grup){this.grup = grup;}

    // 5- ALtres mètodes

    public void print (){
        System.out.printf("%s va a %d - %c.\n",nom,curs,grup);
    }

}
