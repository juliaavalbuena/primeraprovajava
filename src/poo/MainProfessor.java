package poo;

public class MainProfessor {
    public static void main(String[] args) {
        Professor p1,p2;

        p1= new Professor("Joan",35,"Física");
        p2= new Professor ("Carme", 25, "Gestió Empresarial");

        p1.print();
        p1.setEdat(67);
        p1.print();
        p2.print();

    }
}
