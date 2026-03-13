package casting;

public class ArraySuperClasse {
    public static void main(String[] args) {
        Persona [] persones = new Persona[3];
        persones[0]=  new Alumne("Charlie",1);
        persones[1]=  new Profe("Aina","Mates");
        persones[2]=  new Alumne("Joan",2);

        for (int i =0; i<persones.length; i++){
            persones[i].print();
        }
        int totala=0;
        int totalpr=0;
        for (int i =0; i<persones.length; i++){
            if(persones[i] instanceof Alumne) {
                totala++;
            }
            if(persones[i] instanceof Profe) {
                totalpr++;
            }
        }
        System.out.println("\nTotal d'alumnes: "+totala);
        System.out.println("Total de professors: "+totalpr);
    }

    static class Persona{
        String nom;
        public Persona(String nom) {
            this.nom = nom;
        }
        void print(){System.out.println("Persona: "+this.nom);}
    }
    static class Alumne extends ArraySuperClasse.Persona {
        int curs;
        public Alumne (String nom, int curs){
            super(nom);
            this.curs=curs;
        }
        void print(){System.out.println ("Alumne: "+this.nom+", "+this.curs);}
    }
    static class Profe extends ArraySuperClasse.Persona {
        String departament;

        public Profe(String nom, String departament) {
            super(nom);
            this.departament = departament;
        }
        void print(){System.out.println ("Profe: "+this.nom+", "+this.departament);}

    }
}
