package bucles;

public class MúltiplesDe3Entre33i12 {
    static void main(String[] args) {
        for( int index=33; index>=12; index--) {
            if (index % 3!=0) {continue;}
            System.out.println(index);
        }
    }
}
