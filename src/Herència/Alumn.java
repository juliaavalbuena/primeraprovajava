package Herència;

public class Alumn extends Persona {
    //Atributs

    char grup;
    int curs;

    public Alumn(String nom, int edat, SEXE sexe, char grup, int curs) {
        super(nom, edat, sexe);
        this.grup = grup;
        this.curs = curs;
    }

    public char getGrup() {
        return grup;
    }

    public void setGrup(char grup) {
        this.grup = grup;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void print(){
        String títol = (sexe== SEXE.DONA)? "N'" : "En ";
        System.out.printf("%s%s té %d anys i és %s. Va a la classe %d%C \n",títol, nom,edat,sexe,curs,grup);
    }

    public void printOverride (boolean b){
        if (b){
            this.print();
        }
        else{
            super.print();
        }
    }
}
