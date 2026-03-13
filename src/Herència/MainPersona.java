package Herència;

public class MainPersona {
    public static void main(String[] args) {
        Persona p,p2,p3;
        p= new Persona("Àngela",16, Persona.SEXE.DONA);
        p2= new Profe ("Pere", 35, Persona.SEXE.HOME, 6, Profe.DEP.EF);
        Alumn a3 = new Alumn ("Aina",15,Persona.SEXE.DONA,'f',3);
        jugadorFutbol x = new jugadorFutbol("MESSI",34, Persona.SEXE.HOME, "FCB", 67, jugadorFutbol.POS.ALA);
        p.print();
        p2.print();
        a3.printOverride(true);
        a3.printOverride(false);
        a3.print();
        x.printOverride(true);
        x.printOverride(false);

    }
}
