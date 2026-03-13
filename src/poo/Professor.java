package poo;

public class Professor {
    String nom;
    int edat;
    String dept;

    Professor(String nom, int edat, String dept){
        this.nom = nom;
        this.edat = edat;
        this.dept = dept;
    }

    public String getNom (){return this.nom;}
    public String getDept (){return this.dept;}
    public int getEdat (){return this.edat;}

    public void setNom (String nom){this.nom=nom;}
    public void setDept (String dept){this.dept=dept;}
    public void setEdat(int edat){this.edat=edat;}

    public void print (){
        System.out.printf("%s de %s té %d anys \n",nom,dept,edat);
    }

}
