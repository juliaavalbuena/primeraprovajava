package bucles;

public class ImparellsEntre1i13 {
    static void main(String[] args) {
        for( int index=1; index<=13; index++){
            if (index % 2==0) {continue;}
            System.out.println(index);
        }
    }
}
