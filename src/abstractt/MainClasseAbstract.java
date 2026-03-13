package abstractt;

public class MainClasseAbstract {
    public static void main(String[] args) {
        //ClasseAbstracte c = new ClasseAbstracte(10);    no podem crear instàncies de classes abstractes
        //c.print();                                      tampoc podem emprar els seus mètodes ni propietats


        //si que podem cfear objectes de subclasses de la classe abstracta
        SubClasseAbs sba = new SubClasseAbs(10,15);
        sba.print();
    }
}
