package abstractt;

public class SubClasseAbs extends ClasseAbstracte {

    int y;

    SubClasseAbs(int x,int y) {
        super(x);
        this.y=y;
    }

    void print(){
        System.out.println(x+", "+y);
    }
}
