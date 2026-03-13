package ARRAYS;

public class NomsAscendent {
    static void main(String[]args) {
        String[]noms={"PERE","MARIA","JOAN","PEDRO","JAVI","LLUÏSA","CARLES","MARGA","FRANCINA"};
        for(int i=0; i<noms.length; i++){
            System.out.printf("CASELLA %d: %s.%n", i, noms[i]);
        }
    }
}
