package poo;

public class MainPunt2D {
    public static void main(String[] args) {
        Punt2D p1,p2;

        p1=new Punt2D('0');
        p2=new Punt2D('A',200,100);

        p1.print();

        p1.setX(50);
        p1.setY(300);
        p1.print();

        p2.setNom('B');
        p2.print();
    }
}
