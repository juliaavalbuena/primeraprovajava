package Herència;

public class Persona {
    //tipus enumerat (va abans que els atributs)
    enum SEXE {HOME,DONA,ALTRE};

    //Atributs
    String nom;
    int edat;
    SEXE sexe;

    //Constructor
    public Persona(String nom, int edat, SEXE sexe){
        this.nom=nom;
        this.edat=edat;
        this.sexe=sexe;
    }

    //Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    //Getters

    public SEXE getSexe() {
        return sexe;
    }

    public int getEdat() {
        return edat;
    }

    public String getNom() {
        return nom;
    }

    //Altres
    public void print(){
        String títol = (sexe== SEXE.DONA)? "N'" : "En ";
        System.out.printf("%s%s té %d anys i és %s. \n",títol, nom,edat,sexe);
    }
}
