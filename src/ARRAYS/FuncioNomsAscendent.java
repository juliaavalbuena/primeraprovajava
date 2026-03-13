package ARRAYS;

public class FuncioNomsAscendent {
    static void main(String[] args) {
        String[] noms = {"PERE", "MARIA", "JOAN", "PEDRO", "JAVI", "LLUÏSA", "CARLES", "MARGA", "FRANCINA"};
        String[] codis = {"oiwev", "keic", "idds", "jeiohv"};
        imprimirArray(noms);
        imprimirArray(codis);
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%n", array[i]);
        }
    }
}
