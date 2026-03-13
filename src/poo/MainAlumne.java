package poo;

public class MainAlumne {
    public static void main(String[] args) {

        // DECLARACIÓ

        alumne a1,a2,a3;

        //INSTANCIACIÓ

        a1=new alumne("Josep",4,'D');
        a2 = new alumne ("Pedro");

        //USAR MÈTODES DE LA CLASSE ALUMNE

        a1.print();
        a1.setNom("Carles");
        a1.setGrup('F');
        a1.print();

        System.out.println ("ALUMNES: " +a1.getNom()+", "+a2.getNom());


    }

}
