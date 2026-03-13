package Herència;

public class Profe extends Persona{

    enum DEP {FÍSICA,CATALÀ,EF};
    //Atributs
    int anysDocent;
    DEP dep;

    //Contructor
    public Profe(String nom, int edat, SEXE sexe, int anysDocent, DEP dep) {
        super(nom,edat,sexe);
        this.anysDocent = anysDocent;
        this.dep = dep;
    }

    //Getters i Setters --> no hem de fer els de nom, edat i sexe, ja que s'hereden de l'altre classe

    public int getAnysDocent() {
        return anysDocent;
    }

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public DEP getDep() {
        return dep;
    }

    public void setDep(DEP dep) {
        this.dep = dep;
    }

    //Altres
    public void print(){
        String títol = (sexe== SEXE.DONA)? "N'" : "En ";
        System.out.printf("%s%s té %d anys i és %s. Du %d anys a la docència i treballa al departament de %s \n",títol,nom,edat,sexe,anysDocent,dep);
    }
}
