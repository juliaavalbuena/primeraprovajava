package casting;

public class ExempleCasting {
    public static void main(String []args){
        Persona persona = new Persona ("Paco");
        Alumne alumne = new Alumne("Bel", 2);
        Profe profe = new Profe ("Toni","Informàtica");

        persona = alumne;
        System.out.println(persona.nom);

        //Casting ascendent
        Alumne alumne2 = (Alumne)persona;
        System.out.println(alumne2.curs);

        //Casting descendent
        persona = alumne;
    }
    static class Persona{
        String nom;
        public Persona(String nom) {
            this.nom = nom;
        }
    }
    static class Alumne extends Persona{
        int curs;
        public Alumne (String nom, int curs){
            super(nom);
            this.curs=curs;
        }
    }
    static class Profe extends Persona{
        String departament;
        public Profe(String nom, String departament){
            super(nom);
            this.departament=departament;
        }
    }
}
