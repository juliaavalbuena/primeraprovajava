package ARRAYS;

public class NomsDescendent {
    static void main(String[]args) {
        String[]noms={"PERE","MARIA","JOAN","PEDRO","JAVI","LLUÏSA","CARLES","MARGA","FRANCINA"};
        for(int i=noms.length-1; i>=0; i--){
            System.out.printf("CASELLA %d: %s.%n", i, noms[i]);
        }
    }
}
